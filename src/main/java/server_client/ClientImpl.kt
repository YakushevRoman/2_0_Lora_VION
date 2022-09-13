package server_client

import EspClientApi
import MessagesState
import androidx.compose.runtime.mutableStateListOf
import com.google.protobuf.ByteString
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import java.util.concurrent.Executors
import java.util.concurrent.atomic.AtomicInteger
import kotlin.random.Random
import clients.ProtoClient
import utils.FastServerLogger
import utils.HandlerWrapper
import utils.NetworkThread

class ClientImpl :
    EspClientApi.OnConnectedListener,
    EspClientApi.OnDisconnectedListener,
    EspClientApi.OnStartGameListener,
    EspClientApi.OnSettingAntiSniperListener,
    EspClientApi.OnSetVolumeListener,
    EspClientApi.OnCommandListener {

    companion object {
        const val clientsCount = 3
        const val UDP_PORT_SERVER_PROTO = 4011
        const val TCP_PORT_SERVER_PROTO = 4000
    }

    var time = 15331
    var time2 = 16331

    @Volatile
    var connected = AtomicInteger(0)

    var messages = mutableStateListOf<String>()

    private val clients = mutableListOf<ProtoClient>()
    private val clientApis = mutableListOf<EspClientApi>()

    private val _clientMessagesState = MutableSharedFlow<MessagesState>()
    val clientMessagesState = _clientMessagesState.asSharedFlow()

    private val handler = HandlerWrapper(Executors.newSingleThreadExecutor())

    val logger = FastServerLogger("src/logs/client_logs")
    private val networkThread = NetworkThread(logger)

    init {
        createClients()
    }

    val soldiersId = listOf(31,21)

    private fun createClients() {

        repeat(clientsCount) {
            val client = ProtoClient(logger, true)
            clients.add(client)

            val clientApi = EspClientApi(
                client
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
            //it.connect("192.168.1.101", TCP_PORT_SERVER_PROTO)
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

        if (connected.get() == 0) {
            val message = Base.HelloFromDev
                .newBuilder()
                .setDevtype(CommonEnums.DevType.TARGET_ANTISNIPER)
                .setWasEarlyConnected(false)
                .setKitTick(10000)
                .setDeviceId(2)
                .setSerialNumber(123456)
                .setUuid(ByteString.copyFrom(randomUuid))
                .setFirmwareVer(ByteString.copyFrom(randomFirmwareVer))
                .build()

            clientApis[connected.get()].sendHelloFromDev(message)
        }
        else {
            val message = Base.HelloFromDev
                .newBuilder()
                .setDevtype(CommonEnums.DevType.SOILDER)
                .setWasEarlyConnected(false)
                .setKitTick(10000)
                .setDeviceId(soldiersId[connected.get() - 1])
                .setSerialNumber(123456)
                .setUuid(ByteString.copyFrom(randomUuid))
                .setFirmwareVer(ByteString.copyFrom(randomFirmwareVer))
                .build()

            clientApis[connected.get()].sendHelloFromDev(message)
        }

        connected.incrementAndGet()
    }

    private suspend fun sendGpsCoordinate() {
        repeat(120000) {
            delay(2500)

            clientApis.forEach {
                val deltaLong = Random.nextFloat()
                val deltaLat = Random.nextFloat()

                val message = CommonMilitary.GPSCoordinate.newBuilder()
                    .setAltitude(0)
                    .setLongtude(36.5F + deltaLong)
                    .setLatitude(50.0F + deltaLat)
                    .build()
                it.sendGPSCoordinate(message)
            }
        }
    }

    private suspend fun sendBattery() {
        repeat(12000) {
            delay(1000)

            clientApis.forEach {
                val message = CommonMilitary.BatteryLevel.newBuilder()
                    .setBatteryLevel(Random.nextInt(0, 100))
                    .build()
                it.sendBatteryLevel(message)
            }
        }
    }

    fun sendStatById() {

        CoroutineScope(Dispatchers.Default).launch {
            clientApis[0].let {
                time += 6000

                val message1 = KitMilitary.StatFromKit.newBuilder()
                    .setCurrentHealth(65)
                    .setGameStatus(1)
                    .setKitSysTime(time)
                    .build()
                it.sendStatFromKit(message1)

                val mesage2 = KitMilitary.StatById.newBuilder()
                    .setKitSysTime(time)
                    .setId(31)
                    .setTypeOfWeapon(CommonEnums.TypeWeapon.ASSAULT_RIFLE)
                    .build()
                it.sendStatById(mesage2)

                time += 6000
                val message3 = KitMilitary.StatFromKit.newBuilder()
                    .setCurrentHealth(0)
                    .setGameStatus(1)
                    .setKitSysTime(time)
                    .build()
                it.sendStatFromKit(message3)

                val mesage4 = KitMilitary.StatById.newBuilder()
                    .setKitSysTime(time)
                    .setId(31)
                    .setTypeOfWeapon(CommonEnums.TypeWeapon.ASSAULT_RIFLE)
                    .build()
                it.sendStatById(mesage4)

            }

            delay(5000)

            clientApis[2].let {
                time2 += 1000

                val message1 = KitMilitary.StatFromKit.newBuilder()
                    .setCurrentHealth(65)
                    .setGameStatus(1)
                    .setKitSysTime(time)
                    .build()
                it.sendStatFromKit(message1)

                val mesage2 = KitMilitary.StatById.newBuilder()
                    .setKitSysTime(time)
                    .setId(31)
                    .setTypeOfWeapon(CommonEnums.TypeWeapon.ASSAULT_RIFLE)
                    .build()
                it.sendStatById(mesage2)

                time += 6000
                val message3 = KitMilitary.StatFromKit.newBuilder()
                    .setCurrentHealth(0)
                    .setGameStatus(1)
                    .setKitSysTime(time)
                    .build()
                it.sendStatFromKit(message3)

                val mesage4 = KitMilitary.StatById.newBuilder()
                    .setKitSysTime(time)
                    .setId(31)
                    .setTypeOfWeapon(CommonEnums.TypeWeapon.ASSAULT_RIFLE)
                    .build()
                it.sendStatById(mesage4)

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

    override fun onStartGameReceived(message: Base.StartGame) {
        CoroutineScope(Dispatchers.Default).launch {
            delay(10_000)
        }
    }

    override fun onSettingAntiSniperReceived(message: AntiSniper.SettingAntiSniper) {
        println(message)
    }

    override fun onCommandReceived(message: AntiSniper.Command) {
        println(message)
    }

    override fun onSetVolumeReceived(message: Multimedia.SetVolume) {
        print(message)
    }
}