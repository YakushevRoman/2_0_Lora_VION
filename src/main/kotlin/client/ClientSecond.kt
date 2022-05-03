package client

import CommonServiceGrpcKt
import auth
import com.google.protobuf.Empty
import io.grpc.ManagedChannelBuilder
import kotlinx.coroutines.flow.collect
import java.util.UUID

suspend fun main() {
    val port = 50051
    val key = "0215568a-f2e8-4d40-979d-a0e4e0a44fb1"

    val channel = ManagedChannelBuilder.forAddress("localhost", port).usePlaintext().build()
    val stub = CommonServiceGrpcKt.CommonServiceCoroutineStub(channel)

    val hello = auth {
        fullName = "Yakushev Ivan"
        typeUser = AuthClient.TypeUser.DEVELOPER
        token = key
    }
    val result = stub.onAuthNotify(hello)
    print("Success is ${result.succeeded}")

    stub.onGpsUpdate(Empty.getDefaultInstance()).collect {
        stub.onGpsUpdate(Empty.getDefaultInstance())
        print("$it")
    }

}