package server_client

import androidx.compose.runtime.mutableStateListOf
import build.generated.source.proto.main.java.Esp
import generation_java_files.EspServerApi
import kotlinx.coroutines.*
import proto_server_client.utils.HandlerWrapper
import proto_server_client.logger.FastServerLogger
import proto_server_client.servers.*
import proto_server_client.utils.NetworkThread
import java.util.concurrent.Executors
import kotlin.random.Random

class ServerImpl:
    FastServerLogger.MessagesHandler,
    EspServerApi.OnConnectedListener,
    EspServerApi.OnDisconnectedListener,
    EspServerApi.OnEspSendByUdpListener,
    EspServerApi.OnEspKillWifiAccessPointListener {

    var localConnection: EspServerApi.Connection? = null
    var messages = mutableStateListOf<String>()

    @Suppress("PrivatePropertyName")
    private val UDP_PORT_SERVER_PROTO = 4011

    @Suppress("PrivatePropertyName")
    private val TCP_PORT_SERVER_PROTO = 4000

    val logger = FastServerLogger("src/logs/server_logs", this)
    private val networkThread = NetworkThread(logger)


    private val tcpServer = ProtoTCPServer(TCP_PORT_SERVER_PROTO)
    private val udpServer = ProtoUDPServer(UDP_PORT_SERVER_PROTO)

    private val serverApi = EspServerApi()
    private val uiThreadDispatcher = UIThreadServerCommandDispatcher(
        serverApi.protocolDispatcher,
        HandlerWrapper(Executors.newFixedThreadPool(1))
    )

    init {
        tcpServer.setNetworkThread(networkThread)
        udpServer.setNetworkThread(networkThread)

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

    fun after() {
        tcpServer.stopServer()
        udpServer.stopServer()
    }

    override fun onConnected(connection: EspServerApi.Connection?) {
        connection?.let {
            localConnection = it
        }
    }

    override fun onDisconnected(connection: EspServerApi.Connection?) {
        connection?.let {
            // dododo
        }
    }


    override fun onEspSendByUdpReceived(connection: EspServerApi.Connection?, message: Esp.ESPSendByUDP?) {
        connection?.let {
            // dododo
        }
    }

    override fun onEspKillWifiAccessPointReceived(connection: EspServerApi.Connection?) {
        connection?.let {
            // dododo
        }
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


}

