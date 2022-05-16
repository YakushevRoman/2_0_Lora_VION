package server_backend;

import server_backend.servers.UIThreadServerCommandDispatcher;

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
