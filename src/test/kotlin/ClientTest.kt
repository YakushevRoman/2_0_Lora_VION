import generation_java_files.EspClientApi
import generation_java_files.EspServerApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import server_backend.HandlerWrapper
import server_backend.proto_loggers.FastServerLogger
import server_backend.servers.NetworkThread
import server_backend.servers.ServerAutoDiscovery
import java.util.concurrent.Executors
import kotlin.random.Random

internal class ClientTest : EspServerApi.OnConnectedListener, EspServerApi.OnDisconnectedListener {

    @Suppress("PrivatePropertyName")
    private val UDP_PORT_SERVER_PROTO = 4011

    val logger = FastServerLogger("")
    private val networkThread = NetworkThread(logger)

    var autoDiscoveryServer = ServerAutoDiscovery(
        networkThread,
        Random(100).nextInt(),
        UDP_PORT_SERVER_PROTO
    )

    val client = ProtoClient()

    private val clientApi = EspClientApi(
        client,
        true,
        HandlerWrapper(Executors.newFixedThreadPool(1))
    )

    init {
        client.setProtocolDispatcher(clientApi)
    }

    @BeforeEach
    fun before() {
        autoDiscoveryServer.start()
    }

    @Test
    fun serverWork() {
        runBlocking {
            println("Waiting server ...")
            val a1 = GlobalScope.async {
                repeat(100) {
                    delay(1000)
                    println("${System.currentTimeMillis()}")
                }
            }

            a1.await()
            println("End")
        }
    }

    @AfterEach
    fun after() {
        client.stopClient()
    }

    override fun onConnected(connection: EspServerApi.Connection?) {
        connection?.let {
            print("onConnected to server")
        }
    }

    override fun onDisconnected(connection: EspServerApi.Connection?) {
        connection?.let {
            print("onDisconnected from server")
        }
    }


}
