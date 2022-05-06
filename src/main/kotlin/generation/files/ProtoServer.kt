package generation.files

import com.google.protobuf.CodedInputStream
import com.google.protobuf.Message
import generation.KotlinServerApi

import java.io.IOException



// https://github.com/protocolbuffers/protobuf/releases
class ProtoServer {
    
    fun sendCommand(connection: Connection, i: Int, message: Any?): Boolean {

        return false
    }

    fun disconnectClient(connection: Connection) {

    }

    fun sendMessageName(idMassage : Int) : String = ""

    fun recieveMessageName(idMassage : String)  : String = ""

    public interface Connection {
        fun setApi(o: Any?)
        fun getApi () : KotlinServerApi.Connection
        fun getServer(): ProtoServer
    }

    interface ProtocolDispatcher {
        @Throws(IOException::class)
        fun parseMessage(commandId: Int, inputStream: CodedInputStream?): Message?
        fun dispatchMessage(connection: Connection, commandId: Int, message: Message)
        fun notifyOnDisconnected(connection: Connection)
        fun notifyOnConnected(connection: Connection)
    }


}