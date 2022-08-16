package server_client

import MessagesState
import ServerClientState
import androidx.compose.runtime.mutableStateListOf
import build.generated.source.proto.main.java.*
import com.google.protobuf.GeneratedMessageV3
import com.google.protobuf.MessageLite
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import servers.ProtoTCPServer
import servers.ProtoUDPServer
import utils.FastServerLogger
import utils.NetworkThread
import java.util.concurrent.Executors

class ServerImpl {
    var messages = mutableStateListOf<String>()
    var msgs = mutableStateListOf<GeneratedMessageV3>()

    private val _serverMessagesState = MutableSharedFlow<MessagesState>()
    val serverMessagesState = _serverMessagesState.asSharedFlow()
    var caughtMessages = mutableStateListOf<MessageLite>()


    val serverMessageState = MutableStateFlow<ServerClientState>(ServerClientState.NotClient)

    @Suppress("PrivatePropertyName")
    private val UDP_PORT_SERVER_PROTO = 4011

    @Suppress("PrivatePropertyName")
    private val TCP_PORT_SERVER_PROTO = 4000

    val logger = FastServerLogger("src/logs/server_logs")
    private val networkThread = NetworkThread(logger)


    private val tcpServer = ProtoTCPServer(TCP_PORT_SERVER_PROTO)
    private val udpServer = ProtoUDPServer(UDP_PORT_SERVER_PROTO)


    fun startWork() {
        tcpServer.startServer()
        udpServer.startServer()
    }

    fun stopWork() {
        tcpServer.stopServer()
        udpServer.stopServer()
    }

}

