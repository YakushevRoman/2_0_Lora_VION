package generation


import com.google.protobuf.CodedInputStream
import com.google.protobuf.Message
import generation.files.ProtoServer
import generation.files.ProtoServer.ProtocolDispatcher
import java.io.IOException

class KotlinServerApi {

    interface Connection {
        // для 2 параметров метода доп метод с деф реализ
        fun sendStartGame(message: StartGame): Boolean
        fun sendStopGame(): Boolean
        fun disconnect()

        // для примера использования block
        //fun sendGps(block: GpsParameterKt.Dsl.() -> Unit): Boolean

        var attachment: Any?
        val serverConnection: ProtoServer.Connection
    }


    interface OnHelloFromDevListener {
        fun onHelloFromDevReceived(connection: Connection?, message: HelloFromDev)
    }

    interface OnPingListener {
        fun onPingReceived(connection: Connection?)
    }

    interface OnConnectedListener {
        fun onConnected(connection: Connection?)
    }

    interface OnDisconnectedListener {
        fun onDisconnected(connection: Connection?)
    }

    @Volatile
    var onHelloFromDevListener: OnHelloFromDevListener? = null

    @Volatile
    var onPingListener: OnPingListener? = null

    @Volatile
    var onConnectedListener: OnConnectedListener? = null

    @Volatile
    var onDisconnectedListener: OnDisconnectedListener? = null

    private fun notifyHelloFromDevReceived(connection: ProtoServer.Connection, message: HelloFromDev) {
        onHelloFromDevListener?.apply {
            onHelloFromDevReceived(connection.getApi(), message)
        }
    }

    private fun notifyPingReceived(connection: ProtoServer.Connection) {
        val localCopy = onPingListener
        localCopy?.apply {
            onPingReceived(connection.getApi())
        }
    }

    val protocolDispatcher: ProtocolDispatcher = object : ProtocolDispatcher {

        @Throws(IOException::class)
        override fun parseMessage(commandId: Int, inputStream: CodedInputStream?): Message? {
            return when (commandId) {
                1 -> HelloFromDev.parser().parsePartialFrom(inputStream)
                5 -> ForpostServer.ChangeId.parser().parsePartialFrom(inputStream)
                else -> null
            }
        }

        override fun dispatchMessage(connection: ProtoServer.Connection, commandId: Int, message: Message) {
            return when (commandId) {
                1 -> notifyHelloFromDevReceived(connection, message as HelloFromDev)
                7 -> notifyPingReceived(connection)
                else -> {}
            }
        }

        override fun notifyOnConnected(connection: ProtoServer.Connection) {
            val conn = ConnectionImpl(connection)
            connection.setApi(conn)
            val localCopy = onConnectedListener
            localCopy?.onConnected(conn)
        }

        override fun notifyOnDisconnected(connection: ProtoServer.Connection) {
            val localCopy = onDisconnectedListener
            localCopy?.onDisconnected(connection.getApi())
        }
    }

    internal class ConnectionImpl(override val serverConnection: ProtoServer.Connection) : Connection {
        private val server: ProtoServer = serverConnection.getServer()

        override var attachment: Any? = null

        override fun sendStartGame(message: StartGame): Boolean =
            server.sendCommand(serverConnection, 3, message)

        override fun sendStopGame(): Boolean =
            server.sendCommand(serverConnection, 4, null)

        override fun disconnect() =
            server.disconnectClient(serverConnection)

        // для примера использования block
        //override fun sendGps(block: GpsParameterKt.Dsl.() -> Unit): Boolean =
         //   server.sendCommand(serverConnection, 5, block)

    }

    fun getSendCommandName(commandId: Int): String =
        when (commandId) {
            1 -> "StatFromKit"
            2 -> "SettingsArena25"
            3 -> "StartGame"
            4 -> "StopGame"
            5 -> "Respawn"
            else -> "Unknown command id"
        }

    fun getRecvCommandName(commandId: Int): String =
        when (commandId) {
            0 -> "HelloFromDev"
            1 -> "StatFromKit"
            2 -> "SettingsArena25"
            29 -> "SetFlagState"
            12 -> "ChangeId"
            19 -> "StatById"
            17 -> "Ping"
            else -> "Unknown command id"
        }


}