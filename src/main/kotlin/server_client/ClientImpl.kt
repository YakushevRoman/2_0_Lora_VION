package server_client

import androidx.compose.runtime.mutableStateListOf
import build.generated.source.proto.main.java.Esp
import build.generated.source.proto.main.java.eSPSendByUDP
import generation_java_files.EspClientApi
import server_backend.HandlerWrapper
import server_backend.ProtoClient
import server_backend.proto_loggers.FastServerLogger
import server_backend.servers.NetworkThread
import server_backend.servers.ServerAutoDiscovery
import java.net.InetAddress
import java.util.concurrent.Executors


class ClientImpl :
    FastServerLogger.MessagesHandler,
    EspClientApi.OnConnectedListener,
    EspClientApi.OnDisconnectedListener,
    EspClientApi.OnEspConectionStateListener {

    var messages = mutableStateListOf<String>()
    @Suppress("PrivatePropertyName")
    private val UDP_PORT_SERVER_PROTO = 4011

    val logger = FastServerLogger("src/kotlin_api_examples", this)
    private val networkThread = NetworkThread(logger)

    var autoDiscoveryServer = ServerAutoDiscovery(
        networkThread,
        1111,
        UDP_PORT_SERVER_PROTO
    )

    // need to add logger for client a path
    val client = ProtoClient()

    private val clientApi = EspClientApi(
        client,
        true,
        HandlerWrapper(Executors.newFixedThreadPool(1))
    )

    init {
        clientApi.setOnConnectedListener(this)
        clientApi.setOnDisconnectedListener(this)
        clientApi.setOnEspConectionStateListener(this)

        client.setProtocolDispatcher(clientApi)
    }

    fun startWork() {
        autoDiscoveryServer.start()

        client.connect(InetAddress.getByName("localhost").hostAddress, 4000)
    }

    fun after() {
        client.stopClient()
    }

    override fun onConnected() {
        messages.add("CONNECTED TO SERVER")
    }

    override fun onDisconnected() {
        messages.add("DISCONNECTED FROM SERVER")

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
        messages.add(message.toString())
    }

    override fun onNewMessage(message: String?) {
        message?.let {
            messages.add(it)
        }
    }

}