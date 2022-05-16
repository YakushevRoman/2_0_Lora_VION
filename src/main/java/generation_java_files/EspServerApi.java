package generation_java_files;// Generated by the protocol buffer compiler. DO NOT EDIT!
// if you need to change something in code generator, please contact Alexander Lobas (alexanderlobas@yahoo.com)

import build.generated.source.proto.main.java.Esp;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Message;
import server_backend.servers.ProtoServer;

import java.io.IOException;

public class EspServerApi {

    public ProtoServer.ProtocolDispatcher getProtocolDispatcher() {
        return mProtocolDispatcher;
    }

    public interface Connection {
        boolean sendEspConectionState(Esp.ESPConectionState message);

        boolean sendEspConnectToTcpReply(Esp.ESPConnectToTCPReply message);

        boolean sendEspTcpConfirmation(Esp.ESPTcpConfirmation message);

        boolean sendEspServerDiscovered(Esp.ESPServerDiscovered message);

        boolean sendEspRssiForNetworkName(Esp.ESPRssiForNetworkName message);

        boolean sendEspWifiAccessPoint(Esp.ESPWifiAccessPoint message);

        boolean sendEspKillWifiAccessPointReply(Esp.ESPKillWifiAccessPointReply message);

        void disconnect();

        Object getAttachment();

        ProtoServer.Connection getServerConnection();

        void setAttachment(Object attachment);

        int getConnectionId();
    }

    // Listener interfaces for incoming messages

    public interface OnEspConnectToApListener {
        void onEspConnectToApReceived(Connection connection, Esp.ESPConnectToAP message);
    }

    public interface OnEspConnectToTcpListener {
        void onEspConnectToTcpReceived(Connection connection, Esp.ESPConnectToTCP message);
    }

    public interface OnEspSendByUdpListener {
        void onEspSendByUdpReceived(Connection connection, Esp.ESPSendByUDP message);
    }

    public interface OnEspDiscoverServersListener {
        void onEspDiscoverServersReceived(Connection connection, Esp.ESPDiscoverServers message);
    }

    public interface OnEspSendLogByUdpListener {
        void onEspSendLogByUdpReceived(Connection connection, Esp.ESPSendLogByUDP message);
    }

    public interface OnEspConnectToTcpReplyListener {
        void onEspConnectToTcpReplyReceived(Connection connection, Esp.ESPConnectToTCPReply message);
    }

    public interface OnEspTcpConfirmationListener {
        void onEspTcpConfirmationReceived(Connection connection, Esp.ESPTcpConfirmation message);
    }

    public interface OnEspGetRssiByNetworkNameListener {
        void onEspGetRssiByNetworkNameReceived(Connection connection, Esp.ESPGetRssiByNetworkName message);
    }

    public interface OnEspScanWifiByChannelListener {
        void onEspScanWifiByChannelReceived(Connection connection, Esp.ESPScanWifiByChannel message);
    }

    public interface OnEspSetWifiAccessPointListener {
        void onEspSetWifiAccessPointReceived(Connection connection, Esp.ESPSetWifiAccessPoint message);
    }

    public interface OnEspKillWifiAccessPointListener {
        void onEspKillWifiAccessPointReceived(Connection connection);
    }

    public interface OnConnectedListener {
        void onConnected(Connection connection);
    }

    public interface OnErrorListener {
        void onError(Connection connection, Throwable error);
    }

    public interface OnDisconnectedListener {
        void onDisconnected(Connection connection);
    }


