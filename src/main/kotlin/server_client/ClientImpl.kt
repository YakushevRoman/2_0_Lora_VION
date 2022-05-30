package server_client

import MessagesState
import androidx.compose.runtime.mutableStateListOf
import build.generated.source.proto.main.java.Esp
import build.generated.source.proto.main.java.eSPSendByUDP
import com.google.protobuf.MessageLite
import generation_java_files.EspClientApi
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import proto_server_client.utils.HandlerWrapper
import proto_server_client.client.ProtoClient
import proto_server_client.logger.FastServerLogger
import proto_server_client.utils.MessageInterceptor
import proto_server_client.utils.NetworkThread
import proto_server_client.utils.ServerAutoDiscovery
import java.net.InetAddress
import java.util.concurrent.Executors


class ClientImpl :
    FastServerLogger.MessagesHandler,
    EspClientApi.OnConnectedListener,
    EspClientApi.OnDisconnectedListener,
    EspClientApi.OnEspConectionStateListener,
    MessageInterceptor {

    var messages = mutableStateListOf<String>()

    private val _clientMessagesState = MutableSharedFlow<MessagesState>()
    val clientMessagesState = _clientMessagesState.asSharedFlow()

    var caughtMessages = mutableStateListOf<MessageLite>()

    @Suppress("PrivatePropertyName")
    private val UDP_PORT_SERVER_PROTO = 4011

    val logger = FastServerLogger("src/logs/client_logs", this)
    private val networkThread = NetworkThread(logger)

    var autoDiscoveryServer = ServerAutoDiscovery(
        networkThread,
        1111,
        UDP_PORT_SERVER_PROTO
    )

    // need to add logger for client a path
    val client = ProtoClient(logger, true)

    val clientApi = EspClientApi(
        client,
        true,
        HandlerWrapper(Executors.newFixedThreadPool(1))
    )

    init {
        clientApi.setOnConnectedListener(this)
        clientApi.setOnDisconnectedListener(this)
        clientApi.setOnEspConectionStateListener(this)

        client.setProtocolDispatcher(clientApi)
        client.setMessageInterceptor(this)
    }

    fun startWork() {
        //autoDiscoveryServer.start()

        client.connect(InetAddress.getByName("localhost").hostAddress, 4000)
    }

    fun stopWork() {
        client.stopClient()
    }

    override fun onConnected() {

        CoroutineScope(Dispatchers.Default).launch {
            _clientMessagesState.emit(MessagesState.Empty)
        }
    }

    override fun onDisconnected() {
        client.isConnected = false
    }

    // rules for sending messages to server
    public fun sendMessages() {
        clientApi.sendEspSendByUdp(eSPSendByUDP {
            ip = "234"
            port = 4444
        })
    }

    override fun onEspConectionStateReceived(message: Esp.ESPConectionState?) {
    }

    override fun onNewMessage(message: String?) {
        message?.let {
            CoroutineScope(Dispatchers.Main).launch {
                messages.add(it)
            }
        }
    }

    fun reconect() {
        client.connect(InetAddress.getByName("localhost").hostAddress, 4000)
    }

    override fun onMessageCatch(commandId: Int, message: MessageLite?) {
        message?.let {
            caughtMessages.add(it)
        }

        runBlocking{
            _clientMessagesState.emit(MessagesState.Messages(caughtMessages))
        }
    }


}