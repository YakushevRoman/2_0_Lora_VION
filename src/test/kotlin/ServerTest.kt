import build.generated.source.proto.main.java.*
import com.google.protobuf.ByteString
import com.google.protobuf.MessageLite
import kotlinx.coroutines.*
import kotlinx.coroutines.test.*
import org.junit.jupiter.api.*
import server_client.ClientImpl
import server_client.ServerImpl
import kotlin.random.Random
import kotlin.test.assertEquals
import kotlin.test.expect

@TestMethodOrder(MethodOrderer.OrderAnnotation::class)
@OptIn(ExperimentalCoroutinesApi::class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ServerTest {

    private val serverImpl = ServerImpl()
    private val clientImpl = ClientImpl()


    @BeforeAll
    fun before() {
        serverImpl.startWork()
    }

    @Test
    @Order(1)
    fun `Checking an empty state before starting the client`() {
        println(serverImpl.serverMessageState.value)

        when (serverImpl.serverMessageState.value) {
            ServerClientState.NotClient -> {
                assert(true)
            }
            else -> assert(false)
        }
    }

    @Test
    @Order(2)
    fun `Connecting and disconnecting the client from the server`() {
        runTest(dispatchTimeoutMs = 2_500) {
            val states = mutableListOf<ServerClientState>()

            launch(UnconfinedTestDispatcher(testScheduler)) {
                serverImpl.serverMessageState.collect {
                    when (serverImpl.serverMessageState.value) {
                        ServerClientState.ConnectedClient -> {
                            clientImpl.stopWork()
                            states.add(it)
                            println("->Connected")
                        }
                        ServerClientState.DisconnectedClient -> {
                            states.add(it)
                            println("->Disconnected")
                            cancel()
                        }
                        ServerClientState.NotClient -> {
                            states.add(it)
                            println("->EMPTY")
                            clientImpl.startWork()
                        }
                        else -> {
                            assert(false)
                        }
                    }
                    println(states)

                }
            }

            assertEquals(
                listOf(
                    ServerClientState.NotClient,
                    ServerClientState.ConnectedClient,
                    ServerClientState.DisconnectedClient
                ),
                states
            )
        }
    }

    @Test
    @Order(3)
    fun `Sending esp-proto messages from the server to the client`() {
        val sendResultData = mutableListOf<Boolean>()

        if (clientImpl.client.isConnected.not())
            clientImpl.startWork()

        Thread.sleep(2500)
        var result = serverImpl.localConnection?.sendEspConectionState(
            eSPConectionState {
                wifiStatus = Random.nextInt(0, 1000)
                tcpStatus = Random.nextInt(0, 1000)
            }) ?: false
        sendResultData.add(result)

        result = serverImpl.localConnection?.sendEspConnectToTcpReply(
            eSPConnectToTCPReply {
                recvBufsize = Random.nextInt(0, 1000)
            }) ?: false
        sendResultData.add(result)


        result = serverImpl.localConnection?.sendEspTcpConfirmation(
            eSPTcpConfirmation {
                confirmed = Random.nextInt(0, 1000)
            }) ?: false
        sendResultData.add(result)


        result = serverImpl.localConnection?.sendEspServerDiscovered(
            eSPServerDiscovered {
                ipAddr = Random.nextInt(0, 1000)
                port = Random.nextInt(0, 1000)
                priority = Random.nextInt(0, 1000)
                name = Random.nextInt(0, 1000).toString()
            }) ?: false
        sendResultData.add(result)

        result = serverImpl.localConnection?.sendEspRssiForNetworkName(
            eSPRssiForNetworkName {
                valueRssi = Random.nextInt(0, 1000)
                networkName = Random.nextInt(0, 1000).toString()
                networkChannel = Random.nextInt(0, 1000)
                error = Random.nextInt(0, 1000)
            }) ?: false
        sendResultData.add(result)


        result = serverImpl.localConnection?.sendEspWifiAccessPoint(
            eSPWifiAccessPoint {
                error = Random.nextInt(0, 1000)
            }) ?: false
        sendResultData.add(result)


        result = serverImpl.localConnection?.sendEspKillWifiAccessPointReply(
            eSPKillWifiAccessPointReply {
                error = Random.nextInt(0, 1000)
            }) ?: false
        sendResultData.add(result)

        val expected = mutableListOf<Boolean>()
        repeat(sendResultData.size) {
            expected.add(true)
        }

        println("expected -> $expected \n sendResult -> $sendResultData")
        assertEquals(
            expected,
            sendResultData
        )
    }

    @Test
    @Order(3)
    fun `Sending esp-proto messages from the client to the server`() {
        val sendResultData = mutableListOf<Boolean>()

        if (clientImpl.client.isConnected.not())
            clientImpl.startWork()

        Thread.sleep(2500)
        var result = clientImpl.clientApi.sendEspConnectToAp(
            eSPConnectToAP {
                net = Random.nextInt(0, 1000).toString()
                password = Random.nextInt(0, 1000).toString()
            })
        sendResultData.add(result)

        result = clientImpl.clientApi.sendEspConnectToTcp(
            eSPConnectToTCP {
                ip = Random.nextInt(0, 1000)
                port = Random.nextInt(0, 1000)
            })
        sendResultData.add(result)

        result = clientImpl.clientApi.sendEspSendByUdp(
            eSPSendByUDP {
                ip = Random.nextInt(0, 1000).toString()
                port = Random.nextInt(0, 1000)
                data = ByteString.copyFrom(Random(100).nextBytes(4))
            })
        sendResultData.add(result)

        result = clientImpl.clientApi.sendEspDiscoverServers(
            eSPDiscoverServers {
                devType = Random.nextInt(0, 1000)
                serialNum = ByteString.copyFrom(Random(100).nextBytes(4))
            })
        sendResultData.add(result)

        result = clientImpl.clientApi.sendEspSendLogByUdp(
            eSPSendLogByUDP {
                logMsg = Random.nextInt(0, 1000).toString()
                logType = Random.nextInt(0, 1000)
            })
        sendResultData.add(result)

        result = clientImpl.clientApi.sendEspConnectToTcpReply(
            eSPConnectToTCPReply {
                recvBufsize = Random.nextInt(0, 1000)
            })
        sendResultData.add(result)

        result = clientImpl.clientApi.sendEspTcpConfirmation(
            eSPTcpConfirmation {
                confirmed = Random.nextInt(0, 1000)
            })
        sendResultData.add(result)

        result = clientImpl.clientApi.sendEspGetRssiByNetworkName(
            eSPGetRssiByNetworkName {
                networkName = Random.nextInt(0, 1000).toString()
            })
        sendResultData.add(result)

        result = clientImpl.clientApi.sendEspScanWifiByChannel(
            eSPScanWifiByChannel {
                channelNumber = Random.nextInt(0, 1000)
            })
        sendResultData.add(result)

        result = clientImpl.clientApi.sendEspSetWifiAccessPoint(
            eSPSetWifiAccessPoint {
                channelNumber = Random.nextInt(0, 1000)
                power = Random.nextInt(0, 1000)
                timeout = Random.nextInt(0, 1000)
                networkName = Random.nextInt(0, 1000).toString()
            })
        sendResultData.add(result)

        result = clientImpl.clientApi.sendEspKillWifiAccessPoint()
        sendResultData.add(result)

        val expected = mutableListOf<Boolean>()
        repeat(sendResultData.size) {
            expected.add(true)
        }

        println("expected -> $expected \n sendResult -> $sendResultData")
        assertEquals(
            expected,
            sendResultData
        )
    }

    @Test
    @Order(4)
    fun `A lot of messages from the client`() = runTest {
        val size = 1000

        if (clientImpl.client.isConnected.not()) {
            clientImpl.startWork()
            delay(2500)
        }

        val actual: List<Deferred<Boolean>> = List(size) {
            async {
                clientImpl.clientApi.sendEspSetWifiAccessPoint(
                    eSPSetWifiAccessPoint {
                        channelNumber = Random.nextInt(0, 1000)
                        power = Random.nextInt(0, 1000)
                        timeout = Random.nextInt(0, 1000)
                        networkName = Random.nextInt(0, 1000).toString()
                    })
            }
        }

        val expected = List(size) {
            true
        }

        val result = mutableListOf<Boolean>()

        actual.forEach {
            result.add(it.await())
        }


        assertEquals(
            expected,
            result
        )
    }

    @Test
    @Order(5)
    fun `Collect messages from the server to  the client`() = runTest(dispatchTimeoutMs = 15_000) {
        val sendMessageSize = 10

        val serverMessages = mutableListOf<MessageLite>()
        val clientMessages = mutableListOf<MessageLite>()

        assert(sendMessageSize > 0) {
            "Size have to be bigger than zero"
        }

        if (clientImpl.client.isConnected.not())
            runBlocking {
                clientImpl.startWork()
                delay(2500)
            }

        if (clientImpl.caughtMessages.isNotEmpty()) {
            clientImpl.caughtMessages.clear()
        }

        val job = launch(UnconfinedTestDispatcher(testScheduler)) {

            clientImpl.clientMessagesState.collect {
                when (it) {
                    MessagesState.Empty -> {
                        println("empty")
                    }
                    is MessagesState.Messages -> {
                        clientMessages.clear()
                        clientMessages.addAll(it.data)

                        if (it.data.size == sendMessageSize) {

                            clientMessages.forEach { msg ->
                                println(msg.toString())
                            }

                            expect(
                                serverMessages.size,
                                "Comparing for a client and server messages")
                            {
                                clientMessages.size
                            }

                            assertEquals(
                                serverMessages,
                                clientMessages,
                                "Comparing a client and server list of messages(order matters)"
                            )

                            cancel()
                        }

                    }
                }

            }
        }

        repeat(sendMessageSize) {
            val message = eSPConectionState {
                wifiStatus = Random.nextInt(0, 1000)
                tcpStatus = Random.nextInt(0, 1000)
            }

            assert(serverImpl.localConnection != null) {
                job.cancel()
                "Server does not have client. Check a client connection"
            }

            serverImpl.localConnection?.sendEspConectionState(message)
            serverMessages.add(message)
        }

    }

    @Test
    @Order(6)
    fun `Collect messages from the client to the server`() = runTest(dispatchTimeoutMs = 15_000) {
        val sendMessageSize = 10

        val serverMessages = mutableListOf<MessageLite>()
        val clientMessages = mutableListOf<MessageLite>()

        assert(sendMessageSize > 0) {
            "Size have to be bigger than zero"
        }

        if (clientImpl.client.isConnected.not())
            runBlocking {
                clientImpl.startWork()
                delay(2500)
            }

        if (serverImpl.caughtMessages.isNotEmpty()) {
            serverImpl.caughtMessages.clear()
        }

        val job = launch(UnconfinedTestDispatcher(testScheduler)) {

            serverImpl.serverMessagesState.collect {
                when (it) {
                    MessagesState.Empty -> {
                        println("empty")
                    }
                    is MessagesState.Messages -> {
                        serverMessages.clear()
                        serverMessages.addAll(it.data)

                        if (it.data.size == sendMessageSize) {

                            serverMessages.forEach { msg ->
                                println(msg.toString())
                            }

                            expect(
                                clientMessages.size,
                                "Comparing for a client and server messages")
                            {
                                serverMessages.size
                            }

                            assertEquals(
                                clientMessages,
                                serverMessages,
                                "Comparing a client and server list of messages(order matters)"
                            )

                            cancel()
                        }

                    }
                }

            }
        }

        repeat(sendMessageSize) {
            val message = eSPConnectToTCPReply {
                recvBufsize = Random.nextInt(0, 1000)
            }

            assert(serverImpl.localConnection != null) {
                job.cancel()
                "Server does not have client. Check a client connection"
            }

            clientImpl.clientApi.sendEspConnectToTcpReply(message)
            clientMessages.add(message)
        }

    }

    @Test
    @Order(7)
    fun `esp-proto client test`() = runTest(dispatchTimeoutMs = 15_000) {

        val clientMessages = mutableListOf<MessageLite>()
        val serverMessages = mutableListOf<MessageLite>()

        val sendResultData = mutableListOf<Boolean>()


        if (clientImpl.client.isConnected.not())
            runBlocking {
                clientImpl.startWork()
                delay(2500)
            }

        if (serverImpl.caughtMessages.isNotEmpty()) {
            serverImpl.caughtMessages.clear()
        }

        if (clientImpl.caughtMessages.isNotEmpty()) {
            clientImpl.caughtMessages.clear()
        }

        val eSPConnectToAP = eSPConnectToAP {
            net = Random.nextInt(0, 1000).toString()
            password = Random.nextInt(0, 1000).toString()
        }

        val eSPConnectToTCP = eSPConnectToTCP {
            ip = Random.nextInt(0, 1000)
            port = Random.nextInt(0, 1000)
        }

        val eSPSendByUDP = eSPSendByUDP {
            ip = Random.nextInt(0, 1000).toString()
            port = Random.nextInt(0, 1000)
            data = ByteString.copyFrom(Random(100).nextBytes(4))
        }


        val eSPDiscoverServers = eSPDiscoverServers {
            devType = Random.nextInt(0, 1000)
            serialNum = ByteString.copyFrom(Random(100).nextBytes(4))
        }

        val eSPSendLogByUDP = eSPSendLogByUDP {
            logMsg = Random.nextInt(0, 1000).toString()
            logType = Random.nextInt(0, 1000)
        }

        val eSPConnectToTCPReply = eSPConnectToTCPReply {
            recvBufsize = Random.nextInt(0, 1000)
        }

        val eSPTcpConfirmation = eSPTcpConfirmation {
            confirmed = Random.nextInt(0, 1000)
        }

        val eSPGetRssiByNetworkName = eSPGetRssiByNetworkName {
            networkName = Random.nextInt(0, 1000).toString()
        }

        val eSPScanWifiByChannel = eSPScanWifiByChannel {
            channelNumber = Random.nextInt(0, 1000)
        }

        val eSPSetWifiAccessPoint = eSPSetWifiAccessPoint {
            channelNumber = Random.nextInt(0, 1000)
            power = Random.nextInt(0, 1000)
            timeout = Random.nextInt(0, 1000)
            networkName = Random.nextInt(0, 1000).toString()
        }

        clientMessages.add(eSPConnectToAP)
        clientMessages.add(eSPConnectToTCP)
        clientMessages.add(eSPSendByUDP)
        clientMessages.add(eSPDiscoverServers)
        clientMessages.add(eSPSendLogByUDP)
        clientMessages.add(eSPConnectToTCPReply)
        clientMessages.add(eSPTcpConfirmation)
        clientMessages.add(eSPGetRssiByNetworkName)
        clientMessages.add(eSPScanWifiByChannel)
        clientMessages.add(eSPSetWifiAccessPoint)

        launch(UnconfinedTestDispatcher(testScheduler)) {

            serverImpl.serverMessagesState.collect {
                when (it) {
                    MessagesState.Empty -> {
                        println("empty")
                    }
                    is MessagesState.Messages -> {
                        serverMessages.clear()
                        serverMessages.addAll(it.data)

                        if (it.data.size == clientMessages.size) {

                            serverMessages.forEach { msg ->
                                println(msg.toString())
                            }

                            expect(
                                clientMessages.size,
                                "Comparing for a client and server messages")
                            {
                                serverMessages.size
                            }

                            assertEquals(
                                clientMessages,
                                serverMessages,
                                "Comparing a client and server list of messages(order matters)"
                            )

                            cancel()
                        }

                    }
                }

            }
        }

        var result = clientImpl.clientApi.sendEspConnectToAp(eSPConnectToAP)
        sendResultData.add(result)

        result = clientImpl.clientApi.sendEspConnectToTcp(eSPConnectToTCP)
        sendResultData.add(result)

        result = clientImpl.clientApi.sendEspSendByUdp(eSPSendByUDP)
        sendResultData.add(result)

        result = clientImpl.clientApi.sendEspDiscoverServers(eSPDiscoverServers)
        sendResultData.add(result)

        result = clientImpl.clientApi.sendEspSendLogByUdp(eSPSendLogByUDP)
        sendResultData.add(result)

        result = clientImpl.clientApi.sendEspConnectToTcpReply(eSPConnectToTCPReply)
        sendResultData.add(result)

        result = clientImpl.clientApi.sendEspTcpConfirmation(eSPTcpConfirmation)
        sendResultData.add(result)

        result = clientImpl.clientApi.sendEspGetRssiByNetworkName(eSPGetRssiByNetworkName)
        sendResultData.add(result)

        result = clientImpl.clientApi.sendEspScanWifiByChannel(eSPScanWifiByChannel)
        sendResultData.add(result)

        result = clientImpl.clientApi.sendEspSetWifiAccessPoint(eSPSetWifiAccessPoint)
        sendResultData.add(result)
    }

    @Test
    @Order(8)
    fun `esp-proto server sends messages`() = runTest(dispatchTimeoutMs = 15_000) {
        val clientMessages = mutableListOf<MessageLite>()
        val serverMessages = mutableListOf<MessageLite>()

        val sendResultData = mutableListOf<Boolean>()


        if (clientImpl.client.isConnected.not())
            runBlocking {
                clientImpl.startWork()
                delay(2500)
            }

        if (serverImpl.caughtMessages.isNotEmpty()) {
            serverImpl.caughtMessages.clear()
        }

        if (clientImpl.caughtMessages.isNotEmpty()) {
            clientImpl.caughtMessages.clear()
        }

        val eSPConectionState = eSPConectionState {
            wifiStatus = Random.nextInt(0, 1000)
            tcpStatus = Random.nextInt(0, 1000)
        }

        val eSPConnectToTCPReply = eSPConnectToTCPReply {
            recvBufsize = Random.nextInt(0, 1000)
        }

        val eSPTcpConfirmation = eSPTcpConfirmation {
            confirmed = Random.nextInt(0, 1000)
        }

        val eSPServerDiscovered = eSPServerDiscovered {
            ipAddr = Random.nextInt(0, 1000)
            port = Random.nextInt(0, 1000)
            priority = Random.nextInt(0, 1000)
            name = Random.nextInt(0, 1000).toString()
        }

        val eSPRssiForNetworkName = eSPRssiForNetworkName {
            valueRssi = Random.nextInt(0, 1000)
            networkName = Random.nextInt(0, 1000).toString()
            networkChannel = Random.nextInt(0, 1000)
            error = Random.nextInt(0, 1000)
        }

        val eSPWifiAccessPoint = eSPWifiAccessPoint {
            error = Random.nextInt(0, 1000)
        }

        val eSPKillWifiAccessPointReply = eSPKillWifiAccessPointReply {
            error = Random.nextInt(0, 1000)
        }

        serverMessages.add(eSPConectionState)
        serverMessages.add(eSPConnectToTCPReply)
        serverMessages.add(eSPTcpConfirmation)
        serverMessages.add(eSPServerDiscovered)
        serverMessages.add(eSPRssiForNetworkName)
        serverMessages.add(eSPWifiAccessPoint)
        serverMessages.add(eSPKillWifiAccessPointReply)


        launch(UnconfinedTestDispatcher(testScheduler)) {

            clientImpl.clientMessagesState.collect {
                when (it) {
                    MessagesState.Empty -> {
                        println("empty")
                    }
                    is MessagesState.Messages -> {
                        clientMessages.clear()
                        clientMessages.addAll(it.data)

                        if (it.data.size == serverMessages.size) {

                            clientMessages.forEach { msg ->
                                println(msg.toString())
                            }

                            expect(
                                serverMessages.size,
                                "Comparing for a client and server messages")
                            {
                                clientMessages.size
                            }

                            assertEquals(
                                serverMessages,
                                clientMessages,
                                "Comparing a client and server list of messages(order matters)"
                            )

                            val expected = mutableListOf<Boolean>()
                            repeat(sendResultData.size) {
                                expected.add(true)
                            }

                            println("expected -> $expected \n" +
                                    "sendResult -> $sendResultData")
                            assertEquals(
                                expected,
                                sendResultData
                            )

                            cancel()
                        }

                    }
                }

            }
        }

        var result = serverImpl.localConnection?.sendEspConectionState(eSPConectionState) ?: false
        sendResultData.add(result)

        result = serverImpl.localConnection?.sendEspConnectToTcpReply(eSPConnectToTCPReply) ?: false
        sendResultData.add(result)


        result = serverImpl.localConnection?.sendEspTcpConfirmation(eSPTcpConfirmation) ?: false
        sendResultData.add(result)


        result = serverImpl.localConnection?.sendEspServerDiscovered(eSPServerDiscovered) ?: false
        sendResultData.add(result)

        result = serverImpl.localConnection?.sendEspRssiForNetworkName(eSPRssiForNetworkName) ?: false
        sendResultData.add(result)


        result = serverImpl.localConnection?.sendEspWifiAccessPoint(eSPWifiAccessPoint) ?: false
        sendResultData.add(result)


        result = serverImpl.localConnection?.sendEspKillWifiAccessPointReply(eSPKillWifiAccessPointReply) ?: false
        sendResultData.add(result)
    }

    @AfterAll
    fun after() {
        serverImpl.stopWork()
        clientImpl.stopWork()

        Dispatchers.resetMain()
    }

}