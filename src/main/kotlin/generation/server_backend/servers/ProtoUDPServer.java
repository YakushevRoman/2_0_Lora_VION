package generation.server_backend.servers;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Message;
import generation.server_backend.proto_loggers.LogType;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class ProtoUDPServer extends ProtoServer {
    private static final int SEND_BUFFER_SIZE_DEF = 2048;
    private static final int RECEIVE_BUFFER_SIZE_DEF = 2048;
    private static final int RECEIVE_BUFFER_SIZE_MAX = 16384;

    private static final int MAX_SEND_DADAGRAM_SIZE = 512;
    private static final int MAX_RECV_DADAGRAM_SIZE = 1500;

    private static final int SYN_CONFIRM_TIMEOUT_MS = 1500;
    private static final int IDLE_DISCON_TIMEOUT_MS = 60000;

    private static final int ASK_SEND_TIMEOUT = 60;
    private static final int PACKET_RESEND_TIMEOUT = 100;
    private static final int PACKET_SEND_TIMEOUT = 5;
    private static final int UDP_HDEADER_SIZE = 5;

    private static final byte F_SYN = (1);
    private static final byte F_ACK = (1 << 1);
    private static final byte F_DAT = (1 << 2);
    private static final byte F_RST = (1 << 3);

    int mPort;
    Selector mSelector;
    DatagramChannel mChannel;
    ByteBuffer mRecvBuffer;
    ByteBuffer mEmptyPacketBuffer;
    Random mRandom = new Random();
    int mLastConnectionId;

    private final HashMap<SocketAddress, ProtoConnection> connections = new HashMap<>();

    public ProtoUDPServer(int port) {
        this.mPort = port;
        this.mRecvBuffer = ByteBuffer.allocate(MAX_RECV_DADAGRAM_SIZE);
        this.mEmptyPacketBuffer = ByteBuffer.allocate(5);
    }

    private class ProtoConnection implements ProtoServer.Connection, ProtoCmdParser.CommandReceiver {
        SocketAddress mAddress;
        ByteBuffer mSendBuffer;
        ProtoCmdParser mParser;
        int mConnectionId;
        Object mApi;
        LogWriter mLogWriter;

        //int mState; //0 - connecting^ SYN sent waiting for first data, 1- established: SYN confirm received
        boolean mConnected;
        boolean mDisconnected;
        boolean mAckSendNeeded;
        long mTimeout;

        long mDisconnectTimeout;
        long mResendTimeout;

        short mClientSeq;
        short mServerSeq;
        int mSendUnconfirmedSize;

        ProtoConnection(SocketAddress address, short clientSeq) {
            this.mAddress = address;
            mConnectionId = ++mLastConnectionId;
            mClientSeq = clientSeq;
            mServerSeq = (short) mRandom.nextInt(0x10000);
            mSendUnconfirmedSize = 0;

            mTimeout = Long.MAX_VALUE;
            mDisconnectTimeout = Long.MAX_VALUE;
            mResendTimeout = Long.MAX_VALUE;

            mParser = new ProtoCmdParser(this, RECEIVE_BUFFER_SIZE_DEF, RECEIVE_BUFFER_SIZE_MAX);
            mSendBuffer = ByteBuffer.allocate(UDP_HDEADER_SIZE + SEND_BUFFER_SIZE_DEF);
            mSendBuffer.position(UDP_HDEADER_SIZE);
            mSendBuffer = mSendBuffer.slice();

            LogFactory factory = getLogFactory();
            if (factory != null) {
                mLogWriter = factory.openConnectionLog(address);
                mParser.setLogger(mLogWriter);
                mLogWriter.writeLine("New UDP connection from " + address.toString());
            }
        }

        void updateTimeout() {
            mTimeout = Math.min(mResendTimeout, mDisconnectTimeout);
        }

        void putIncomingData(byte[] data, int offset, int length) {
            try {
                mParser.putData(data, offset, length);
                mClientSeq += length;
                mDisconnectTimeout = System.currentTimeMillis() + IDLE_DISCON_TIMEOUT_MS;
                if (!mAckSendNeeded) {
                    mResendTimeout = Math.min(mResendTimeout, System.currentTimeMillis() + ASK_SEND_TIMEOUT);
                    mAckSendNeeded = true;
                }

                updateTimeout();
                if (length > 0)
                    mParser.parse();
            } catch (IOException e) {
                writeToLog("ERROR: UDP, putIncomingData error" + exceptionStackTrace(e));
                notifyOnError(this, e);
                closeConnection(this);
            }
        }

        public void onCommand(int commandId, byte[] data, int offset, int len) throws IOException {
            if (mProtocolDispatcher != null) {
                Message message;
                try {
                    CodedInputStream stream = CodedInputStream.newInstance(data, offset, len);
                    message = mProtocolDispatcher.parseMessage(commandId, stream);
                    mLogWriter.writeMessage(LogType.RECEIVER, message, commandId);
                } catch (Exception e) {
                    writeToLog("ERROR: parse incoming message failed. cmdId = " + commandId + ". len = " + len + ". " + exceptionStackTrace(e));
                    throw e;
                }

                try {
                    mProtocolDispatcher.dispatchMessage(this, commandId, message);
                } catch (Exception e) {
                    writeToLog("ERROR: dispatchMessage failed. cmdId = " + commandId + ". " + exceptionStackTrace(e));
                    throw e;
                }
            }
        }

        void packetReceived(ByteBuffer packet) {
            byte[] data = packet.array();
            short clientSeq = (short) ((data[1] << 8) + (data[0] & 0xFF));
            short serverSeq = (short) ((data[3] << 8) + (data[2] & 0xFF));
            byte flags = data[4];
            if (!mConnected && clientSeq == mClientSeq) {
                mConnected = true;
                mDisconnectTimeout = System.currentTimeMillis() + IDLE_DISCON_TIMEOUT_MS;
                updateTimeout();
                notifyOnConnected(this);
            }

            String packetData = bytesToHex(data, 0, mRecvBuffer.position());
            writeToLog("UDP: Recv C = " + (((int) clientSeq) & 0xFFFF) + " S = " + (((int) serverSeq) & 0xFFFF) + " Data = " + packetData);
            int dataSize = packet.position() - UDP_HDEADER_SIZE;
            if (dataSize > 0) {
                if (isPointInRange(clientSeq, dataSize, mClientSeq)) {
                    int dataOffset = (mClientSeq - clientSeq) & 0xFFFF;
                    if (dataOffset != 0)
                        writeToLog("UDP PERF: duplicated data: " + dataOffset + " bytes [" + (((int) clientSeq) & 0xFFFF) + ", " + (((int) mClientSeq) & 0xFFFF) + "), new data: " + (dataSize - dataOffset) + " bytes [" + (((int) mClientSeq) & 0xFFFF) + ", " + ((clientSeq + dataSize) & 0xFFFF) + ")");

                    if (dataSize > dataOffset)
                        putIncomingData(data, dataOffset + UDP_HDEADER_SIZE, dataSize - dataOffset);
                }
            }

            if (isPointInRange(mServerSeq, mSendUnconfirmedSize, serverSeq)) {
                int offset = (serverSeq - mServerSeq) & 0xFFFF;
                mSendBuffer.limit(mSendBuffer.position());
                mSendBuffer.position(offset);
                mSendBuffer.compact();
                mServerSeq += offset;
                mSendUnconfirmedSize -= offset;
                if (mSendUnconfirmedSize == 0 && !mAckSendNeeded)
                    mResendTimeout = Long.MAX_VALUE;

                updateTimeout();
            }

            if ((flags & F_RST) != 0) {
                writeToLog("UDP: close connection because RST flag received");
                closeConnection(this);
            }
        }

        void putSendData(byte[] data) {
            try {
                writeToLog("UDP: Add cmd to send buf. Data = " + bytesToHex(data, 0, data.length));
            } catch (Exception e) {
                e.printStackTrace();
            }

            mSendBuffer.put(data);
            if (mSendUnconfirmedSize == 0)
                mResendTimeout = Math.min(mResendTimeout, System.currentTimeMillis() + PACKET_SEND_TIMEOUT);
            else
                mResendTimeout = Math.min(mResendTimeout, System.currentTimeMillis() + PACKET_RESEND_TIMEOUT);

            updateTimeout();
        }

        void resendData() throws IOException {
            int len = Math.min(mSendBuffer.position(), MAX_SEND_DADAGRAM_SIZE);
            mSendUnconfirmedSize = Math.max(len, mSendUnconfirmedSize);
            if (mSendUnconfirmedSize > 0 || mAckSendNeeded)
                sendData(this, mSendUnconfirmedSize);

            mAckSendNeeded = false;
            if (mSendUnconfirmedSize > 0)
                mResendTimeout = System.currentTimeMillis() + PACKET_RESEND_TIMEOUT;
            else
                mResendTimeout = Long.MAX_VALUE;

            updateTimeout();
        }

        @Override
        public void setApi(Object o) {
            mApi = o;
        }

        @Override
        public Object getApi() {
            return mApi;
        }

        @Override
        public int getId() {
            return mConnectionId;
        }

        @Override
        public boolean isConnected() {
            return mConnected && !mDisconnected;
        }

        @Override
        public ProtoServer getServer() {
            return ProtoUDPServer.this;
        }

        @Override
        public LogWriter getLogger() {
            return mLogWriter;
        }

        public void writeToLog(String line) {
            if (mLogWriter != null)
                mLogWriter.writeLine(line);
        }
    }

    static private boolean isPointInRange(short start, int len, short point) {
        int diff = ((point - start) & 0xFFFF);
        return diff <= len;
    }


    private void closeConnection(ProtoConnection conn) {
        connections.remove(conn.mAddress);
        conn.mDisconnected = true;
        notifyOnDisconnected(conn);
        if (conn.mLogWriter != null) {
            conn.mLogWriter.close();
            conn.mLogWriter = null;
        }
    }

    private void sendRst(byte[] src, SocketAddress address) throws IOException {
        byte[] data = mEmptyPacketBuffer.array();
        data[0] = src[2];
        data[1] = src[3];
        data[2] = src[0];
        data[3] = src[1];
        data[4] = F_RST;
        mEmptyPacketBuffer.position(0);
        mEmptyPacketBuffer.limit(5);
        int res = mChannel.send(mEmptyPacketBuffer, address);
        writeToMainLog("UDP: Send RST Data = " + bytesToHex(data, 0, UDP_HDEADER_SIZE) + " " + res + " bytes sent");
    }

    private void sendSyncReply(ProtoConnection conn) throws IOException {
        byte[] data = mEmptyPacketBuffer.array();
        data[0] = (byte) conn.mServerSeq;
        data[1] = (byte) (conn.mServerSeq >>> 8);
        data[2] = (byte) conn.mClientSeq;
        data[3] = (byte) (conn.mClientSeq >>> 8);
        data[4] = F_SYN | F_ACK;
        mEmptyPacketBuffer.position(0);
        mEmptyPacketBuffer.limit(UDP_HDEADER_SIZE);
        int res = mChannel.send(mEmptyPacketBuffer, conn.mAddress);
        conn.writeToLog("UDP: Send SyncReply C = " + (((int) conn.mClientSeq) & 0xFFFF) + " S = " + (((int) conn.mServerSeq) & 0xFFFF) + " Data = " + bytesToHex(data, 0, UDP_HDEADER_SIZE) + " " + res + " bytes sent");
    }

    private void sendData(ProtoConnection conn, int length) throws IOException {
        byte[] data = conn.mSendBuffer.array();
        data[0] = (byte) conn.mServerSeq;
        data[1] = (byte) (conn.mServerSeq >>> 8);
        data[2] = (byte) conn.mClientSeq;
        data[3] = (byte) (conn.mClientSeq >>> 8);
        data[4] = F_DAT;
        ByteBuffer packet = ByteBuffer.wrap(data, 0, length + UDP_HDEADER_SIZE);
        int res = mChannel.send(packet, conn.mAddress);
        conn.writeToLog("UDP: Send C = " + (((int) conn.mClientSeq) & 0xFFFF) + " S = " + (((int) conn.mServerSeq) & 0xFFFF) + " Data = " + bytesToHex(data, 0, length + UDP_HDEADER_SIZE) + " " + res + " bytes sent");
    }

    protected void sendCommand(Connection connection, byte[] data) {
        ProtoConnection con = (ProtoConnection) connection;
        if (con != null)
            con.putSendData(data);
    }

    protected void sendBroadcast(byte[] data) {
        List<ProtoConnection> list = new LinkedList<>(connections.values());
        for (ProtoConnection protoConnection : list)
            protoConnection.putSendData(data);
    }

    protected void closeConnection(Connection connection) {
        ProtoConnection con = (ProtoConnection) connection;
        if (con != null)
            closeConnection(con);
    }

    protected NetworkThread.ProtocolHandler getProtocolHandler() {
        return mProtocolHandler;
    }

    private final NetworkThread.SelectionHandler mSeletionHandler = new NetworkThread.SelectionHandler() {
        @Override
        public void keySelected(SelectionKey key) {
            if (!key.isReadable())
                return;

            try {
                mRecvBuffer.position(0);
                mRecvBuffer.limit(mRecvBuffer.capacity());
                SocketAddress address = mChannel.receive(mRecvBuffer);

                byte[] data = mRecvBuffer.array();

                if (mRecvBuffer.position() < 5) {
                    writeToMainLog("UDP: small (len = " + mRecvBuffer.position() + ", Data = " + bytesToHex(data, 0, mRecvBuffer.position()) + ") packet received from " + address.toString());
                    return;
                }

                byte flags = data[4];
                ProtoConnection conn = connections.get(address);
                if (flags == F_SYN) {
                    short clientSeq = (short) ((data[1] << 8) + (data[0] & 0xFF));
                    String packetData = bytesToHex(data, 0, mRecvBuffer.position());
                    if (conn != null && (conn.mConnected || conn.mClientSeq != clientSeq)) {
                        conn.writeToLog("UDP: Close connection because another SYN request received, CurrentClientSeq = " + conn.mClientSeq + " packet ClientSeq = " + clientSeq + " Data = " + packetData);
                        closeConnection(conn);
                        conn = null;
                    }

                    if (conn == null) {
                        conn = new ProtoConnection(address, clientSeq);
                        connections.put(address, conn);
                        conn.writeToLog("UDP: Recv SyncRequest C = " + (((int) clientSeq) & 0xFFFF) + " S = " + ((int) conn.mServerSeq & 0xFFFF) + " Data = " + packetData);
                    } else {
                        conn.writeToLog("UDP PERF: duplicated SYN request received C = " + clientSeq + " S = " + conn.mServerSeq + " Data = " + packetData);
                    }

                    conn.mConnected = false;
                    conn.mDisconnectTimeout = System.currentTimeMillis() + SYN_CONFIRM_TIMEOUT_MS;
                    conn.updateTimeout();
                    sendSyncReply(conn);
                } else {
                    if (conn == null) {
                        String packetData = bytesToHex(data, 0, mRecvBuffer.position());
                        writeToMainLog("UDP: Unknown packet received from " + address.toString() + ", Data = " + packetData);
                        sendRst(data, address);
                        return;
                    }

                    conn.packetReceived(mRecvBuffer);
                }
            } catch (IOException e) {
                writeToMainLog("ERROR: UDP keySelected \n" + exceptionStackTrace(e));
            }
        }
    };


    NetworkThread.ProtocolHandler mProtocolHandler = new NetworkThread.ProtocolHandler() {
        @Override
        public void onStart(Selector selector) {
            try {
                mSelector = selector;
                mChannel = DatagramChannel.open();
                mChannel.configureBlocking(false);
                mChannel.socket().bind(new InetSocketAddress(mPort));
                mChannel.register(mSelector, SelectionKey.OP_READ, mSeletionHandler);
                writeToMainLog("UDP channel opened. port = " + mPort);
            } catch (IOException e) {
                writeToMainLog("ERROR: ProtoUDPServer failed to start. ERROR: " + exceptionStackTrace(e));
            }
        }

        @Override
        public void onStop() {
            try {
                mChannel.close();
                writeToMainLog("UDP channel closed");
            } catch (IOException e) {
                writeToMainLog("ERROR: ProtoUDPServer onStop " + exceptionStackTrace(e));
            }
        }

        @Override
        public long getNextWakeupTime() {
            Iterator<ProtoConnection> it = connections.values().iterator();
            long res = Long.MAX_VALUE;
            while (it.hasNext()) {
                ProtoConnection con = it.next();
                if (con.mTimeout < res)
                    res = con.mTimeout;
            }
            return res;
        }

        @Override
        public void processTimeouts() {
            long now = System.currentTimeMillis();
            Iterator<ProtoConnection> it = connections.values().iterator();
            List<ProtoConnection> conectionsForRemoval = new ArrayList<>();
            while (it.hasNext()) {
                ProtoConnection con = it.next();
                if (con.mTimeout <= now) {
                    if (con.mDisconnectTimeout <= now)
                        conectionsForRemoval.add(con);
                    else if (con.mResendTimeout <= now) {
                        try {
                            con.resendData();
                        } catch (IOException e) {
                            notifyOnError(con, e);
                            conectionsForRemoval.add(con);
                        }
                    }
                }
            }
            if (conectionsForRemoval.size() > 0)
                writeToMainLog("close " + conectionsForRemoval.size() + " connection(s) because of timeout");

            for (ProtoConnection con : conectionsForRemoval) {
                con.writeToLog("close connection because of disconnect timeout");
                closeConnection(con);
            }
        }
    };

}
