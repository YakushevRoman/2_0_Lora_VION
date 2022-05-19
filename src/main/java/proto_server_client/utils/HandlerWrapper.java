package proto_server_client.utils;

import proto_server_client.servers.UIThreadServerCommandDispatcher;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class HandlerWrapper implements UIThreadServerCommandDispatcher.UiThreadExecutor {
    private final Executor handler;

    public HandlerWrapper(ExecutorService handler) {
        this.handler = handler;
    }

    public void executeInUiThread(Runnable runnable) {
        handler.execute(runnable);
    }

}
