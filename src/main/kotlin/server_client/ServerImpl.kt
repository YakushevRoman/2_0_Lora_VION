package server_client

import build.generated.source.proto.main.java.Esp
import generation_java_files.EspServerApi
import server_backend.HandlerWrapper
import server_backend.proto_loggers.FastServerLogger
import server_backend.servers.*
import java.util.concurrent.Executors
import kotlin.random.Random

class ServerImpl(private val listener: OnNewMessageListener) :
    EspServerApi.OnConnectedListener,
    EspServerApi.OnDisconnectedListener,
    EspServerApi.OnEspSendByUdpListener,
    EspServerApi.OnEspKillWifiAccessPointListener{

    var localConnection: EspServerApi.Connection? = null

    @Suppress("PrivatePropertyName")
    private val UDP_PORT_SERVER_PROTO = 4011

    @Suppress("PrivatePropertyName")
    private val TCP_PORT_SERVER_PROTO = 4000

    val logger = FastServerLogger("src/kotlin_api_examples")
    private val networkThread = NetworkThread(logger)

    private val tcpServer = ProtoTCPServer(TCP_PORT_SERVER_PROTO)
    private val udpServer = ProtoUDPServer(UDP_PORT_SERVER_PROTO)

    private val serverApi = EspServerApi()
    private val uiThreadDispatcher = UIThreadServerCommandDispatcher(
        serverApi.protocolDispatcher,
        HandlerWrapper(Executors.newFixedThreadPool(1))
    )

    init {
        networkThread.start()

        tcpServer.setNetworkThread(networkThread)
        udpServer.setNetworkThread(networkThread)

        tcpServer.setProtocolDispatcher(uiThreadDispatcher)
        udpServer.setProtocolDispatcher(uiThreadDispatcher)

        serverApi.setOnConnectedListener(this)
        serverApi.setOnDisconnectedListener(this)
        serverApi.setOnEspSendByUdpListener(this)
        serverApi.setOnEspKillWifiAccessPointListener(this)
    }


    fun startWork() {
        tcpServer.startServer()
        udpServer.startServer()
    }

    fun after() {
        tcpServer.stopServer()
        udpServer.stopServer()
    }

    interface OnNewMessageListener {
        fun newMessage(message: String)
    }

    override fun onConnected(connection: EspServerApi.Connection?) {
        connection?.let {
            localConnection = it
            listener.newMessage("onConnected")
        }
    }

    override fun onDisconnected(connection: EspServerApi.Connection?) {
        connection?.let {
            listener.newMessage("onDisconnected")
        }
    }


    override fun onEspSendByUdpReceived(connection: EspServerApi.Connection?, message: Esp.ESPSendByUDP?) {
        connection?.let {
            listener.newMessage("onEspSendByUdpReceived")
        }
    }

    override fun onEspKillWifiAccessPointReceived(connection: EspServerApi.Connection?) {
        connection?.let {
            listener.newMessage("onEspKillWifiAccessPointReceived")
        }
    }

    fun sendListOfMessages (){
        localConnection?.apply {
            sendEspConectionState(
                Esp.ESPConectionState
                    .newBuilder()
                    .setWifiStatus(Random.nextInt(100))
                    .build()
            )
        }
    }

}

