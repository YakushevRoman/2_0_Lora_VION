import build.generated.source.proto.main.java.Esp
import generation_java_files.EspServerApi
import kotlinx.coroutines.*
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import server_backend.HandlerWrapper
import server_backend.proto_loggers.FastServerLogger
import server_backend.servers.NetworkThread
import server_backend.servers.ProtoTCPServer
import server_backend.servers.ProtoUDPServer
import server_backend.servers.ServerAutoDiscovery
import server_backend.servers.UIThreadServerCommandDispatcher
import java.util.concurrent.Executors
import kotlin.random.Random
import kotlin.system.measureTimeMillis

internal class ServerTest :
    EspServerApi.OnConnectedListener,
    EspServerApi.OnDisconnectedListener,
    EspServerApi.OnEspConnectToTcpListener {

    @Suppress("PrivatePropertyName")
    private val UDP_PORT_SERVER_PROTO = 4011

    @Suppress("PrivatePropertyName")
    private val TCP_PORT_SERVER_PROTO = 4000

    val logger = FastServerLogger("")
    private val networkThread = NetworkThread(logger)

    private val tcpServer = ProtoTCPServer(TCP_PORT_SERVER_PROTO)
    private val udpServer = ProtoUDPServer(UDP_PORT_SERVER_PROTO)

    var autoDiscoveryServer = ServerAutoDiscovery(
        networkThread,
        Random(100).nextInt(),
        UDP_PORT_SERVER_PROTO
    )

    private val serverApi = EspServerApi()
    private val uiThreadDispatcher = UIThreadServerCommandDispatcher(
        serverApi.protocolDispatcher,
        HandlerWrapper(Executors.newFixedThreadPool(1))
    )

    init {
        serverApi.setOnConnectedListener(this)
        serverApi.setOnDisconnectedListener(this)

        tcpServer.setProtocolDispatcher(uiThreadDispatcher)
        tcpServer.setNetworkThread(networkThread)

        udpServer.setProtocolDispatcher(uiThreadDispatcher)
        udpServer.setNetworkThread(networkThread)
    }

    @BeforeEach
    fun before() {
        tcpServer.startServer()
        udpServer.startServer()
        autoDiscoveryServer.start()
    }

    @Test
    fun serverWork() {
        runBlocking {
            println("Waiting clients ...")
            val a1 = GlobalScope.async {
                repeat(1000) {
                    delay(1000)
                    println("$it")
                }
            }

            a1.await()
            println("End")
        }
    }

    @AfterEach
    fun after() {
        tcpServer.stopServer()
        udpServer.stopServer()
    }

    override fun onConnected(connection: EspServerApi.Connection?) {
        connection?.let {
            print("onConnected")
        }
    }

    override fun onDisconnected(connection: EspServerApi.Connection?) {
        connection?.let {
            print("onDisconnected")

        }
    }

    override fun onEspConnectToTcpReceived(connection: EspServerApi.Connection?, message: Esp.ESPConnectToTCP?) {
        connection?.let {
            print("onEspConnectToTcpReceived")

        }
    }


}
