package server_client

import AntiSniper
import EspClientApi
import MessagesState
import androidx.compose.runtime.mutableStateListOf
import batteryLevel
import com.google.protobuf.ByteString
import gPSCoordinate
import helloFromDev
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import statById
import statFromKit
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

        if (connected.get() == 0)
            clientApis[connected.get()].sendHelloFromDev(helloFromDev {
                devtype = CommonEnums.DevType.TARGET_ANTISNIPER
                wasEarlyConnected = false
                kitTick = 10000
                deviceId = 2
                serialNumber = 123456
                uuid = ByteString.copyFrom(randomUuid)
                firmwareVer = ByteString.copyFrom(randomFirmwareVer)
            })
        else
            clientApis[connected.get()].sendHelloFromDev(helloFromDev {
                devtype = CommonEnums.DevType.SOILDER
                wasEarlyConnected = false
                kitTick = 10000
                deviceId = soldiersId[connected.get() - 1]
                serialNumber = 1234561
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
                it.sendGPSCoordinate(gPSCoordinate {
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

    fun sendStatById() {

        CoroutineScope(Dispatchers.Default).launch {
            clientApis[0].let {
                time += 6000

                it.sendStatFromKit(statFromKit {
                    currentHealth = 65
                    gameStatus = 1
                    kitSysTime = time
                })

                it.sendStatById(statById {
                    id = 31
                    typeOfWeapon = CommonEnums.TypeWeapon.ASSAULT_RIFLE
                    kitSysTime = time
                })

                time += 6000
                it.sendStatFromKit(statFromKit {
                    currentHealth = 0
                    gameStatus = 1
                    kitSysTime = time
                })

                it.sendStatById(statById {
                    id = 31
                    typeOfWeapon = CommonEnums.TypeWeapon.ASSAULT_RIFLE
                    kitSysTime = time
                })

            }

            delay(5000)

            clientApis[2].let {
                time2 += 1000

                it.sendStatFromKit(statFromKit {
                    currentHealth = 100
                    gameStatus = 1
                    kitSysTime = time2
                })
                time2 += 6000

                it.sendStatFromKit(statFromKit {
                    currentHealth = 65
                    gameStatus = 1
                    kitSysTime = time2
                })

                it.sendStatById(statById {
                    id = 31
                    typeOfWeapon = CommonEnums.TypeWeapon.ASSAULT_RIFLE
                    kitSysTime = time2
                })

                time2 += 6000

                it.sendStatFromKit(statFromKit {
                    currentHealth = 0
                    gameStatus = 1
                    kitSysTime = time2
                })

                it.sendStatById(statById {
                    id = 31
                    typeOfWeapon = CommonEnums.TypeWeapon.ASSAULT_RIFLE
                    kitSysTime = time2
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