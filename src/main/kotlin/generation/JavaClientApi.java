// Generated by the protocol buffer compiler. DO NOT EDIT!
// if you need to change something in code generator, please contact Alexander Lobas (alexanderlobas@yahoo.com)
package generation;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.MessageLite;
import generation.files.ForpostServer;
import generation.files.ProtoClient;
import generation.files.UIThreadClientCommandDispatcher;

import java.io.IOException;

public class JavaClientApi implements ProtoClient.ProtocolDispatcher {
  private final ProtoClient client;

  public JavaClientApi(ProtoClient client, boolean callListenersInUIThread, UIThreadClientCommandDispatcher.UiThreadExecutor executor) {
    this.client = client;
    if (callListenersInUIThread)
      client.setProtocolDispatcher(new UIThreadClientCommandDispatcher(this, executor));
    else
      client.setProtocolDispatcher(this);
  }

  public boolean sendHelloFromDev(ForpostServer.HelloFromDev message) {
  	return client.sendCommand(1, message);
  }

  public boolean sendPing() {
  	return client.sendCommand(7, null);
  }

  public void disconnect() {
    client.disconnect();
  }

  public ProtoClient getClient() {
    return client;
  }

  public interface OnStartGameListener {
    void onStartGameReceived(ForpostServer.StartGame message);
  }

  public interface OnStopGameListener {
    void onStopGameReceived();
  }

  public interface OnConnectedListener {
    void onConnected();
  }

  public interface OnErrorListener {
    void onError(Throwable error);
  }

  public interface OnDisconnectedListener {
    void onDisconnected();
  }

  private volatile OnStartGameListener onStartGameListener = null;
  private volatile OnStopGameListener onStopGameListener = null;

  private volatile OnConnectedListener onConnectedListener = null;
  private volatile OnErrorListener onErrorListener = null;
  private volatile OnDisconnectedListener onDisconnectedListener = null;

  private void notifyStartGameReceived(ForpostServer.StartGame message) {
    OnStartGameListener localCopy = onStartGameListener;
    if (localCopy != null)
      localCopy.onStartGameReceived(message);
  }

  private void notifyStopGameReceived() {
    OnStopGameListener localCopy = onStopGameListener;
    if (localCopy != null)
      localCopy.onStopGameReceived();
  }

  @Override
  public void notifyOnConnected() {
    OnConnectedListener localCopy = this.onConnectedListener;
    if (localCopy != null)
      localCopy.onConnected();
  }

  @Override
  public void notifyOnError(Throwable error) {
    OnErrorListener localCopy = this.onErrorListener;
    if (localCopy != null)
      localCopy.onError(error);
  }

  @Override
  public void notifyOnDisconnected() {
    OnDisconnectedListener localCopy = this.onDisconnectedListener;
    if (localCopy != null)
      localCopy.onDisconnected();
  }

  public void setOnStartGameListener(OnStartGameListener listener)
  {
    onStartGameListener = listener;
  }

  public void setOnStopGameListener(OnStopGameListener listener)
  {
    onStopGameListener = listener;
  }

  public void setOnConnectedListener(OnConnectedListener listener)
  {
    this.onConnectedListener = listener;
  }

  public void setOnErrorListener(OnErrorListener listener)
  {
    this.onErrorListener = listener;
  }

  public void setOnDisconnectedListener(OnDisconnectedListener listener)
  {
    this.onDisconnectedListener = listener;
  }


  @Override
  public MessageLite parseMessage(int commandId, CodedInputStream inputStream) throws IOException {
    switch(commandId) {
    case 3: return ForpostServer.StartGame.parser().parsePartialFrom(inputStream);
    case 12: return ForpostServer.ChangeId.parser().parsePartialFrom(inputStream);
    default:
       return null;
    }
  }

  @Override
  public void dispatchMessage(int commandId, MessageLite message) {
    switch (commandId) {
      case 3:
        notifyStartGameReceived((ForpostServer.StartGame) message);
      case 4:
        notifyStopGameReceived();
    }
  }

}
