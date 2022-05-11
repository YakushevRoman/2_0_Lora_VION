package server_backend.servers;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.MessageLite;
import server_backend.ProtoClient;

import java.io.IOException;


public class UIThreadClientCommandDispatcher implements ProtoClient.ProtocolDispatcher {

    private final UiThreadExecutor executor;

    private final ProtoClient.ProtocolDispatcher realDispatcher;

    public UIThreadClientCommandDispatcher(ProtoClient.ProtocolDispatcher realDispatcher, UiThreadExecutor executor ) {
        this.realDispatcher = realDispatcher;
        this.executor = executor;
    }

    @Override
    public MessageLite parseMessage(final int commandId, CodedInputStream stream) throws IOException {
        return realDispatcher.parseMessage(commandId, stream);
    }

    @Override
    public void dispatchMessage(final int commandId, final MessageLite message) {
        executor.executeInUiThread(() -> realDispatcher.dispatchMessage(commandId, message));
    }

    @Override
    public void notifyOnConnected() {
        executor.executeInUiThread(realDispatcher::notifyOnConnected);
    }

    @Override
    public void notifyOnError(final Throwable error) {
        executor.executeInUiThread(() -> realDispatcher.notifyOnError(error));
    }

    @Override
    public void notifyOnDisconnected() {
        executor.executeInUiThread(realDispatcher::notifyOnDisconnected);
    }

    public interface UiThreadExecutor {
        void executeInUiThread(Runnable runnable);
    }

}
