package server_backend;

import server_backend.servers.UIThreadServerCommandDispatcher;

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
