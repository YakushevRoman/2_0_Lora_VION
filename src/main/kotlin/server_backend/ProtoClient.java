package server_backend;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;

import java.io.IOException;
import java.lang.reflect.Array;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.StandardSocketOptions;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ProtoClient {
    // recv buffer size must be > 10
    private static final int RECEIVE_BUFFER_SIZE_DEF = 1024;
    private static final int RECEIVE_BUFFER_SIZE_MAX = 16384; // buffer can grow up to max (if max > def)

    // NOTE tagger internally uses 512 byte buffer for commands
    // so it cannot process command larger than 512 bytes.
    // if you communicate with tagger directly, make sure that this value is 512 or less.
    // you can use bigger value if other side is not a tagger (and not a low resource device).
    private static final int MAX_SEND_COMMAND_SIZE = 16384; // must be 512 or less for communication with tagger

    private Selector selector;
    //private SocketChannel channel;
    private int reconnetTimeoutMs = 2000; // Set to negative value to disable reconnect

    private ByteBuffer receiveBuffer = ByteBuffer.allocate(RECEIVE_BUFFER_SIZE_DEF);
    //private LinkedList<ByteBuffer> sendQueue = null;
    private ConcurrentLinkedQueue<ByteBuffer> sendQueue = new ConcurrentLinkedQueue<ByteBuffer>();

    private boolean isHeaderReceived = false;
    private int receivedHeaderSize;
    private int receivedCommandId;
    private int receivedCommandSize;
    private boolean running = false;
    private boolean connected = false;
    private ProtocolDispatcher protocolDispatcher = null;

    private void clearBuffers()
    {
        isHeaderReceived = false;
        receiveBuffer.clear();
    }

    public interface ProtocolDispatcher {
        MessageLite parseMessage(int commandId, CodedInputStream stream) throws IOException;

        void dispatchMessage(int commandId, MessageLite message);

        void notifyOnConnected();

        void notifyOnError(Throwable error);

        void notifyOnDisconnected();
    }

    private void notifyOnConnected() {
        //Log.d("proto_client", "client connected");
        protocolDispatcher.notifyOnConnected();
    }

    private void notifyOnError(Throwable error) {
       // Log.d("proto_client", "error ", error);
       protocolDispatcher.notifyOnError(error);
    }

    private void notifyOnDisconnected() {
        //Log.d("proto_client", "client disconnected");
        protocolDispatcher.notifyOnDisconnected();
    }

    private void growReceiveBuffer(int newCapacity) throws InvalidProtocolBufferException {
        if (newCapacity > RECEIVE_BUFFER_SIZE_MAX)
            throw new InvalidProtocolBufferException("Incoming message is to big (" +
                    newCapacity + " bytes), and cannot be stored in receive buffer");
        ByteBuffer newBuffer = ByteBuffer.allocate(newCapacity);
        receiveBuffer.flip();
        newBuffer.put(receiveBuffer);
        receiveBuffer = newBuffer;
    }

    private boolean parseReceivedHeader(int startPos) throws InvalidProtocolBufferException {
        int length = receiveBuffer.position();
        if (length - startPos < 2)
            return false;
        byte[] data = receiveBuffer.array();
        int pos = startPos + receiveBuffer.arrayOffset();
        length += receiveBuffer.arrayOffset();

        // parse command id
        int commandId = data[pos++];
        if (commandId < 0)  // slow case (less unlikely, most commands has 1 byte length)
        {
            commandId &= 0x7F;
            int shift = 7;
            while (pos < length && data[pos] < 0) {
                if (shift > 32)
                    throw new InvalidProtocolBufferException("Incorrect command id format");
                commandId |= (data[pos++] & 0x7F) << shift;
                shift += 7;
            }
            if (pos < length)
                commandId |= (data[pos++] & 0x7F) << shift;
            if (pos == length)
                return false;
        }

        // parse command size
        int commandSize = data[pos++];
        if (commandSize < 0) {
            commandSize &= 0x7F;
            int shift = 7;
            while (pos < length && data[pos] < 0) {
                if (shift > 32)
                    throw new InvalidProtocolBufferException("Incorrect command size format");
                commandSize |= (data[pos++] & 0x7F) << shift;
                shift += 7;
            }
            if (pos == length)
                return false;
            commandSize |= (data[pos++] & 0x7F) << shift;
            if (commandSize < 0)
                throw new InvalidProtocolBufferException("Command size cannot be negative");
        }

        isHeaderReceived = true;
        receivedHeaderSize = pos - startPos;
        receivedCommandId = commandId;
        receivedCommandSize = commandSize;
        return true;
    }

    private void closeChannel(SocketChannel channel)
    {
        boolean wasConnected = connected;
        connected = false;
        try{
            channel.close();
        }
        catch(IOException e){
            //Log.d("proto_client", "close failed", e);
        }
        if (wasConnected) {
            notifyOnDisconnected();
        }
    }
    
    private final static char[] hexChars = "0123456789ABCDEF".toCharArray();

    public static String bytesToHex(byte[] bytes, int from, int end) {
      int len = end - from;
      char[] hexData = new char[len * 2];
      for ( int j = 0; j < len; j++ ) {
          int v = bytes[from + j] & 0xFF;
          hexData[j * 2] = hexChars[v >>> 4];
          hexData[j * 2 + 1] = hexChars[v & 0x0F];
      }
      return new String(hexData);
    }
    
    private boolean handleRead(SocketChannel channel) throws IOException
    {
        int bytesRead = channel.read(receiveBuffer);
        if (bytesRead == -1)
        {
            //Log.d("proto_client", "connection disconnected by remote side");
            running = false;
            return false;
        }
        //Log.d("proto_client", bytesRead + " bytes received");
        if (isHeaderReceived || parseReceivedHeader(0)) {

            int startPos = 0;
            int endPos = startPos + receivedHeaderSize + receivedCommandSize;
            int dataEnd = receiveBuffer.position();

            byte[] data = receiveBuffer.array();
            int offset = receiveBuffer.arrayOffset();

            while (endPos <= dataEnd) {
                if (protocolDispatcher != null) {
                    
		    //Log.d("proto_client", "before parse data len = " + data.length + " offset =  " + offset + " startPos = " + startPos + " endPos = " + endPos);
		    //Log.d("proto_client", "parse command " + bytesToHex(data, offset + startPos, offset + endPos));
                    CodedInputStream stream = CodedInputStream.newInstance(data, offset + startPos + receivedHeaderSize, endPos - startPos - receivedHeaderSize);
                    MessageLite msg = protocolDispatcher.parseMessage(receivedCommandId, stream);
                    protocolDispatcher.dispatchMessage(receivedCommandId, msg);
                }
                isHeaderReceived = false;
                startPos = endPos;
                if (!parseReceivedHeader(startPos))
                    break;
                endPos = startPos + receivedHeaderSize + receivedCommandSize;
            }
            if (startPos > 0)
            {
                receiveBuffer.flip();
                receiveBuffer.position(startPos);
                receiveBuffer.compact();
            }

            if (isHeaderReceived) {
                int totalSize = receivedHeaderSize + receivedCommandSize;
                if (totalSize > receiveBuffer.capacity())
                    growReceiveBuffer(totalSize);
            }
        }
     	return true;
    }

    private void sendQueueData(SocketChannel channel, SelectionKey key) throws IOException
    {
        while (!sendQueue.isEmpty())
        {
            ByteBuffer buffer = sendQueue.peek();
            if (buffer.capacity() == 0){
                //channel.shutdownOutput();
                running = false;
                return;
            }
            if (buffer.remaining() > 0)
            {
                //Log.d("proto_client", "sending " + buffer.remaining() + " bytes - " + bytesToHex(buffer.array(), buffer.arrayOffset() + buffer.position(), buffer.arrayOffset() + buffer.limit()));
                int res = channel.write(buffer);
                //Log.d("proto_client", res + " bytes sent");
            }
            if (buffer.remaining() == 0)
                sendQueue.poll();
        }
        if (sendQueue.isEmpty()) // remove OP_WRITE (because we do not have data that waits for send).
            key.interestOps(SelectionKey.OP_READ);
        else if ((key.interestOps() & SelectionKey.OP_WRITE) == 0)
            key.interestOps(SelectionKey.OP_READ & SelectionKey.OP_WRITE);
    }

    //        InetSocketAddress address = InetSocketAddress.createUnresolved("localhost", 4000 );

    public boolean connect(final String hostName, final int port) {
        if (running)
            return false;
        sendQueue.clear();
        running = true;
        connected  = false;
        new Thread(() -> {
            clearBuffers();
            connected = false;
            SocketChannel channel = null;
            try {
                SocketAddress address = new InetSocketAddress(hostName, port);

                selector = Selector.open();
                channel = SocketChannel.open();
                channel.configureBlocking(false);
                channel.setOption(StandardSocketOptions.TCP_NODELAY, true);
                SelectionKey key = channel.register(selector, SelectionKey.OP_CONNECT);
                //Log.d("proto_client", "connecting to " + address.toString());

                channel.connect(address);

                while (running) {
                   //Log.d("proto_client", "Enter select sleep key bits=" + key.interestOps());
                    selector.selectedKeys().clear();
                    int selectResult = selector.select();
                   //Log.d("proto_client", "Select leave completed =" + selectResult);
                    if (!running) break;
                    if (!sendQueue.isEmpty() && channel.isConnected() && (key.interestOps() & SelectionKey.OP_WRITE) == 0)
                       sendQueueData(channel, key);

                    if (!selector.selectedKeys().contains(key)) continue;

                    if (key.isConnectable()) {
                        connected = channel.finishConnect();
                        if (connected) {
                            key.interestOps(SelectionKey.OP_READ);
                            notifyOnConnected();

                            selector.selectedKeys().clear();
                            if (!sendQueue.isEmpty())
                                sendQueueData(channel, key);
                        }
                    }
                    if (key.isReadable())
                        handleRead(channel);
                    if (key.isWritable())
                        sendQueueData(channel, key);
                }
            } catch (IOException e) {
                running = false;
                notifyOnError(e);
            }
            if (channel != null && channel.isOpen()) {
                closeChannel(channel);
            }
        }).start();
        return true;
    }

    public void setConnected (boolean connected){
        this.connected = connected;
    }

    boolean isRunning() {
        return running;
    }

    boolean isConnecing() {
        return running && !connected;
    }

    public boolean isConnected() {
        return running && connected;
    }
    public boolean isConnectedNetWork() {
        return connected;
    }


    public void stopClient()
    {
        if (running) {
            running = false;
            if (selector != null) {
                selector.wakeup();
            }
        }
    }

    public void setProtocolDispatcher(ProtocolDispatcher value) {
        protocolDispatcher = value;
    }


    private byte[] serializeMessage(int commandId, MessageLite message)
    {
        try {
            int cmdSize = CodedOutputStream.computeUInt32SizeNoTag(commandId);
            if (message == null) {
                byte[] res = new byte[cmdSize + 1];
                CodedOutputStream stream = CodedOutputStream.newInstance(res);
                stream.writeUInt32NoTag(commandId);
                res[cmdSize] = 0;
                return res;
            }
            int msgSize = CodedOutputStream.computeMessageSizeNoTag(message);
            int totalSize = cmdSize + msgSize;
            if (totalSize > MAX_SEND_COMMAND_SIZE)
            {
                //Log.d("proto_client", "command size exceed MAX_SEND_COMMAND_SIZE limit.  tagger cannot handle big commands cmdId = " + commandId + " commandSize = "  + totalSize);
                return null;
            }
            byte[] res = new byte[totalSize];
            CodedOutputStream stream = CodedOutputStream.newInstance(res);
            stream.writeUInt32NoTag(commandId);
            stream.writeMessageNoTag(message);
            return res;
        }
        catch (IOException e)
        {
            //Log.d("proto_client", "serializeMessage failed. Make sure that message is not modified from another threads during serialization cmdId = " + commandId, e);
            return null;
        }
    }

    public void disconnect() {
        // if queue contains packets - send them first and disconnect after that
        sendQueue.add(ByteBuffer.allocate(0));
        if (selector != null)
            selector.wakeup();
    }

    public boolean sendCommand(int commandId, MessageLite message)
    {
        byte[] command = serializeMessage(commandId, message);
        if (command == null)
            return false;
        sendQueue.add(ByteBuffer.wrap(command));
        if (selector != null)
            selector.wakeup();
        return true;
    }
}
