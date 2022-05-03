package server_grpc

import GpsParametersKt
import authResult
import com.google.protobuf.Empty
import gpsParameter
import gpsParameters
import io.grpc.*
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.random.Random


// CommonServiceGrpcKt.CommonServiceCoroutineImplBase()
/**
 * api generated from commonservice check common service proto file
 */
private class CommonService(private val dbLocation: SharedFlow<Gps.GpsParameter>) :
    CommonServiceGrpcKt.CommonServiceCoroutineImplBase() {

    // save data from observable stream and collect
    val gpsData = mutableListOf<Gps.GpsParameter>()


    init {
        // start listening stream gsp
        GlobalScope.launch {
            dbLocation.collect() {
                print("rec -> ${gpsData.size}\n")
            }
        }
    }

    // check auth proto file
    override suspend fun onAuthNotify(request: AuthClient.Auth): AuthClient.AuthResult {
        print("analise request \n$request")
        return authResult {
            succeeded = true
            error = "none"
        }
//        return authResult {
//            succeeded = false
//            error = "AuthClient error"
//        }
    }

    // check gps proto
    override fun onGpsUpdate(request: Empty): Flow<Gps.GpsParameters> {
        print("update")

        return flow {
            dbLocation.collect() {
                gpsData.add(it)

                print("collect -> ${gpsData.size}\n")

                val dataList = Gps.GpsParameters
                    .newBuilder()
                    .addAllGpsData(gpsData)
                    .build()
                emit(dataList)

            }
        }
    }
}

fun main() {
    val dbLocation: SharedFlow<Gps.GpsParameter> = generateGpsData()
    startService(dbLocation)
}

fun startService(dbLocation: SharedFlow<Gps.GpsParameter>) {
    val port = System.getenv("PORT")?.toInt() ?: 50051

    val service = CommonService(dbLocation)
    val server = ServerBuilder
        .forPort(port)
        .addService(service)
        .build()

    server.start()
    Runtime.getRuntime().addShutdownHook(Thread {
        println("Shutdown server")
        server.shutdown()
    })

    server.awaitTermination()
}


fun generateGpsData(): SharedFlow<Gps.GpsParameter> {
    val _dbLocation: MutableSharedFlow<Gps.GpsParameter> = MutableSharedFlow()
    val dbLocation: SharedFlow<Gps.GpsParameter> = _dbLocation.asSharedFlow()

    GlobalScope.launch {
        for (counter in 1..1000) {
            delay(5000)
            val gps = gpsParameter {
                lat = Random(90).nextInt()
                long = Random(90).nextInt()
                height = Random(1000).nextInt()
            }
            print("emit -> ${gps}\n")

            _dbLocation.emit(gps)
        }
    }
    return dbLocation
}

// https://ktor.io/docs/creating-web-socket-chat.html

