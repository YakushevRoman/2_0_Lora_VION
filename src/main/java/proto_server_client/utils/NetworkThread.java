package proto_server_client.utils;

import proto_server_client.servers.ProtoServer;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

public class NetworkThread extends Thread {
    public static final String NETWORK_THREAD = "NETWORK_THREAD: \n";

    Selector mSelector;
    ArrayList<ProtocolHandler> mHandlers = new ArrayList<>();
    boolean mIsRunning;
    ConcurrentLinkedQueue<ThreadMessage> mMessageQueue = new ConcurrentLinkedQueue<ThreadMessage>();
    private final ProtoServer.LogFactory logger;

    public NetworkThread(ProtoServer.LogFactory logger) {
        this.logger = logger;
    }

    void StopProtoHandler(ProtocolHandler handler) {
        try {
            handler.onStop();
        } catch (IOException e) {
            logger.getMainLog().writeLine(NETWORK_THREAD + stackTrace(e));
        }
    }

    class StartProtocolMessage implements ThreadMessage {
        private final ProtocolHandler mHandler;

        StartProtocolMessage(ProtocolHandler handler) {
            mHandler = handler;
        }

        @Override
        public void execute() {
            try {
                mHandler.onStart(mSelector);
                mHandlers.add(mHandler);
            } catch (IOException e) {
                logger.getMainLog().writeLine(NETWORK_THREAD + stackTrace(e));
                StopProtoHandler(mHandler);
            }
        }
    }

    class StopProtocolMessage implements ThreadMessage {
        private final ProtocolHandler mHandler;

        StopProtocolMessage(ProtocolHandler handler) {
            mHandler = handler;
        }

        @Override
        public void execute() {
            mHandlers.remove(mHandler);
            StopProtoHandler(mHandler);
        }
    }

    void processMessages() {
        ThreadMessage msg = mMessageQueue.poll();
        while (msg != null) {
            msg.execute();
            msg = mMessageQueue.poll();
        }
    }

    long getWaitTime() {
        long now = System.currentTimeMillis();
        long next = Long.MAX_VALUE;
        for (ProtocolHandler handler : mHandlers) {
            long time = handler.getNextWakeupTime();
            if (time < next) {
                next = time;
                if (time < now) {
                    return 0;
                }
            }
        }
        return next - now;
    }

    void processTimeouts() {
        for (ProtocolHandler handler : mHandlers) {
            handler.processTimeouts();
        }
    }

    @Override
    public void run() {
        try {
            mIsRunning = true;
            mSelector = Selector.open();
            while (mIsRunning) {
                try {

                    processMessages();

                    long delay = getWaitTime();
                    if (delay == 0) {
                        processTimeouts();
                        delay = getWaitTime();
                    }
                    int selectResult = (delay > 0) ? mSelector.select(delay) : mSelector.selectNow();
                    if (selectResult == 0)
                        continue;

                    Set<SelectionKey> selectedKeys = mSelector.selectedKeys();
                    Iterator<SelectionKey> iterator = selectedKeys.iterator();
                    while (iterator.hasNext()) {
                        SelectionKey key = iterator.next();
                        iterator.remove();

                        SelectionHandler handler = (SelectionHandler) key.attachment();
                        handler.keySelected(key);
                    }
                } catch (Exception e) {
                    logger.getMainLog().writeLine(NETWORK_THREAD + stackTrace(e));
                }
            }
        } catch (Exception e) {
            logger.getMainLog().writeLine(NETWORK_THREAD + stackTrace(e));
        }

    }

    public void postMessage(ThreadMessage message) {
        mMessageQueue.add(message);
        if (mSelector != null)
            mSelector.wakeup();
    }

    public void startProtoHandler(ProtocolHandler handler) {
        postMessage(new StartProtocolMessage(handler));
    }

    public void stopProtoHandler(ProtocolHandler handler) {
        postMessage(new StopProtocolMessage(handler));
    }

    public interface ThreadMessage {
        void execute();
    }

    public interface ProtocolHandler {
        void onStart(Selector selector) throws IOException;

        void onStop() throws IOException;

        long getNextWakeupTime();

        void processTimeouts();
    }

    public interface SelectionHandler {
        void keySelected(SelectionKey key);
    }

    private String stackTrace(Exception e) {
        StringBuilder builder = new StringBuilder();
        builder.append(e.toString()).append("\n");
        for (StackTraceElement ste : e.getStackTrace())
            builder.append(ste).append("\n");

        return builder.toString();
    }

}

