// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.google.protobuf.Empty
import io.grpc.ManagedChannelBuilder
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.*

@Composable
@Preview
fun app(gpsPositions: MutableList<Gps.GpsParameter>) {
    val key = "0215568a-f2e8-4d40-979d-a0e4e0a44fb1"

    MaterialTheme {
        Column {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp)
                    .clickable { },
                elevation = 8.dp
            ) {
                Box() {
                    Column(modifier = Modifier.padding(8.dp)) {
                        Text(
                            modifier = Modifier.padding(top = 10.dp),
                            text = "Authorization",
                            fontSize = 24.sp
                        )

                        val token = remember { mutableStateOf(key) }
                        TextField(
                            modifier = Modifier.padding(top = 10.dp),
                            value = token.value,
                            onValueChange = { token.value = it },
                            label = { Text("Token") }
                        )


                        val fullName = remember { mutableStateOf("Yakushev Roman") }
                        TextField(
                            modifier = Modifier.padding(top = 10.dp),
                            value = fullName.value,
                            onValueChange = { fullName.value = it },
                            label = { Text("Full name") }
                        )

                        DropdownDemo()
                    }
                }
            }

            Text(
                modifier = Modifier.padding(top = 10.dp),
                text = "List of gps positions: "
            )
            LazyColumn(modifier = Modifier.fillMaxHeight()) {
                items(gpsPositions.size) {
                    listItem(gpsPositions[it])
                }
            }
        }

    }
}

@Composable
fun DropdownDemo() {
    var expanded by remember { mutableStateOf(false) }
    val items: List<AuthClient.TypeUser> = AuthClient.TypeUser.values().asList()
    var selectedIndex by remember { mutableStateOf(0) }

    Box(modifier = Modifier.wrapContentSize(Alignment.TopStart)) {

        Text(
            items[selectedIndex].toString(),
            modifier = Modifier
                .fillMaxWidth()
                .clickable(onClick = { expanded = true })
                .background(Color.Gray)
        )
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier.fillMaxWidth().background(
                Color.Red
            )
        ) {
            items.forEachIndexed { index, s ->
                DropdownMenuItem(onClick = {
                    selectedIndex = index
                    expanded = false
                }) {
                    Text(text = s.toString())
                }
            }
        }
    }
}

@Composable
private fun listItem(item: Gps.GpsParameter) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
            .clickable { },
        elevation = 8.dp
    ) {
        Box() {
            Column(modifier = Modifier.padding(8.dp)) {
                Text("Message: $item")
            }
        }
    }
}

fun main() = application {
    val gpsPositions = mutableStateListOf<Gps.GpsParameter>()
    gpsPositions.add(
        Gps.GpsParameter
            .newBuilder()
            .setHeight(1)
            .setLong(1)
            .setLat(1)
            .build()
    )

    Window(onCloseRequest = ::exitApplication) {
        app(gpsPositions)
    }
    GlobalScope.launch {
        client(gpsPositions)
    }

}

suspend fun client(gpsPositions: MutableList<Gps.GpsParameter>) {
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

    stub.onGpsUpdate(Empty.getDefaultInstance()).collect {
        println("${it.gpsDataList.size}")
        gpsPositions.addAll(it.gpsDataList)
    }

}
