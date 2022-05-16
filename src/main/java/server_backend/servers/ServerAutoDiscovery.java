package server_backend.servers;


import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;

public class ServerAutoDiscovery {

    // This request tag is used on tagger side. On server side is used
    private static final long REQUEST_TAG = Long.reverseBytes(0xC9_42_22_11_5f_c9_42_d3L);
    private static final long RESPONSE_TAG = Long.reverseBytes(0xad_e7_e9_7f_3f_51_47_7bL);
    //private static final long RESPONSE_TAG = 0x7b_47_51_3f_7f_e9_e7_adL;
    //private static final long REQUEST_TAG = 0xd3_42_c9_5f_11_22_42_C9L;

    private Selector mSelector;
    private DatagramChannel mChannel;
    private ByteBuffer mRecvBuffer;
    private ByteBuffer mSendBuffer;
    private NetworkThread mNetworkThread;

    byte mPriority = 0x40;
    int mServerId;
    int mServerPort;
    byte[] mServerName;

    public ServerAutoDiscovery(NetworkThread thread, int serverId, int portId) {
        mServerId = serverId;
        setServerName("Android Server");
        mServerPort = portId;
        mNetworkThread = thread;
        mRecvBuffer = ByteBuffer.allocate(128);
        mSendBuffer = ByteBuffer.allocate(128);
    }

    public void start() {
        mNetworkThread.start();
        mNetworkThread.startProtoHandler(mProtocolHandler);
    }

    public void stop() {
        mNetworkThread.stopProtoHandler(mProtocolHandler);
    }

    public synchronized void setServerPort(int port) {
        mServerPort = port;
    }

    public synchronized void setServerName(String name) {
        try {
            mServerName = name.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            mServerName = new byte[0];
        }
    }

    NetworkThread.ProtocolHandler mProtocolHandler = new NetworkThread.ProtocolHandler() {
        @Override
        public void onStart(Selector selector) {
            try {
                mSelector = selector;
                mChannel = DatagramChannel.open();
                mChannel.configureBlocking(false);
                mChannel.socket().bind(new InetSocketAddress(4000));
                mChannel.register(mSelector, SelectionKey.OP_READ, mSelectionHandler);

            } catch (IOException e) {
                System.err.println("ServerAutoDiscovery failed to start. ERROR: " + e.getMessage());
            }
        }

        @Override
        public void onStop() throws IOException {
            mChannel.close();
        }

        @Override
        public long getNextWakeupTime() {
            return Long.MAX_VALUE;
        }

        @Override
        public void processTimeouts() {

        }
    };

    private NetworkThread.SelectionHandler mSelectionHandler = new NetworkThread.SelectionHandler() {
        @Override
        public void keySelected(SelectionKey key) {
            if (!key.isReadable())
                return;
            try {
                mRecvBuffer.clear();
                SocketAddress address = mChannel.receive(mRecvBuffer);
                mRecvBuffer.flip();

                long requestTag = mRecvBuffer.getLong();

                if (requestTag != REQUEST_TAG)
                    return;

                byte[] name;
                int port;

                synchronized (ServerAutoDiscovery.this) {
                    name = mServerName;
                    port = mServerPort;
                }

                System.out.println("Server");

                mSendBuffer.clear();
                mSendBuffer.putLong(RESPONSE_TAG);
                mSendBuffer.putInt(0); // ip address
                mSendBuffer.putShort(Short.reverseBytes((short) port));// port;
                mSendBuffer.putInt(Integer.reverseBytes(mServerId));
                mSendBuffer.put(mPriority); // priority
                mSendBuffer.putShort(Short.reverseBytes((short) name.length));
                mSendBuffer.put(name);
                mSendBuffer.flip();
                mChannel.send(mSendBuffer, address);
            } catch (IOException e) {
                System.err.println("ERROR: " + e.getMessage());
            }
        }
    };

}
