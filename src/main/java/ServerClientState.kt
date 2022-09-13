sealed class ServerClientState{
    object NotClient : ServerClientState()
    object ConnectedClient : ServerClientState()
    object DisconnectedClient : ServerClientState()
    class Error(exception: Throwable) : ServerClientState()
}