// Generated by the protocol buffer compiler. DO NOT EDIT!
package generation

import com.google.protobuf.CodedInputStream
import com.google.protobuf.MessageLite
import generation.files.ProtoClient
import generation.server_backend.servers.UIThreadClientCommandDispatcher.UiThreadExecutor
import kotlin.jvm.Volatile
import generation.server_backend.servers.UIThreadClientCommandDispatcher
import kotlin.Throws
import java.io.IOException

class KotlinClientApi(
    val client: ProtoClient,
    callListenersInUIThread: Boolean,
    executor: UiThreadExecutor
) : ProtoClient.ProtocolDispatcher {

    init {
        if (callListenersInUIThread)
            client.setProtocolDispatcher(
                UIThreadClientCommandDispatcher(
                    this,
                    executor
                )
            )
        else
            client.setProtocolDispatcher(this)
    }

    fun sendHelloFromDev(message: ForpostServer.HelloFromDev): Boolean =
        client.sendCommand(1, message)

    fun sendPing(): Boolean =
        client.sendCommand(7, null)

    fun disconnect() =
        client.disconnect()

    interface OnStartGameListener {
        fun onStartGameReceived(message: ForpostServer.StartGame?)
    }

    interface OnStopGameListener {
        fun onStopGameReceived()
    }

    interface OnConnectedListener {
        fun onConnected()
    }

    interface OnErrorListener {
        fun onError(error: Throwable?)
    }

    interface OnDisconnectedListener {
        fun onDisconnected()
    }

    @Volatile
    var onStartGameListener: OnStartGameListener? = null

    @Volatile
    var onStopGameListener: OnStopGameListener? = null

    @Volatile
    var onConnectedListener: OnConnectedListener? = null

    @Volatile
    var onErrorListener: OnErrorListener? = null

    @Volatile
    var onDisconnectedListener: OnDisconnectedListener? = null


    private fun notifyStartGameReceived(message: ForpostServer.StartGame) {
        val localCopy = onStartGameListener
        localCopy?.onStartGameReceived(message)
    }

    private fun notifyStopGameReceived() {
        val localCopy = onStopGameListener
        localCopy?.onStopGameReceived()
    }

    override fun notifyOnConnected() {
        val localCopy = onConnectedListener
        localCopy?.onConnected()
    }

    override fun notifyOnError(error: Throwable) {
        val localCopy = onErrorListener
        localCopy?.onError(error)
    }

    override fun notifyOnDisconnected() {
        val localCopy = onDisconnectedListener
        localCopy?.onDisconnected()
    }

    @Throws(IOException::class)
    override fun parseMessage(commandId: Int, inputStream: CodedInputStream): MessageLite? {
        return when (commandId) {
            3 -> ForpostServer.StartGame.parser().parsePartialFrom(inputStream)
            12 -> ForpostServer.ChangeId.parser().parsePartialFrom(inputStream)
            else -> null
        }
    }

    override fun dispatchMessage(commandId: Int, message: MessageLite) {
        when (commandId) {
            3 -> notifyStartGameReceived(message as ForpostServer.StartGame)
            4 -> notifyStopGameReceived()
            else -> {}
        }
    }
}