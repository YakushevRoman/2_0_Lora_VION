package generation


import com.google.protobuf.CodedInputStream
import com.google.protobuf.Message
import generation.ForpostServer.HelloFromDev
import generation.ForpostServer.StartGame
import generation.ProtoServer.ProtocolDispatcher
import java.io.IOException

class KotlinApi {

    interface Connection {
        fun sendStartGame(message: StartGame): Boolean
        fun sendStopGame(): Boolean
        fun disconnect()

        var attachment: Any?
        val serverConnection: ProtoServer.Connection?
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

    private fun notifyHelloFromDevReceived(connection: ProtoServer.Connection, message: HelloFromDev): Boolean {
        val localCopy = onHelloFromDevListener
        localCopy?.apply {
            onHelloFromDevReceived(connection.getApi(), message)
            return true
        }
        return false
    }

    private fun notifyPingReceived(connection: ProtoServer.Connection): Boolean {
        val localCopy = onPingListener
        localCopy?.apply {
            onPingReceived(connection.getApi())
            return true
        }
        return false
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

        override fun dispatchMessage(connection: ProtoServer.Connection, commandId: Int, message: Message): Boolean {
            return when (commandId) {
                1 -> notifyHelloFromDevReceived(connection, message as HelloFromDev)
                7 -> notifyPingReceived(connection)
                else -> false
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
    }

}