    private volatile OnEspConnectToApListener onEspConnectToApListener = null;
    private volatile OnEspConnectToTcpListener onEspConnectToTcpListener = null;
    private volatile OnEspSendByUdpListener onEspSendByUdpListener = null;
    private volatile OnEspDiscoverServersListener onEspDiscoverServersListener = null;
    private volatile OnEspSendLogByUdpListener onEspSendLogByUdpListener = null;
    private volatile OnEspConnectToTcpReplyListener onEspConnectToTcpReplyListener = null;
    private volatile OnEspTcpConfirmationListener onEspTcpConfirmationListener = null;
    private volatile OnEspGetRssiByNetworkNameListener onEspGetRssiByNetworkNameListener = null;
    private volatile OnEspScanWifiByChannelListener onEspScanWifiByChannelListener = null;
    private volatile OnEspSetWifiAccessPointListener onEspSetWifiAccessPointListener = null;
    private volatile OnEspKillWifiAccessPointListener onEspKillWifiAccessPointListener = null;
    private volatile OnConnectedListener onConnectedListener = null;
    private volatile OnDisconnectedListener onDisconnectedListener = null;
    private volatile OnErrorListener onErrorListener = null;

    private void notifyEspConnectToApReceived(ProtoServer.Connection connection, Esp.ESPConnectToAP message) {
        OnEspConnectToApListener localCopy = onEspConnectToApListener;
        if (localCopy != null)
            localCopy.onEspConnectToApReceived((Connection) connection.getApi(), message);
    }

    private void notifyEspConnectToTcpReceived(ProtoServer.Connection connection, Esp.ESPConnectToTCP message) {
        OnEspConnectToTcpListener localCopy = onEspConnectToTcpListener;
        if (localCopy != null)
            localCopy.onEspConnectToTcpReceived((Connection) connection.getApi(), message);
    }

    private void notifyEspSendByUdpReceived(ProtoServer.Connection connection, Esp.ESPSendByUDP message) {
        OnEspSendByUdpListener localCopy = onEspSendByUdpListener;
        if (localCopy != null)
            localCopy.onEspSendByUdpReceived((Connection) connection.getApi(), message);
    }

    private void notifyEspDiscoverServersReceived(ProtoServer.Connection connection, Esp.ESPDiscoverServers message) {
        OnEspDiscoverServersListener localCopy = onEspDiscoverServersListener;
        if (localCopy != null)
            localCopy.onEspDiscoverServersReceived((Connection) connection.getApi(), message);
    }

    private void notifyEspSendLogByUdpReceived(ProtoServer.Connection connection, Esp.ESPSendLogByUDP message) {
        OnEspSendLogByUdpListener localCopy = onEspSendLogByUdpListener;
        if (localCopy != null)
            localCopy.onEspSendLogByUdpReceived((Connection) connection.getApi(), message);
    }

    private void notifyEspConnectToTcpReplyReceived(ProtoServer.Connection connection, Esp.ESPConnectToTCPReply message) {
        OnEspConnectToTcpReplyListener localCopy = onEspConnectToTcpReplyListener;
        if (localCopy != null)
            localCopy.onEspConnectToTcpReplyReceived((Connection) connection.getApi(), message);
    }

    private void notifyEspTcpConfirmationReceived(ProtoServer.Connection connection, Esp.ESPTcpConfirmation message) {
        OnEspTcpConfirmationListener localCopy = onEspTcpConfirmationListener;
        if (localCopy != null)
            localCopy.onEspTcpConfirmationReceived((Connection) connection.getApi(), message);
    }

    private void notifyEspGetRssiByNetworkNameReceived(ProtoServer.Connection connection, Esp.ESPGetRssiByNetworkName message) {
        OnEspGetRssiByNetworkNameListener localCopy = onEspGetRssiByNetworkNameListener;
        if (localCopy != null)
            localCopy.onEspGetRssiByNetworkNameReceived((Connection) connection.getApi(), message);
    }

    private void notifyEspScanWifiByChannelReceived(ProtoServer.Connection connection, Esp.ESPScanWifiByChannel message) {
        OnEspScanWifiByChannelListener localCopy = onEspScanWifiByChannelListener;
        if (localCopy != null)
            localCopy.onEspScanWifiByChannelReceived((Connection) connection.getApi(), message);
    }

    private void notifyEspSetWifiAccessPointReceived(ProtoServer.Connection connection, Esp.ESPSetWifiAccessPoint message) {
        OnEspSetWifiAccessPointListener localCopy = onEspSetWifiAccessPointListener;
        if (localCopy != null)
            localCopy.onEspSetWifiAccessPointReceived((Connection) connection.getApi(), message);
    }

