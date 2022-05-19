package proto_server_client.logger;

import com.google.protobuf.Message;

public interface LogFormatter<T extends Message> {
    String generateLog(T message);
    String generateLog();
}