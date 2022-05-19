package proto_server_client.servers;

import com.google.protobuf.InvalidProtocolBufferException;

import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;

public class ProtoCmdParser implements Serializable {

    int mReceivedHeaderSize;
    int mReceivedCommandId;
    int mReceivedCommandSize;
    int mMaxBufferSize;
    boolean mIsHeaderReceived;
    ByteBuffer mReceiveBuffer;
    CommandReceiver mCmdReceiver;
    ProtoServer.LogWriter logWriter;

    interface CommandReceiver {
        void onCommand(int commandId, byte[] data, int offset, int len) throws IOException;
    }

    public ByteBuffer getBuffer() {
        return mReceiveBuffer;
    }

    public ProtoCmdParser(CommandReceiver receiver, int defaultBufSize, int maxBufSize) {
        mCmdReceiver = receiver;
        mReceiveBuffer = ByteBuffer.allocate(defaultBufSize);
        mMaxBufferSize = maxBufSize;
    }

    public void setLogger(ProtoServer.LogWriter mLogWriter) {
        logWriter = mLogWriter;
    }

    public void putData(byte[] data, int offset, int length) throws IOException {
        if (mReceiveBuffer.position() + length > mReceiveBuffer.capacity()) {
            growReceiveBuffer(mReceiveBuffer.position() + length);
        }
        mReceiveBuffer.put(data, offset, length);
    }

    public void growReceiveBuffer(int newCapacity) throws IOException {
        if (newCapacity > mMaxBufferSize)
            throw new InvalidProtocolBufferException("Incoming message is to big (" +
                    newCapacity + " bytes), and cannot be stored in receive buffer");
        ByteBuffer newBuffer = ByteBuffer.allocate(newCapacity);
        mReceiveBuffer.flip();
        newBuffer.put(mReceiveBuffer);
        mReceiveBuffer = newBuffer;
    }


    public void parse() throws IOException {

        if (mIsHeaderReceived || parseReceivedHeader(0)) {

            int startPos = 0;
            int endPos = startPos + mReceivedHeaderSize + mReceivedCommandSize;
            int dataEnd = mReceiveBuffer.position();

            byte[] data = mReceiveBuffer.array();
            int offset = mReceiveBuffer.arrayOffset();

            while (endPos <= dataEnd) {
                if (logWriter != null)
                    logWriter.writeLine("Received msg: " + ProtoServer.bytesToHex(data, (offset + startPos), (offset + endPos)));

                mCmdReceiver.onCommand(mReceivedCommandId, data, offset + startPos + mReceivedHeaderSize, endPos - startPos - mReceivedHeaderSize);
                mIsHeaderReceived = false;
                startPos = endPos;
                if (!parseReceivedHeader(startPos))
                    break;
                endPos = startPos + mReceivedHeaderSize + mReceivedCommandSize;
            }
            if (startPos > 0) {
                mReceiveBuffer.flip();
                mReceiveBuffer.position(startPos);
                mReceiveBuffer.compact();
            }

            if (mIsHeaderReceived) {
                int totalSize = mReceivedHeaderSize + mReceivedCommandSize;
                if (totalSize > mReceiveBuffer.capacity())
                    growReceiveBuffer(totalSize);
            }
        }

    }

    private boolean parseReceivedHeader(int startPos) throws InvalidProtocolBufferException {
        int length = mReceiveBuffer.position();
        if (length - startPos < 2)
            return false;
        byte[] data = mReceiveBuffer.array();
        int pos = startPos + mReceiveBuffer.arrayOffset();
        length += mReceiveBuffer.arrayOffset();

        // parse command id
        int commandId = data[pos++];
        if (commandId < 0)  // slow case (less unlikely, most commands has 1 byte length)
        {
            commandId &= 0x7F;
            int shift = 7;
            while (pos < length && data[pos] < 0) {
                if (shift > 32)
                    throw new InvalidProtocolBufferException("Incorrect command id format, pos = " + pos);
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

        mIsHeaderReceived = true;
        mReceivedHeaderSize = pos - startPos;
        mReceivedCommandId = commandId;
        mReceivedCommandSize = commandSize;
        return true;
    }
}
