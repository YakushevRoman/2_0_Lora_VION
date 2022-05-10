package generation;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Message;
import generation.files.ForpostServer;
import generation.files.ProtoServer;

import java.io.IOException;

class JavaServerApi {

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
        public void dispatchMessage(ProtoServer.Connection connection, int commandId, Message message) {
            switch (commandId) {
                case 1:
                    notifyHelloFromDevReceived(connection, (ForpostServer.HelloFromDev) message);
                case 7:
                    notifyPingReceived(connection);
                default:
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

    public static String getSendCommandName(int commandId) {
        switch (commandId) {
            case 1:
                return "StatFromKit";
            case 2:
                return "SettingsArena25";
            case 3:
                return "StartGame";
            case 4:
                return "StopGame";
            case 5:
                return "Respawn";
            case 6:
                return "ReturnToDefSettings";
            case 7:
                return "Radiation";
            case 8:
                return "DoubleHealth";
            case 9:
                return "AddHealth";
            case 10:
                return "PauseGame";
            case 11:
                return "KillPlayer";
            case 12:
                return "ChangeId";
            case 13:
                return "ChangeColor";
            case 14:
                return "SetVolume";
            case 15:
                return "ResetStat";
            case 16:
                return "MilesCommand";
            case 17:
                return "Ping";
            case 18:
                return "StatFromServerToKit";
            case 19:
                return "StatById";
            case 20:
                return "GetSettingsArena25";
            case 21:
                return "GetAllStatArena25";
            case 22:
                return "SetIRstrength";
            case 23:
                return "GetBatteryLevel";
            case 24:
                return "SetBrightnes";
            case 25:
                return "UpdateDev";
            case 26:
                return "SetLanguage";
            case 27:
                return "ScoreAndPlace";
            case 28:
                return "SetPlayTime";
            case 29:
                return "SetFlagState";
            case 30:
                return "PlaySound";
            case 31:
                return "StopSound";
            case 32:
                return "GetSoundsInfo";
            case 33:
                return "DevGameStatRequest";
            case 34:
                return "SendDevType";
            case 35:
                return "DiffDamage";
            case 36:
                return "TurnOffDevice";
            case 37:
                return "GetInfoSlaves";
            case 38:
                return "SetGameId";
            case 39:
                return "AdditionalFunctionality";
            case 40:
                return "PresetSettings";
            case 41:
                return "WeaponSettings";
            case 42:
                return "BleedingSet";
            case 43:
                return "PlayersTable";
            case 44:
                return "SetHealth";
            case 45:
                return "SetDefHealth";
            case 46:
                return "StressBeltSettings";
            case 47:
                return "SuperModeSettings";
            case 48:
                return "GetSuperModeSettings";
            case 49:
                return "SettingsHealingRun";
            case 50:
                return "SettingsNotAgr";
            case 51:
                return "SettingsRadiationOrMedicineMode";
            case 52:
                return "SettingsRespawnMode";
            case 53:
                return "SettingsAmmoMode";
            case 54:
                return "SettingsControlPoint";
            case 55:
                return "SettingsBazeMode";
            case 56:
                return "SettingsRandomMode";
            case 57:
                return "SettingsBonusMode";
            case 58:
                return "SettingsTimeCapture";
            case 59:
                return "SettingsCaptureByShot";
            case 60:
                return "SettingsTugOfWar";
            case 61:
                return "SettingsThreePerson";
            case 62:
                return "SettingsCaptureFlag";
            case 63:
                return "CurrentCaptureColorTeam";
            case 64:
                return "CaptureRateInPercent";
            case 65:
                return "TimeHoldByTeam";
            case 66:
                return "RemainTimeToWin";
            case 67:
                return "CurrentHealth";
            case 68:
                return "SettingsCtfMode";
            case 69:
                return "GenerateFlag";
            case 70:
                return "FlagStat";
            case 71:
                return "SettingsBombMode";
            case 72:
                return "LowLevelDeviceConfig";
            case 150:
                return "CustomTestMode";
            case 156:
                return "BobmProSettings";
            case 157:
                return "BobmProBreakActions";
            case 158:
                return "BombPlayersTable";
            case 1101:
                return "Reboot";
            case 1102:
                return "VersionRequest";
            case 1103:
                return "FirmwareTask";
            case 1104:
                return "BeginUpdateResources";
            case 1105:
                return "FinishUpdateResources";
            case 1201:
                return "GetStack";
            case 1202:
                return "GetBuffersState";
            case 1203:
                return "SomeData";
            case 1204:
                return "RuntimeError";
            case 1205:
                return "RuntimeGetErrors";
            case 1206:
                return "RuntimeClearErrorMessages";
            case 2001:
                return "EspReboot";
            case 2002:
                return "EspVersionRequest";
            case 2003:
                return "EspFirmwareTask";
            case 2005:
                return "EspSomeData";
            case 2006:
                return "EspRuntimeError";
            case 2007:
                return "EspBeginUpdateResources";
            case 2008:
                return "EspFinishUpdateResources";
            default:
                return "";
        }
    }

    public static String getRecvCommandName(int commandId) {
        switch (commandId) {
            case 0:
                return "HelloFromDev";
            case 1:
                return "StatFromKit";
            case 2:
                return "SettingsArena25";
            case 29:
                return "SetFlagState";
            case 12:
                return "ChangeId";
            case 19:
                return "StatById";
            case 17:
                return "Ping";
            case 0:
                return "SoundsInfoResponce";
            case 0:
                return "DevGameStatResponse";
            case 39:
                return "AdditionalFunctionality";
            case 40:
                return "PresetSettings";
            case 41:
                return "WeaponSettings";
            case 0:
                return "PlayersTableTimeStamp";
            case 43:
                return "PlayersTable";
            case 47:
                return "SuperModeSettings";
            case 0:
                return "StatusSuperMode";
            case 0:
                return "MiTagStatus";
            case 0:
                return "NotAgrStatus";
            case 0:
                return "ResponseBatteryLevel";
            case 0:
                return "Error";
            case 26:
                return "SetLanguage";
            case 34:
                return "SendDevType";
            case 72:
                return "LowLevelDeviceConfig";
            case 0:
                return "InformationMsg";
            case 0:
                return "SlavesInfoResponce";
            case 0:
                return "SlaveDisconnected";
            case 0:
                return "SlaveInfo";
            case 46:
                return "StressBeltSettings";
            case 0:
                return "StressBeltCheangeDamageMode";
            case 0:
                return "StatusSubGhz";
            case 0:
                return "WinTeamColor";
            case 63:
                return "CurrentCaptureColorTeam";
            case 64:
                return "CaptureRateInPercent";
            case 65:
                return "TimeHoldByTeam";
            case 66:
                return "RemainTimeToWin";
            case 67:
                return "CurrentHealth";
            case 0:
                return "GameStatusDev";
            case 0:
                return "FlagTaken";
            case 0:
                return "FlagReceived";
            case 70:
                return "FlagStat";
            case 0:
                return "BombStatus";
            case 0:
                return "BobmProActions";
            case 0:
                return "BombProHasBeenExploded";
            case 0:
                return "BombProHasBeenInstalled";
            case 0:
                return "BombProHasBeenDeinstalled";
            case 0:
                return "BombProCheatHasBeenDetected";
            case 156:
                return "BobmProSettings";
            case 0:
                return "VersionReply";
            case 0:
                return "UpdateResourcesReply";
            case 0:
                return "FirmwareTaskReply";
            case 0:
                return "StackState";
            case 0:
                return "StackUsage";
            case 0:
                return "Assert";
            case 0:
                return "BuffersState";
            case 1203:
                return "SomeData";
            case 1204:
                return "RuntimeError";
            case 0:
                return "RuntimeSystemSnapshot";
            case 0:
                return "EspWiFiRssi";
            case 0:
                return "EspAssert";
            case 0:
                return "EspVersionReply";
            case 0:
                return "EspFirmwareTaskReply";
            case 0:
                return "EspUpdateResourcesReply";
            case 2005:
                return "EspSomeData";
            case 2006:
                return "EspRuntimeError";
            default:
                return;
        }
    }
}
