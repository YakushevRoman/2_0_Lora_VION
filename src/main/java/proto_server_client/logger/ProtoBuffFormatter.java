package proto_server_client.logger;


import com.google.protobuf.ByteString;
import com.google.protobuf.Message;
import com.googlecode.protobuf.format.ProtobufFormatter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ProtoBuffFormatter<T extends Message>
        implements LogFormatter<T>, JSONFormatter.ByteSerializer {

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss.SSS", Locale.getDefault());
    private final ProtobufFormatter logFormat;
    private final LogType logType;

    public ProtoBuffFormatter(LogType logType) {
        this.logType = logType;
        logFormat = new JSONFormatter(this);
    }

    private String messageFormatter(T message) {
        return message.getDefaultInstanceForType().getClass().getSimpleName() + " params = " + logFormat.printToString(message);
    }

    private String time() {
        return dateFormat.format(new Date()) + " ";
    }

    @Override
    public String generateLog(T message) {
        return time() + logType.getLog() + messageFormatter(message)+" commandID: ";
    }

    @Override
    public String generateLog() {
        return time() + logType.getLog() + "nullable message commandID: ";
    }

    @Override
    public String escapeBytes(ByteString input) {
        byte[] bytes = input.toByteArray();
        StringBuilder result = new StringBuilder();
        for (byte b : bytes)
            result.append(String.format("%02X", b));

        return result.toString();
    }

    @Override
    public ByteString unescapeBytes(CharSequence input) {
        return null;
    }

}