    private void notifyEspKillWifiAccessPointReceived(ProtoServer.Connection connection) {
        OnEspKillWifiAccessPointListener localCopy = onEspKillWifiAccessPointListener;
        if (localCopy != null)
            localCopy.onEspKillWifiAccessPointReceived((Connection) connection.getApi());
    }


    public void setOnEspConnectToApListener(OnEspConnectToApListener listener) {
        onEspConnectToApListener = listener;
    }

    public void setOnEspConnectToTcpListener(OnEspConnectToTcpListener listener) {
        onEspConnectToTcpListener = listener;
    }

    public void setOnEspSendByUdpListener(OnEspSendByUdpListener listener) {
        onEspSendByUdpListener = listener;
    }

    public void setOnEspDiscoverServersListener(OnEspDiscoverServersListener listener) {
        onEspDiscoverServersListener = listener;
    }

    public void setOnEspSendLogByUdpListener(OnEspSendLogByUdpListener listener) {
        onEspSendLogByUdpListener = listener;
    }

    public void setOnEspConnectToTcpReplyListener(OnEspConnectToTcpReplyListener listener) {
        onEspConnectToTcpReplyListener = listener;
    }

    public void setOnEspTcpConfirmationListener(OnEspTcpConfirmationListener listener) {
        onEspTcpConfirmationListener = listener;
    }

    public void setOnEspGetRssiByNetworkNameListener(OnEspGetRssiByNetworkNameListener listener) {
        onEspGetRssiByNetworkNameListener = listener;
    }

    public void setOnEspScanWifiByChannelListener(OnEspScanWifiByChannelListener listener) {
        onEspScanWifiByChannelListener = listener;
    }

    public void setOnEspSetWifiAccessPointListener(OnEspSetWifiAccessPointListener listener) {
        onEspSetWifiAccessPointListener = listener;
    }

    public void setOnEspKillWifiAccessPointListener(OnEspKillWifiAccessPointListener listener) {
        onEspKillWifiAccessPointListener = listener;
    }


    public void setOnConnectedListener(OnConnectedListener listener) {
        onConnectedListener = listener;
    }

    public void setOnErrorListener(OnErrorListener listener) {
        onErrorListener = listener;
    }

    public void setOnDisconnectedListener(OnDisconnectedListener listener) {
        onDisconnectedListener = listener;
    }


