package proto_server_client.utils;

import proto_server_client.servers.UIThreadServerCommandDispatcher;

import java.util.concurrent.ExecutorService;

public class HandlerWrapperExecutor implements UIThreadServerCommandDispatcher.UiThreadExecutor {

    private ExecutorService handler;

    public HandlerWrapperExecutor(ExecutorService handler) {
        this.handler = handler;
    }

    public void executeInUiThread(Runnable runnable) {
        handler.execute(runnable);
    }

}
