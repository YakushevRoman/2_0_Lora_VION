package client

import CommonServiceGrpcKt
import auth
import com.google.protobuf.Empty
import io.grpc.ManagedChannelBuilder
import kotlinx.coroutines.flow.collect
import java.util.UUID

suspend fun main() {
    val port = 50051

    val channel = ManagedChannelBuilder.forAddress("localhost", port).usePlaintext().build()
    val stub = CommonServiceGrpcKt.CommonServiceCoroutineStub(channel)

    val hello = auth {
        fullName = "Yakushev Roman"
        typeUser = AuthClient.TypeUser.DEVELOPER
        token = UUID.randomUUID().toString()
    }
    val result = stub.onAuthNotify(hello)
    print("Success is ${result.succeeded}")

    if (result.succeeded)
        stub.onGpsUpdate(Empty.getDefaultInstance()).collect {
            print("$it")
        }

}