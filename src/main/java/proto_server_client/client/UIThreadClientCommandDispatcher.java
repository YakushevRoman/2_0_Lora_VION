package proto_server_client.client;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.MessageLite;
import proto_server_client.utils.HandlerWrapper;

import java.io.IOException;


public class UIThreadClientCommandDispatcher implements ProtoClient.ProtocolDispatcher {

    private final HandlerWrapper handlerWrappe;

    private final ProtoClient.ProtocolDispatcher realDispatcher;

    public UIThreadClientCommandDispatcher(ProtoClient.ProtocolDispatcher realDispatcher,  HandlerWrapper handlerWrapper ) {
        this.realDispatcher = realDispatcher;
        this.handlerWrappe = handlerWrapper;
    }

    @Override
    public MessageLite parseMessage(final int commandId, CodedInputStream stream) throws IOException {
        return realDispatcher.parseMessage(commandId, stream);
    }

    @Override
    public void dispatchMessage(final int commandId, final MessageLite message) {
        handlerWrappe.executeInUiThread(() -> realDispatcher.dispatchMessage(commandId, message));
    }

    @Override
    public void notifyOnConnected() {
        handlerWrappe.executeInUiThread(realDispatcher::notifyOnConnected);
    }

    @Override
    public void notifyOnError(final Throwable error) {
        handlerWrappe.executeInUiThread(() -> realDispatcher.notifyOnError(error));
    }

    @Override
    public void notifyOnDisconnected() {
        handlerWrappe.executeInUiThread(realDispatcher::notifyOnDisconnected);
    }

    public interface UiThreadExecutor {
        void executeInUiThread(Runnable runnable);
    }

}
