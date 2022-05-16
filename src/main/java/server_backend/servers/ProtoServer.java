package server_backend.servers;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;

import server_backend.proto_loggers.LogType;

import javax.annotation.Nullable;
import java.io.IOException;
import java.net.SocketAddress;

/**
 * @implNote -  NOTE tagger internally uses 512 byte buffer for commands
 * so it cannot process command larger than 512 bytes.
 * if you communicate with tagger directly, make sure that this value is 512 or less.
 * you can use bigger value if other side is not a tagger (and not a low resource device).
 * static final int MAX_SEND_COMMAND_SIZE = 512; // must be 512 or less for communication with tagger
 */
public abstract class ProtoServer{
    static final int MAX_SEND_COMMAND_SIZE = 512;
    private final static char[] hexChars = "0123456789ABCDEF".toCharArray();
    private LogFactory logFactory;
    private LogWriter mainLog;
    ProtocolDispatcher mProtocolDispatcher;
    NetworkThread mNetworkThread;

    protected abstract void sendCommand(Connection connection, byte[] data);

    protected abstract void sendBroadcast(byte[] data);

    protected abstract void closeConnection(Connection connection);

    protected abstract NetworkThread.ProtocolHandler getProtocolHandler();

    public interface LogWriter {
        void writeLine(String line);

        void writeMessage(LogType logType, Message msg, int commandID);

        void close();
    }

    public interface LogFactory {
        LogWriter openConnectionLog(SocketAddress address);

        LogWriter getMainLog();
    }

    public interface Connection {
        void setApi(Object o);

        Object getApi();

        @Deprecated
        int getId();

        boolean isConnected();

        ProtoServer getServer();

        LogWriter getLogger();
    }


    public interface ProtocolDispatcher {
        @Nullable Message parseMessage(int commandId, CodedInputStream inputStream) throws IOException;

        boolean dispatchMessage(Connection connection, int commandId, Message message);

        void notifyOnDisconnected(Connection connection);

        void notifyOnError(Connection connection, Throwable error);

        void notifyOnConnected(Connection connection);
    }


    protected LogFactory getLogFactory() {
        return logFactory;
    }

    private class SendCommand implements NetworkThread.ThreadMessage {
        Connection mConnection;
        byte[] mData;

        SendCommand(Connection connection, byte[] data) {
            this.mConnection = connection;
            this.mData = data;
        }

        public void execute() {
            if (mData != null) {
                if (mConnection != null) {
                    sendCommand(mConnection, mData);
                } else {
                    sendBroadcast(mData);
                }
            } else {
                closeConnection(mConnection);
            }
        }
    }

    private String getProtocolName() {
        return this.getClass().getSimpleName();
    }

    private byte[] serializeMessage(int commandId, MessageLite message) {
        try {
            int cmdSize = CodedOutputStream.computeUInt32SizeNoTag(commandId);
            if (message == null) {
                byte[] res = new byte[cmdSize + 1];
                CodedOutputStream stream = CodedOutputStream.newInstance(res);
                stream.writeUInt32NoTag(commandId);
                res[cmdSize] = 0;
                return res;
            }

            int msgSize = CodedOutputStream.computeMessageSizeNoTag(message);
            int totalSize = cmdSize + msgSize;
            if (totalSize > MAX_SEND_COMMAND_SIZE) {
                writeToMainLog("ERROR: " + getProtocolName() + " command size exceed MAX_SEND_COMMAND_SIZE limit.  tagger cannot handle big commands cmdId = " + commandId + " commandSize = " + totalSize);
                return null;
            }

            byte[] res = new byte[totalSize];
            CodedOutputStream stream = CodedOutputStream.newInstance(res);
            stream.writeUInt32NoTag(commandId);
            stream.writeMessageNoTag(message);
            return res;
        } catch (IOException e) {
            writeToMainLog("ERROR: " + getProtocolName() + " serializeMessage failed. Make sure that message is not modified from another threads during serialization cmdId = "
                    + commandId + " " + e.getMessage());
            return null;
        }
    }

    void notifyOnConnected(Connection connection) {
        LogWriter logger = connection.getLogger();
        if (logger != null)
            logger.writeLine("NEW CLIENT CONNECTED");

        if (mProtocolDispatcher != null)
            mProtocolDispatcher.notifyOnConnected(connection);
    }

    void notifyOnError(Connection connection, Throwable error) {
        LogWriter logger = connection.getLogger();
        if (logger != null)
            logger.writeLine("ERROR: \n" + exceptionStackTrace(error));

        if (mProtocolDispatcher != null)
            mProtocolDispatcher.notifyOnError(connection, error);
    }

    void notifyOnDisconnected(Connection connection) {
        LogWriter logger = connection.getLogger();
        if (logger != null)
            logger.writeLine("CLIENT DISCONNECTED \n" + threadCurrentStackTrace());

        if (mProtocolDispatcher != null)
            mProtocolDispatcher.notifyOnDisconnected(connection);
    }

    void writeToMainLog(String message) {
        if (mainLog != null)
            mainLog.writeLine(message);
    }


    public static String bytesToHex(byte[] bytes, int from, int end) {
        int len = end - from;
        char[] hexData = new char[len * 2];
        for (int j = 0; j < len; j++) {
            int v = bytes[from + j] & 0xFF;
            hexData[j * 2] = hexChars[v >>> 4];
            hexData[j * 2 + 1] = hexChars[v & 0x0F];
        }
        return new String(hexData);
    }

    public boolean sendCommand(Connection connection, int commandId, Message message) {
        LogWriter logger = connection.getLogger();
        if (logger != null)
            logger.writeMessage(LogType.SENDER, message, commandId);

        byte[] data = serializeMessage(commandId, message);
        if (data == null)
            return false;

        if (logger != null)
            logger.writeLine("Send msg: " + ProtoServer.bytesToHex(data, 0, data.length));

        mNetworkThread.postMessage(new SendCommand(connection, data));
        return true;
    }

    public void disconnectClient(Connection connection) {
        mNetworkThread.postMessage(new SendCommand(connection, null));
    }

    private NetworkThread.ProtocolHandler mProtocolHandler;

    public void startServer() {
        if (mNetworkThread == null) {
            mNetworkThread = new NetworkThread(logFactory);
            mNetworkThread.start();
        }

        mProtocolHandler = getProtocolHandler();
        mNetworkThread.startProtoHandler(mProtocolHandler);
        writeToMainLog(getProtocolName() + ": server started");
    }

    public void stopServer() {
        mNetworkThread.stopProtoHandler(mProtocolHandler);
    }

    public void setProtocolDispatcher(ProtocolDispatcher value) {
        mProtocolDispatcher = value;
    }

    public void setServerLogger(LogFactory logFactory) {
        this.logFactory = logFactory;
        if (logFactory != null)
            this.mainLog = logFactory.getMainLog();
        else
            this.mainLog = null;
    }

    public void setNetworkThread(NetworkThread thread) {
        mNetworkThread = thread;
    }

    public String threadCurrentStackTrace() {
        StringBuilder builder = new StringBuilder();
        for (StackTraceElement ste : Thread.currentThread().getStackTrace())
            builder.append(ste).append("\n");

        return builder.toString();
    }

    public String exceptionStackTrace(Throwable throwable) {
        StringBuilder builder = new StringBuilder();
        builder.append(throwable.toString()).append("\n");
        for (StackTraceElement ste : throwable.getStackTrace())
            builder.append(ste).append("\n");

        return builder.toString();
    }


}