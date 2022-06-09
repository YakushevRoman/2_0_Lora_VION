package server_client

import MessagesState
import androidx.compose.runtime.mutableStateListOf
import build.generated.source.proto.main.java.*
import com.google.protobuf.ByteString
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
import java.util.concurrent.atomic.AtomicInteger
import kotlin.random.Random

class ClientImpl :
    EspClientApi.OnConnectedListener,
    EspClientApi.OnDisconnectedListener,
    MessageInterceptor {

    companion object {
        const val clientsCount = 100
        const val UDP_PORT_SERVER_PROTO = 4011
        const val TCP_PORT_SERVER_PROTO = 4000
    }

    @Volatile
    var connected = AtomicInteger(0)

    var messages = mutableStateListOf<String>()

    private val clients = mutableListOf<ProtoClient>()
    private val clientApis = mutableListOf<EspClientApi>()

    private val _clientMessagesState = MutableSharedFlow<MessagesState>()
    val clientMessagesState = _clientMessagesState.asSharedFlow()

    var caughtMessages = mutableStateListOf<MessageLite>()

    private val handler = HandlerWrapper(Executors.newSingleThreadExecutor())

    val logger = FastServerLogger("src/logs/client_logs", null)
    private val networkThread = NetworkThread(logger)

    init {
        createClients()
    }

    private fun createClients() {
        repeat(clientsCount) {
            val client = ProtoClient(logger, true)
            clients.add(client)

            val clientApi = EspClientApi(
                client,
                true,
                handler
            )

            clientApi.setOnConnectedListener(this)
            clientApi.setOnDisconnectedListener(this)

            client.setProtocolDispatcher(clientApi)
            client.setMessageInterceptor(this)

            clientApis.add(clientApi)

        }
    }

    fun startWork() {
        connected.set(0)
        clients.forEach {
            it.connect("localhost", TCP_PORT_SERVER_PROTO)
        }

        CoroutineScope(Dispatchers.Default).launch {
            sendPing()
        }

        CoroutineScope(Dispatchers.Default).launch {
            sendGpsCoordinate()
        }

        CoroutineScope(Dispatchers.Default).launch {
            sendBattery()
        }

        CoroutineScope(Dispatchers.Default).launch {
            sendBattery()
        }

        CoroutineScope(Dispatchers.Default).launch {
            sendStatById()
        }
    }

    fun stopWork() {
        clients.forEach {
            it.stopClient()
        }
    }

    @Synchronized
    override fun onConnected() {
        CoroutineScope(Dispatchers.Default).launch {
            _clientMessagesState.emit(MessagesState.Empty)
        }

        val uuidArray = ByteArray(12)
        val firmwareVerArray = ByteArray(6)
        val randomUuid = Random.nextBytes(uuidArray);
        val randomFirmwareVer = Random.nextBytes(firmwareVerArray)

        clientApis[connected.get()].sendHelloFromDev(helloFromDev {
            devtype = CommonEnums.DevType.SOILDER
            wasEarlyConnected = false
            kitTick = 10000
            deviceId = connected.get() + 1
            serialNumber = 123456
            uuid = ByteString.copyFrom(randomUuid)
            firmwareVer = ByteString.copyFrom(randomFirmwareVer)
        })

        connected.incrementAndGet()
    }

    private suspend fun sendGpsCoordinate() {
        repeat(1200) {
            delay(1000)

            clientApis.forEach {
                val deltaLong = Random.nextFloat()
                val deltaLat = Random.nextFloat()
                it.sendGpsCoordinate(gPSCoordinate {
                    longtude = 36.5F + deltaLong
                    latitude = 50.0F + deltaLat
                })
            }
        }
    }

    private suspend fun sendBattery() {
        repeat(1200) {
            delay(1000)

            clientApis.forEach {
                it.sendBatteryLevel(batteryLevel {
                    batteryLevel = Random.nextInt(0, 100)
                })
            }
        }
    }

    private suspend fun sendStatById() {
        repeat(1200) {
            delay(1000)

            clientApis.forEach {

                it.sendStatFromKit(statFromKit {
                    currentHealth = 50
                })

                it.sendStatById(statById {
                    id = 2
                    typeOfWeapon = CommonEnums.TypeWeapon.ASSAULT_RIFLE
                    kitSysTime = 30_000
                })
            }
        }
    }

    private suspend fun sendPing() {
        repeat(60) {
            delay(10_000)
            clientApis.forEach {
                it.sendPing()
            }
        }
    }

    override fun onDisconnected() {
        clients.forEach {
            it.isConnected = false
        }
        println("onDisconnected")
    }


    fun reconect() {
        startWork()
    }

    override fun onMessageCatch(commandId: Int, message: MessageLite?) {
        message?.let {
            caughtMessages.add(it)
        }

        runBlocking {
            _clientMessagesState.emit(MessagesState.Messages(caughtMessages))
        }
    }

}