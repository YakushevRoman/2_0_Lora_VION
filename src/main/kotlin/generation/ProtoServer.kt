package generation

import com.google.protobuf.CodedInputStream
import com.google.protobuf.Message

import java.io.IOException




class ProtoServer {
    
    fun sendCommand(connection: ProtoServer.Connection, i: Int, message: Any?): Boolean {

        return false
    }

    fun disconnectClient(connection: ProtoServer.Connection) {

    }

    public interface Connection {
        fun setApi(o: Any?)
        fun getApi () : KotlinApi.Connection
        fun getServer(): ProtoServer
    }

    interface ProtocolDispatcher {
        @Throws(IOException::class)
        fun parseMessage(commandId: Int, inputStream: CodedInputStream?): Message?
        fun dispatchMessage(connection: Connection, commandId: Int, message: Message): Boolean
        fun notifyOnDisconnected(connection: Connection)
        fun notifyOnConnected(connection: Connection)
    }


}