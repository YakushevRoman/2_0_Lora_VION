package server_client

import AdditionalDeviceClientApi
import MessagesState
import androidx.compose.runtime.mutableStateListOf
import com.google.protobuf.ByteString
import helloFromDev
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import java.util.concurrent.Executors
import java.util.concurrent.atomic.AtomicInteger
import kotlin.random.Random
import clients.ProtoClient
import responseBatteryLevel
import utils.FastServerLogger
import utils.HandlerWrapper
import utils.NetworkThread

class ClientImpl :
    AdditionalDeviceClientApi.OnConnectedListener,
    AdditionalDeviceClientApi.OnDisconnectedListener,
    AdditionalDeviceClientApi.OnSettingsNotAgrListener,
    AdditionalDeviceClientApi.OnStartGameListener {

    companion object {
        const val clientsCount = 1
        const val UDP_PORT_SERVER_PROTO = 4011
        const val TCP_PORT_SERVER_PROTO = 4000
    }

    @Volatile
    var connected = AtomicInteger(0)

    var messages = mutableStateListOf<String>()

    private val clients = mutableListOf<ProtoClient>()
    private val clientApis = mutableListOf<AdditionalDeviceClientApi>()

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

            val clientApi = AdditionalDeviceClientApi(
                client
            )

            clientApi.setOnConnectedListener(this)
            clientApi.setOnDisconnectedListener(this)
            clientApi.setOnStartGameListener(this)
            clientApi.setOnSettingsNotAgrListener(this)

            client.setProtocolDispatcher(clientApi)
            clientApis.add(clientApi)

        }
    }

    fun startWork() {
        connected.set(0)
        CoroutineScope(Dispatchers.Default).launch {
            clients.forEach {
                delay(2500)
                    it.connect("localhost", TCP_PORT_SERVER_PROTO)
                    //it.connect("192.168.1.102", TCP_PORT_SERVER_PROTO)
            }
        }

        CoroutineScope(Dispatchers.Default).launch {
            sendPing()
        }

        CoroutineScope(Dispatchers.Default).launch {
            delay(10_000)
            sendBattery()
        }
    }

    fun stopWork() {
        clients.forEach {
            it.stopClient()
        }
    }

    /**
     * // this is hello message, must be first message after connection
    message HelloFromDev {
    option (c2s_id) = 1;

    int32 device_id           		= 1;  // Игровой ID устройства
    int32 kit_tick            		= 2;  // msec from start kit (internal clock)
    bool was_early_connected  		= 3;  // Eказатель на реконект к серверу значение (1) - повторное подключение, значение (0) - первое подключение
    int32 firmware_version    		= 4 [deprecated=true];  // DEPRECATED! Текущая версия прошивки
    int32 global_changes      		= 5 [deprecated=true];  // DEPRECATED! Глобальные изменения в тек.версии
    int32 minor_changes       		= 6 [deprecated=true];  // DEPRECATED! Мелкие изменения в тек.версии
    DevType devtype           		= 7;
    int32 SerialNumber        		= 8;  // Физический номер флэш памяти
    uint32 diodes_brightness  		= 9;  // Яркость светодиодов, (0 - 100, в %)
    uint32 display_brightness 		= 10; // Яркость дисплея, (0 - 100, в %)
    uint32 sound_volume       		= 11; // Громкость устройства, (0 - 100, в %)
    LangugeType lang          		= 12; // Locale that currently used
    bytes firmware_ver        		= 13;
    DisplayType type_display  	  	= 14 [deprecated=true]; // DEPRECATED! type of use display
    bytes bios_ver					= 15; // версия бута устройства
    bytes boot_ver					= 16; // версия биоса устройства
    }
     */
    @Synchronized
    override fun onConnected() {
        CoroutineScope(Dispatchers.Default).launch {
            _clientMessagesState.emit(MessagesState.Empty)
        }

        val firmwareVerArray = ByteArray(6)
        val randomFirmwareVer = Random.nextBytes(firmwareVerArray)

        clientApis[connected.get()].sendHelloFromDev(helloFromDev {
            devtype = ForpostServer.DevType.TAGER_ECLIPSE
            wasEarlyConnected = false
            kitTick = 10000
            deviceId = connected.get() + 1
            serialNumber = Random.nextInt()
            lang = ForpostServer.LangugeType.FRENCH
            firmwareVer = ByteString.copyFrom(randomFirmwareVer)
            biosVer = ByteString.copyFrom(randomFirmwareVer)
            bootVer = ByteString.copyFrom(randomFirmwareVer)
        })

        connected.incrementAndGet()
    }

    private suspend fun sendBattery() {
        repeat(12000) {
            delay(1000)

            clientApis.forEach {
                it.sendResponseBatteryLevel(responseBatteryLevel {
                    batteryLevel = Random.nextInt(0,100)
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

    override fun onStartGameReceived(message: ForpostServer.StartGame?) {
        println("on start game")
    }

    override fun onSettingsNotAgrReceived(message: Tagger.SettingsNotAgr?) {
        message?.let {
            println("on settings not agr $message")
        }
    }
}