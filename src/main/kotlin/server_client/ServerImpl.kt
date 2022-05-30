package server_client

import MessagesState
import ServerClientState
import androidx.compose.runtime.mutableStateListOf
import build.generated.source.proto.main.java.Esp
import com.google.protobuf.GeneratedMessageV3
import com.google.protobuf.MessageLite
import generation_java_files.EspServerApi
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import proto_server_client.utils.HandlerWrapper
import proto_server_client.logger.FastServerLogger
import proto_server_client.servers.*
import proto_server_client.utils.MessageInterceptor
import proto_server_client.utils.NetworkThread
import java.util.concurrent.Executors
import kotlin.random.Random

class ServerImpl :
    MessageInterceptor,
    FastServerLogger.MessagesHandler,
    EspServerApi.OnConnectedListener,
    EspServerApi.OnDisconnectedListener,
    EspServerApi.OnEspSendByUdpListener,
    EspServerApi.OnEspKillWifiAccessPointListener {

    var localConnection: EspServerApi.Connection? = null
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

    val logger = FastServerLogger("src/logs/server_logs", this)
    private val networkThread = NetworkThread(logger)


    private val tcpServer = ProtoTCPServer(TCP_PORT_SERVER_PROTO)
    private val udpServer = ProtoUDPServer(UDP_PORT_SERVER_PROTO)

    val serverApi = EspServerApi()
    private val uiThreadDispatcher = UIThreadServerCommandDispatcher(
        serverApi.protocolDispatcher,
        HandlerWrapper(Executors.newFixedThreadPool(1))
    )

    init {
        tcpServer.setNetworkThread(networkThread)
        udpServer.setNetworkThread(networkThread)

        tcpServer.setMessageInterceptor(this)
        udpServer.setMessageInterceptor(this)

        tcpServer.setServerLogger(logger)
        udpServer.setServerLogger(logger)

        tcpServer.setProtocolDispatcher(uiThreadDispatcher)
        udpServer.setProtocolDispatcher(uiThreadDispatcher)

        serverApi.setOnConnectedListener(this)
        serverApi.setOnDisconnectedListener(this)
        serverApi.setOnEspSendByUdpListener(this)
        serverApi.setOnEspKillWifiAccessPointListener(this)
        networkThread.start()
    }


    fun startWork() {
        tcpServer.startServer()
        udpServer.startServer()
    }

    fun stopWork() {
        tcpServer.stopServer()
        udpServer.stopServer()
    }

    override fun onConnected(connection: EspServerApi.Connection?) {
        connection?.let {
            localConnection = it
            serverMessageState.value = ServerClientState.ConnectedClient
        }
    }

    override fun onDisconnected(connection: EspServerApi.Connection?) {
        connection?.let {
            serverMessageState.value = ServerClientState.DisconnectedClient
        }
        localConnection = null
    }

    override fun onEspSendByUdpReceived(connection: EspServerApi.Connection?, message: Esp.ESPSendByUDP?) {
    }

    override fun onEspKillWifiAccessPointReceived(connection: EspServerApi.Connection?) {
    }

    fun sendListOfMessages() {
        localConnection?.apply {
            sendEspConectionState(
                Esp.ESPConectionState
                    .newBuilder()
                    .setWifiStatus(Random.nextInt(100))
                    .build()
            )
        }
    }

    override fun onNewMessage(message: String?) {
        message?.let {
            CoroutineScope(Dispatchers.Main).launch {
                messages.add(it)
            }
        }
    }

    override fun onMessageCatch(commandId: Int, message: MessageLite?) {
        message?.let {
            caughtMessages.add(it)
        }

        runBlocking{
            _serverMessagesState.emit(MessagesState.Messages(caughtMessages))
        }
    }


}

