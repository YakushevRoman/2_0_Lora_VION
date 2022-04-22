package server_grpc

import GpsParametersKt
import authResult
import com.google.protobuf.Empty
import gpsParameter
import gpsParameters
import io.grpc.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlin.random.Random

private class CommonService : CommonServiceGrpcKt.CommonServiceCoroutineImplBase() {
    // saved data about current gps
    var gpsData = mutableListOf<Gps.GpsParameter>()

    override suspend fun onAuthNotify(request: AuthClient.Auth): AuthClient.AuthResult {

        print("analise request \n$request")
        return authResult {
            succeeded = true
            error = "none"
        }
    }

    override fun onGpsUpdate(request: Empty): Flow<Gps.GpsParameters> {

        gpsData.add(gpsParameter {
            lat = Random(90).nextInt()
            long = Random(90).nextInt()
            height = Random(1000).nextInt()
        })

        return flow {
            val dataList = Gps.GpsParameters
                .newBuilder()
                .addAllGpsData(gpsData)
                .build()

            emit(dataList)
        }
    }

}

fun main() {
    val port = System.getenv("PORT")?.toInt() ?: 50051

    val service = CommonService()
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