package generation.server_backend.kotlin

import com.google.protobuf.CodedInputStream
import com.google.protobuf.CodedOutputStream
import com.google.protobuf.Message
import com.google.protobuf.MessageLite
import generation.server_backend.servers.NetworkThread
import generation.server_backend.servers.NetworkThread.ProtocolHandler
import generation.server_backend.proto_loggers.LogType
import java.net.SocketAddress
import kotlin.Throws
import java.io.IOException
import generation.server_backend.servers.NetworkThread.ThreadMessage
import java.lang.StringBuilder
import kotlin.experimental.and

/**
 * @implNote -  NOTE tagger internally uses 512 byte buffer for commands
 * so it cannot process command larger than 512 bytes.
 * if you communicate with tagger directly, make sure that this value is 512 or less.
 * you can use bigger value if other side is not a tagger (and not a low resource device).
 * static final int MAX_SEND_COMMAND_SIZE = 512; // must be 512 or less for communication with tagger
 */
abstract class ProtoServer {
    private val protocolName: String = this.javaClass.simpleName

    private var logFactory: LogFactory? = null
    private var mainLog: LogWriter? = null
    var mProtocolDispatcher: ProtocolDispatcher? = null
    var mNetworkThread: NetworkThread? = null
    private var mProtocolHandler: ProtocolHandler? = null


    protected abstract fun sendCommand(connection: Connection?, data: ByteArray?)
    protected abstract fun sendBroadcast(data: ByteArray?)
    protected abstract fun closeConnection(connection: Connection?)
    protected abstract val protocolHandler: ProtocolHandler?

    interface LogWriter {
        fun writeLine(line: String?)
        fun writeMessage(logType: LogType, msg: Message?, commandID: Int)
        fun close()
    }

    interface LogFactory {
        fun openConnectionLog(address: SocketAddress?): LogWriter?
        fun getMainLog(): LogWriter?
    }

    interface Connection {
        var api: Any?
        val isConnected: Boolean
        val server: ProtoServer
        val logger: LogWriter?
    }

    interface ProtocolDispatcher {
        @Throws(IOException::class)
        fun parseMessage(commandId: Int, inputStream: CodedInputStream?): Message?
        fun dispatchMessage(connection: Connection, commandId: Int, message: Message?)
        fun notifyOnDisconnected(connection: Connection)
        fun notifyOnError(connection: Connection, error: Throwable)
        fun notifyOnConnected(connection: Connection)
    }


    private fun serializeMessage(commandId: Int, message: MessageLite?): ByteArray? {
        return try {
            val cmdSize = CodedOutputStream.computeUInt32SizeNoTag(commandId)
            if (message == null) {
                val res = ByteArray(cmdSize + 1)
                val stream = CodedOutputStream.newInstance(res)
                stream.writeUInt32NoTag(commandId)
                res[cmdSize] = 0
                return res
            }
            val msgSize = CodedOutputStream.computeMessageSizeNoTag(message)
            val totalSize = cmdSize + msgSize
            if (totalSize > MAX_SEND_COMMAND_SIZE) {
                writeToMainLog("ERROR: $protocolName command size exceed MAX_SEND_COMMAND_SIZE limit." +
                        "tagger cannot handle big commands cmdId = $commandId " +
                        "commandSize = $totalSize"
                )
                return null
            }
            val res = ByteArray(totalSize)
            val stream = CodedOutputStream.newInstance(res)
            stream.writeUInt32NoTag(commandId)
            stream.writeMessageNoTag(message)
            res
        } catch (e: IOException) {
            writeToMainLog("ERROR: $protocolName serializeMessage failed. " +
                    "Make sure that message is not modified from another threads during serialization " +
                    "cmdId = $commandId ${e.message}"
            )
            null
        }
    }

    fun notifyOnConnected(connection: Connection) {
        val logger = connection.logger
        logger?.writeLine("NEW CLIENT CONNECTED")

        mProtocolDispatcher?.notifyOnConnected(connection)
    }

    fun notifyOnError(connection: Connection, error: Throwable) {
        val logger = connection.logger
        logger?.writeLine("ERROR:${exceptionStackTrace(error)}".trimIndent())

        mProtocolDispatcher?.notifyOnError(connection, error)
    }

    fun notifyOnDisconnected(connection: Connection) {
        val logger = connection.logger
        logger?.writeLine("CLIENT DISCONNECTED ${threadCurrentStackTrace()}".trimIndent())

        mProtocolDispatcher?.notifyOnDisconnected(connection)
    }

    private fun writeToMainLog(message: String?) =
        logFactory?.getMainLog()?.writeLine(message)

    fun sendCommand(connection: Connection, commandId: Int, message: Message?): Boolean {
        val logger = connection.logger
        logger?.writeMessage(LogType.SENDER, message, commandId)
        val data = serializeMessage(commandId, message) ?: return false
        logger?.writeLine(
            "Send msg: " + bytesToHex(
                data,
                0,
                data.size
            )
        )
        mNetworkThread?.postMessage(SendCommand(connection, data))
        return true
    }

    fun disconnectClient(connection: Connection?) {
        mNetworkThread?.postMessage(SendCommand(connection, null))
    }

    fun startServer() {
        if (mNetworkThread == null) {
            mNetworkThread = NetworkThread(logFactory)
            mNetworkThread!!.start()
        }

        mProtocolHandler = protocolHandler
        mNetworkThread?.startProtoHandler(mProtocolHandler)
        writeToMainLog("$protocolName: server started")
    }

    fun stopServer() {
        mNetworkThread?.stopProtoHandler(mProtocolHandler)
    }

    private fun threadCurrentStackTrace(): String {
        val builder = StringBuilder()
        for (ste in Thread.currentThread().stackTrace)
            builder.append(ste).append("\n")

        return builder.toString()
    }

    private fun exceptionStackTrace(throwable: Throwable): String {
        val builder = StringBuilder()
        builder.append(throwable.toString()).append("\n")
        for (ste in throwable.stackTrace)
            builder.append(ste).append("\n")

        return builder.toString()
    }

    private inner class SendCommand(var mConnection: Connection?, var mData: ByteArray?) : ThreadMessage {
        override fun execute() = if (mData != null) {
            if (mConnection != null) {
                sendCommand(mConnection, mData)
            } else {
                sendBroadcast(mData)
            }
        } else {
            closeConnection(mConnection)
        }
    }

    companion object {
        const val MAX_SEND_COMMAND_SIZE = 512
        private val hexChars = "0123456789ABCDEF".toCharArray()
        fun bytesToHex(bytes: ByteArray, from: Int, end: Int): String {
            val len = end - from
            val hexData = CharArray(len * 2)
            for (j in 0 until len) {
                val v: Int = bytes[from + j] and 0xFF
                hexData[j * 2] = hexChars[v ushr 4]
                hexData[j * 2 + 1] = hexChars[v and 0x0F]
            }
            return String(hexData)
        }
    }
}