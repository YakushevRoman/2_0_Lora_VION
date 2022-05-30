package proto_server_client.utils

import com.google.protobuf.MessageLite

interface MessageInterceptor {
    fun onMessageCatch(commandId: Int, message: MessageLite?)
}