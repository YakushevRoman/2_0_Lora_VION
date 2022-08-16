package server_client

import MessagesState
import androidx.compose.runtime.mutableStateListOf
import build.generated.source.proto.main.java.*
import clients.ProtoClient
import com.google.protobuf.ByteString
import com.google.protobuf.MessageLite
import generation_java_files.AntiSniperClientApi
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import utils.FastServerLogger
import utils.HandlerWrapper
import utils.NetworkThread
import java.util.concurrent.Executors
import java.util.concurrent.atomic.AtomicInteger
import kotlin.random.Random

class ClientImpl :
    AntiSniperClientApi.OnConnectedListener,
    AntiSniperClientApi.OnDisconnectedListener,
    AntiSniperClientApi.OnStartGameListener,
    AntiSniperClientApi.OnSettingAntiSniperListener,
    AntiSniperClientApi.OnSetVolumeListener,
    AntiSniperClientApi.OnCommandListener {

    companion object {
        const val clientsCount = 5
        const val UDP_PORT_SERVER_PROTO = 4011
        const val TCP_PORT_SERVER_PROTO = 4000
    }

    @Volatile
    var connected = AtomicInteger(0)

    var messages = mutableStateListOf<String>()

    private val clients = mutableListOf<ProtoClient>()
    private val clientApis = mutableListOf<AntiSniperClientApi>()

    private val _clientMessagesState = MutableSharedFlow<MessagesState>()
    val clientMessagesState = _clientMessagesState.asSharedFlow()

    private val handler = HandlerWrapper(Executors.newSingleThreadExecutor())

    val logger = FastServerLogger("src/logs/client_logs")
    private val networkThread = NetworkThread(logger)

    init {
        createClients()
    }

    private fun createClients() {
        repeat(clientsCount) {
            val client = ProtoClient(logger, true)
            clients.add(client)

            val clientApi = AntiSniperClientApi(
                client,
                true,
                handler
            )

            clientApi.setOnConnectedListener(this)
            clientApi.setOnDisconnectedListener(this)
            clientApi.setOnSettingAntiSniperListener(this)
            clientApi.setOnCommandListener(this)
            clientApi.setOnStartGameListener(this)
            clientApi.setOnSetVolumeListener(this)

            client.setProtocolDispatcher(clientApi)
            clientApis.add(clientApi)

        }
    }

    fun startWork() {
        connected.set(0)
        clients.forEach {
            it.connect("localhost", TCP_PORT_SERVER_PROTO)
            //it.connect("192.168.1.104", TCP_PORT_SERVER_PROTO)
        }



        CoroutineScope(Dispatchers.Default).launch {
            sendPing()
        }

        CoroutineScope(Dispatchers.IO).launch {
            delay(10_000)
            sendGpsCoordinate()
        }

        CoroutineScope(Dispatchers.Default).launch {
            delay(10_000)
            sendBattery()
        }

        CoroutineScope(Dispatchers.Default).launch {
            delay(10_000)
            //sendBattery()
        }

        CoroutineScope(Dispatchers.Default).launch {
            delay(10_000)
            //sendStatById()
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

        if (connected.get() == 0)
            clientApis[connected.get()].sendHelloFromDev(helloFromDev {
                devtype = CommonEnums.DevType.TANK
                wasEarlyConnected = false
                kitTick = 10000
                deviceId = connected.get() + 1
                serialNumber = 123456
                uuid = ByteString.copyFrom(randomUuid)
                firmwareVer = ByteString.copyFrom(randomFirmwareVer)
            })
        else
            clientApis[connected.get()].sendHelloFromDev(helloFromDev {
                devtype = CommonEnums.DevType.TARGET_SHOOTER
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
        repeat(120000) {
            delay(2500)

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
        repeat(12000) {
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
        repeat(6000) {
            delay(10_000)
            clientApis.forEach {
                it.sendPing()
            }
        }
    }

    override fun onDisconnected() {
        println("onDisconnected")
    }

    fun reconect() {
        startWork()
    }

    override fun onStartGameReceived(message: Base.StartGame?) {
        println("StartGame")
        CoroutineScope(Dispatchers.Default).launch {
            delay(10_000)
        }
    }

    override fun onSettingAntiSniperReceived(message: AntiSniper.SettingAntiSniper?) {
        println(message)
    }

    override fun onCommandReceived(message: AntiSniper.Command?) {
        println(message)
    }

    override fun onSetVolumeReceived(message: Multimedia.SetVolume?) {
        print(message)
    }
}