    ProtoServer.ProtocolDispatcher mProtocolDispatcher = new ProtoServer.ProtocolDispatcher() {
        @Override
        public Message parseMessage(int commandId, CodedInputStream inputStream) throws IOException {
            switch (commandId) {
                case 1001:
                    return Esp.ESPConnectToAP.parser().parsePartialFrom(inputStream);
                case 1002:
                    return Esp.ESPConnectToTCP.parser().parsePartialFrom(inputStream);
                case 1003:
                    return Esp.ESPSendByUDP.parser().parsePartialFrom(inputStream);
                case 1004:
                    return Esp.ESPDiscoverServers.parser().parsePartialFrom(inputStream);
                case 1005:
                    return Esp.ESPSendLogByUDP.parser().parsePartialFrom(inputStream);
                case 1006:
                    return Esp.ESPConnectToTCPReply.parser().parsePartialFrom(inputStream);
                case 1007:
                    return Esp.ESPTcpConfirmation.parser().parsePartialFrom(inputStream);
                case 1008:
                    return Esp.ESPGetRssiByNetworkName.parser().parsePartialFrom(inputStream);
                case 1009:
                    return Esp.ESPScanWifiByChannel.parser().parsePartialFrom(inputStream);
                case 1010:
                    return Esp.ESPSetWifiAccessPoint.parser().parsePartialFrom(inputStream);
                default:
                    return null;
            }
        }

        @Override
        public boolean dispatchMessage(ProtoServer.Connection connection, int commandId, Message message) {
            switch (commandId) {
                case 1001:
                    notifyEspConnectToApReceived(connection, (Esp.ESPConnectToAP) message);
                    return true;
                case 1002:
                    notifyEspConnectToTcpReceived(connection, (Esp.ESPConnectToTCP) message);
                    return true;
                case 1003:
                    notifyEspSendByUdpReceived(connection, (Esp.ESPSendByUDP) message);
                    return true;
                case 1004:
                    notifyEspDiscoverServersReceived(connection, (Esp.ESPDiscoverServers) message);
                    return true;
                case 1005:
                    notifyEspSendLogByUdpReceived(connection, (Esp.ESPSendLogByUDP) message);
                    return true;
                case 1006:
                    notifyEspConnectToTcpReplyReceived(connection, (Esp.ESPConnectToTCPReply) message);
                    return true;
                case 1007:
                    notifyEspTcpConfirmationReceived(connection, (Esp.ESPTcpConfirmation) message);
                    return true;
                case 1008:
                    notifyEspGetRssiByNetworkNameReceived(connection, (Esp.ESPGetRssiByNetworkName) message);
                    return true;
                case 1009:
                    notifyEspScanWifiByChannelReceived(connection, (Esp.ESPScanWifiByChannel) message);
                    return true;
                case 1010:
                    notifyEspSetWifiAccessPointReceived(connection, (Esp.ESPSetWifiAccessPoint) message);
                    return true;
                case 1011:
                    notifyEspKillWifiAccessPointReceived(connection);
                    return true;
                default:
                    return false;
            }
        }

        @Override
        public void notifyOnConnected(ProtoServer.Connection connection) {
            EspConnection conn = new EspConnection(connection);
            connection.setApi(conn);

            OnConnectedListener localCopy = onConnectedListener;
            if (localCopy != null)
                localCopy.onConnected(conn);
        }

        @Override
        public void notifyOnError(ProtoServer.Connection connection, Throwable error) {
            OnErrorListener localCopy = onErrorListener;
            if (localCopy != null)
                localCopy.onError((Connection) connection.getApi(), error);
        }

        @Override
        public void notifyOnDisconnected(ProtoServer.Connection connection) {
            OnDisconnectedListener localCopy = onDisconnectedListener;
            if (localCopy != null)
                localCopy.onDisconnected((Connection) connection.getApi());
        }
    };

    static class EspConnection implements Connection {
        private ProtoServer.Connection mConnection;
        private ProtoServer mServer;
        private Object mAttachment;

        private EspConnection(ProtoServer.Connection connection) {
            mConnection = connection;
            mServer = connection.getServer();
        }

        @Override
        public boolean sendEspConectionState(Esp.ESPConectionState message) {
            return mServer.sendCommand(mConnection, 1001, message);
        }

        @Override
        public boolean sendEspConnectToTcpReply(Esp.ESPConnectToTCPReply message) {
            return mServer.sendCommand(mConnection, 1002, message);
        }

        @Override
        public boolean sendEspTcpConfirmation(Esp.ESPTcpConfirmation message) {
            return mServer.sendCommand(mConnection, 1003, message);
        }

        @Override
        public boolean sendEspServerDiscovered(Esp.ESPServerDiscovered message) {
            return mServer.sendCommand(mConnection, 1004, message);
        }

        @Override
        public boolean sendEspRssiForNetworkName(Esp.ESPRssiForNetworkName message) {
            return mServer.sendCommand(mConnection, 1005, message);
        }

        @Override
        public boolean sendEspWifiAccessPoint(Esp.ESPWifiAccessPoint message) {
            return mServer.sendCommand(mConnection, 1006, message);
        }

        @Override
        public boolean sendEspKillWifiAccessPointReply(Esp.ESPKillWifiAccessPointReply message) {
            return mServer.sendCommand(mConnection, 1007, message);
        }

        @Override
        public void disconnect() {
            mServer.disconnectClient(mConnection);
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
        public int getConnectionId() {
            return mConnection.getId();
        }

        @Override
        public ProtoServer.Connection getServerConnection() {
            return mConnection;
        }

    }

}
