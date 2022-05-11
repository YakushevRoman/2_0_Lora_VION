// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application


@Composable
@Preview
fun app() {
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

                    }
                }
            }

            Text(
                modifier = Modifier.padding(top = 10.dp),
                text = "List of gps positions: "
            )
        }

    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        app()
    }

}

