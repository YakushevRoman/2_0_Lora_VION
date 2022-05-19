package proto_server_client.servers;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Message;

import java.io.IOException;


public class UIThreadServerCommandDispatcher implements ProtoServer.ProtocolDispatcher {

    private UiThreadExecutor executor;

    public interface UiThreadExecutor {

        void executeInUiThread(Runnable runnable);

    }

    private ProtoServer.ProtocolDispatcher realDispatcher;

    public UIThreadServerCommandDispatcher(ProtoServer.ProtocolDispatcher realDispatcher, UiThreadExecutor executor ) {
        this.realDispatcher = realDispatcher;
        this.executor = executor;
    }

    @Override
    public Message parseMessage(final int commandId, CodedInputStream stream) throws IOException {
        return realDispatcher.parseMessage(commandId, stream);
    }

    @Override
    public boolean dispatchMessage(final ProtoServer.Connection connection, final int commandId, final Message message) {
        executor.executeInUiThread(() -> realDispatcher.dispatchMessage(connection, commandId, message));
        return true;
    }

    @Override
    public void notifyOnConnected(final ProtoServer.Connection connection) {
        executor.executeInUiThread(() -> realDispatcher.notifyOnConnected(connection));
    }

    @Override
    public void notifyOnError(final ProtoServer.Connection connection, final Throwable error) {
        executor.executeInUiThread(() -> realDispatcher.notifyOnError(connection, error));
    }

    @Override
    public void notifyOnDisconnected(final ProtoServer.Connection connection) {
        executor.executeInUiThread(() -> realDispatcher.notifyOnDisconnected(connection));
    }

}
