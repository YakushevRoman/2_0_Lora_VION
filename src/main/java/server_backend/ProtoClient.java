package server_backend;


import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import server_backend.proto_loggers.LogType;
import server_backend.servers.ProtoServer;

import java.io.IOException;
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
    private ByteBuffer receiveBuffer = ByteBuffer.allocate(RECEIVE_BUFFER_SIZE_DEF);
    private final ConcurrentLinkedQueue<ByteBuffer> sendQueue = new ConcurrentLinkedQueue<>();
    private boolean isHeaderReceived = false;
    private int receivedHeaderSize;
    private int receivedCommandId;
    private int receivedCommandSize;
    private boolean running = false;
    private boolean connected = false;
    private ProtocolDispatcher protocolDispatcher = null;

    private void clearBuffers() {
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
        protocolDispatcher.notifyOnConnected();
    }

    private void notifyOnError(Throwable error) {
        protocolDispatcher.notifyOnError(error);
    }

    private void notifyOnDisconnected() {
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

    private void closeChannel(SocketChannel channel) {
        boolean wasConnected = connected;
        connected = false;
        try {
            channel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (wasConnected) {
            notifyOnDisconnected();
        }
    }

    private void handlerRead(SocketChannel channel) throws IOException {
        int bytesRead = channel.read(receiveBuffer);
        if (bytesRead == -1) {
            running = false;
            return;
        }
        if (isHeaderReceived || parseReceivedHeader(0)) {

            int startPos = 0;
            int endPos = startPos + receivedHeaderSize + receivedCommandSize;
            int dataEnd = receiveBuffer.position();

            byte[] data = receiveBuffer.array();
            int offset = receiveBuffer.arrayOffset();

            while (endPos <= dataEnd) {
                if (protocolDispatcher != null) {
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
            if (startPos > 0) {
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
    }

    private void sendQueueData(SocketChannel channel, SelectionKey key) throws IOException {
        while (!sendQueue.isEmpty()) {
            ByteBuffer buffer = sendQueue.peek();
            if (buffer.capacity() == 0) {
                running = false;
                return;
            }

            if (buffer.remaining() > 0)
                channel.write(buffer);

            if (buffer.remaining() == 0)
                sendQueue.poll();
        }
        key.interestOps(SelectionKey.OP_READ);
    }

    public boolean connect(final String hostName, final int port) {
        if (running)
            return false;

        sendQueue.clear();
        running = true;
        connected = false;
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

                channel.connect(address);

                while (running) {
                    selector.selectedKeys().clear();
                    selector.select();
                    if (!running)
                        break;

                    if (!sendQueue.isEmpty() && channel.isConnected() && (key.interestOps() & SelectionKey.OP_WRITE) == 0)
                        sendQueueData(channel, key);

                    if (!selector.selectedKeys().contains(key))
                        continue;

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
                        handlerRead(channel);
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

    public void setConnected(boolean connected) {
        this.connected = connected;
    }

    public boolean isConnected() {
        return running && connected;
    }

    public void stopClient() {
        if (running) {
            running = false;
            if (selector != null)
                selector.wakeup();
        }
    }

    public void setProtocolDispatcher(ProtocolDispatcher value) {
        protocolDispatcher = value;
    }


    private byte[] serializeMessage(int commandId, MessageLite message) {
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
            if (totalSize > MAX_SEND_COMMAND_SIZE) {
                return null;
            }
            byte[] res = new byte[totalSize];
            CodedOutputStream stream = CodedOutputStream.newInstance(res);
            stream.writeUInt32NoTag(commandId);
            stream.writeMessageNoTag(message);
            return res;
        } catch (IOException e) {
            return null;
        }
    }

    public void disconnect() {
        sendQueue.add(ByteBuffer.allocate(0));
        if (selector != null)
            selector.wakeup();
    }

    public boolean sendCommand(int commandId, MessageLite message) {
        byte[] command = serializeMessage(commandId, message);
        if (command == null)
            return false;

        sendQueue.add(ByteBuffer.wrap(command));

        if (selector != null)
            selector.wakeup();

        return true;
    }
}
