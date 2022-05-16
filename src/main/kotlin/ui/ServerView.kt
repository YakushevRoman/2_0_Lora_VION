// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import server_client.ServerImpl


@Composable
@Preview
fun appServer(messages: MutableList<String>, sendMessage: () -> Unit) {

    MaterialTheme {
        Column {
            Text(
                modifier = Modifier.padding(8.dp),
                text = "Server implementation",
                fontSize = 24.sp
            )

            Row {
                Text(
                    modifier = Modifier.padding(8.dp),
                    text = "Messages: ",
                    fontSize = 16.sp
                )
                Button(onClick = sendMessage,
                    colors = ButtonDefaults.textButtonColors(backgroundColor = Color.Red)
                )
                {
                    Text("Send messages")
                }

                Button(onClick = {
                    messages.clear() },
                    colors = ButtonDefaults.textButtonColors(backgroundColor = Color.Red)
                )
                {
                    Text("Clear logs")
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
    var messageList = mutableStateListOf<String>()
    val server = ServerImpl(object : ServerImpl.OnNewMessageListener {
        override fun newMessage(message: String) {
            messageList.add(message)
        }
    }
    )
    server.startWork()

    Window(onCloseRequest = ::exitApplication) {
        appServer(messageList){
            server.sendListOfMessages()
        }
    }

}

