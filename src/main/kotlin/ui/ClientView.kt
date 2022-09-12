package ui// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import server_client.ClientImpl


@Composable
@Preview
fun appClient(messages: MutableList<String>, reconnect: () -> Unit, sendStat: () -> Unit) {

    MaterialTheme {
        Column {
            Text(
                modifier = Modifier.padding(8.dp),
                text = "Client implementation",
                fontSize = 24.sp
            )

            Row {
                Text(
                    modifier = Modifier.padding(8.dp),
                    text = "Messages: ",
                    fontSize = 16.sp
                )
                Button(
                    onClick = {},
                    colors = ButtonDefaults.textButtonColors(backgroundColor = Color.Red)
                )
                {
                    Text("Send messages")
                }
                Button(
                    onClick = { messages.clear() },
                    colors = ButtonDefaults.textButtonColors(backgroundColor = Color.Red)
                )
                {
                    Text("Clear messages")
                }
                Button(
                    onClick = reconnect,
                    colors = ButtonDefaults.textButtonColors(backgroundColor = Color.Red)
                )
                {
                    Text("Reconnect")
                }

                Button(
                    onClick = sendStat,
                    colors = ButtonDefaults.textButtonColors(backgroundColor = Color.Red)
                )
                {
                    Text("Send statFromKit and statByID")
                }
            }

            LazyColumn(modifier = Modifier.fillMaxHeight()) {
                items(count = messages.size, itemContent = { item ->
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
                                    text = messages[item],
                                    fontSize = 14.sp
                                )
                            }
                        }
                    }
                })
            }

        }

    }
}

fun main() = application {
    val client = ClientImpl()

    Window(onCloseRequest = ::exitApplication) {
        appClient(
            client.messages,
            {
                client.reconect()
            },
            {
                client.sendStatById()
            })
    }
}



