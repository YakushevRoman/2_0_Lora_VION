package generation;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Message;
import java.io.IOException;

class JavaAPi {

    public ProtoServer.ProtocolDispatcher getProtocolDispatcher() {
        return mProtocolDispatcher;
    }

    public interface Connection {
        boolean sendStartGame(ForpostServer.StartGame message);

        boolean sendStopGame();

        void disconnect();

        Object getAttachment();

        ProtoServer.Connection getServerConnection();

        void setAttachment(Object attachment);
    }


    public interface OnHelloFromDevListener {
        void onHelloFromDevReceived(Connection connection, ForpostServer.HelloFromDev message);
    }

    public interface OnPingListener {
        void onPingReceived(Connection connection);
    }

    public interface OnConnectedListener {
        void onConnected(Connection connection);
    }

    public interface OnDisconnectedListener {
        void onDisconnected(Connection connection);
    }


    private volatile OnHelloFromDevListener onHelloFromDevListener = null;
    private volatile OnPingListener onPingListener = null;
    private volatile OnConnectedListener onConnectedListener = null;
    private volatile OnDisconnectedListener onDisconnectedListener = null;

    private void notifyHelloFromDevReceived(ProtoServer.Connection connection, ForpostServer.HelloFromDev message) {
        OnHelloFromDevListener localCopy = onHelloFromDevListener;
        if (localCopy != null)
            localCopy.onHelloFromDevReceived((Connection) connection.getApi(), message);
    }

    private void notifyPingReceived(ProtoServer.Connection connection) {
        OnPingListener localCopy = onPingListener;
        if (localCopy != null)
            localCopy.onPingReceived((Connection) connection.getApi());
    }

    public void setOnHelloFromDevListener(OnHelloFromDevListener listener) {
        onHelloFromDevListener = listener;
    }

    public void setOnPingListener(OnPingListener listener) {
        onPingListener = listener;
    }

    public void setOnConnectedListener(OnConnectedListener listener) {
        onConnectedListener = listener;
    }

    public void setOnDisconnectedListener(OnDisconnectedListener listener) {
        onDisconnectedListener = listener;
    }


    ProtoServer.ProtocolDispatcher mProtocolDispatcher = new ProtoServer.ProtocolDispatcher() {
        @Override
        public Message parseMessage(int commandId, CodedInputStream inputStream) throws IOException {
            switch (commandId) {
                case 1:
                    return ForpostServer.HelloFromDev.parser().parsePartialFrom(inputStream);
                case 5:
                    return ForpostServer.ChangeId.parser().parsePartialFrom(inputStream);
                default:
                    return null;
            }
        }

        @Override
        public boolean dispatchMessage(ProtoServer.Connection connection, int commandId, Message message) {
            switch (commandId) {
                case 1:
                    notifyHelloFromDevReceived(connection, (ForpostServer.HelloFromDev) message);
                    return true;
                case 7:
                    notifyPingReceived(connection);
                    return true;
                default:
                    return false;
            }
        }

        @Override
        public void notifyOnConnected(ProtoServer.Connection connection) {
            ForpostConnection conn = new ForpostConnection(connection);
            connection.setApi(conn);

            OnConnectedListener localCopy = onConnectedListener;
            if (localCopy != null)
                localCopy.onConnected(conn);
        }

        @Override
        public void notifyOnDisconnected(ProtoServer.Connection connection) {
            OnDisconnectedListener localCopy = onDisconnectedListener;
            if (localCopy != null)
                localCopy.onDisconnected((Connection) connection.getApi());
        }
    };

    static class ForpostConnection implements Connection {
        private final ProtoServer.Connection connection;
        private final ProtoServer server;
        private Object mAttachment;

        private ForpostConnection(ProtoServer.Connection connection) {
            this.connection = connection;
            server = connection.getServer();
        }

        @Override
        public boolean sendStartGame(ForpostServer.StartGame message) {
            return server.sendCommand(connection, 3, message);
        }

        @Override
        public boolean sendStopGame() {
            return server.sendCommand(connection, 4, null);
        }

        @Override
        public void disconnect() {
            server.disconnectClient(connection);
        }

        @Override
        public Object getAttachment() {
            return mAttachment;
        }

        @Override
        public void setAttachment(Object attachment) {
            mAttachment = attachment;
        }

        @Override
        public ProtoServer.Connection getServerConnection() {
            return connection;
        }

    }
}
