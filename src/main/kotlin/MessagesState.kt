import com.google.protobuf.MessageLite
import kotlinx.coroutines.flow.Flow

sealed class MessagesState{
    object Empty : MessagesState()
    data class Messages (val data: MutableList<MessageLite>): MessagesState()
}
