// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.BottomNavigation
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.google.protobuf.Empty
import io.grpc.ManagedChannelBuilder
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.*

@Composable
@Preview
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }

    MaterialTheme {
        Column {
            Button(onClick = {
                text = "Test "
            }) {
                Text(text)
            }
            val list = listOf("A", "B", "C", "D")

            LazyColumn(modifier = Modifier.fillMaxHeight()) {
                items(list.size) {
                    Text("Test Test Test Test ${list[it]} ")
                }
            }

            BottomNavigation {

            }

        }

    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
    GlobalScope.launch {
        client()
    }

}

suspend fun client() {
    val port = 50051

    val channel = ManagedChannelBuilder.forAddress("localhost", port).usePlaintext().build()
    val stub = CommonServiceGrpcKt.CommonServiceCoroutineStub(channel)

    val hello = auth {
        fullName = "Yakushev Ivan"
        typeUser = AuthClient.TypeUser.DEVELOPER
        token = UUID.randomUUID().toString()
    }
    val result = stub.onAuthNotify(hello)
    print("Success is ${result.succeeded}")

    if (result.succeeded)
        stub.onGpsUpdate(Empty.getDefaultInstance()).collect {
            println("$it")
            stub.onGpsUpdate(Empty.getDefaultInstance())
        }

}
