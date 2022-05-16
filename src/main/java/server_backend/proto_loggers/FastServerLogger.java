package server_backend.proto_loggers;


import com.google.protobuf.Message;

import server_backend.servers.ProtoServer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.SocketAddress;
import java.text.SimpleDateFormat;
import java.util.Date;


public class FastServerLogger implements ProtoServer.LogFactory {

    static class LogRequest {
        public LogRequest next;
    }

    static class OpenLogRequest extends LogRequest {
        public LogFile file;

        OpenLogRequest(LogFile file) {
            this.file = file;
        }
    }

    static class CloseLogRequest extends LogRequest {
        public LogFile file;

        CloseLogRequest(LogFile file) {
            this.file = file;
        }
    }

    static class WriteLineRequest extends LogRequest {
        public LogFile file;
        public long time;
        public String text;

        WriteLineRequest(LogFile file, String text) {
            this.time = System.currentTimeMillis();
            this.file = file;
            this.text = text;
        }
    }

    static class WriteMessageRequest extends LogRequest {
        public LogFile file;
        public long time;
        public LogType type;
        public Message message;
        public int commandId;

        WriteMessageRequest(LogFile file, LogType type, Message message, int commandId) {
            this.time = System.currentTimeMillis();
            this.file = file;
            this.type = type;
            this.message = message;
            this.commandId = commandId;
        }

        @Override
        public String toString() {
            return "WriteMessageRequest{" + "\n" +
                    "file=" + file.getFileName() + "\n" +
                    ", time=" + time + "\n" +
                    ", type=" + type + "\n" +
                    ", message=" + message + "\n" +
                    ", commandId=" + commandId + "\n" +
                    '}';
        }

    }

    class LogFile implements ProtoServer.LogWriter {
        private String fileName;
        private BufferedWriter writer;
        private boolean isAlive = true;


        LogFile(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void writeLine(String line) {
            if (isAlive) {
                enqueueRequest(new WriteLineRequest(this, line));
            }
        }

        @Override
        public void writeMessage(LogType type, Message message, int commandID) {
            if (isAlive) {
                enqueueRequest(new WriteMessageRequest(this, type, message, commandID));
            }
        }

        @Override
        public void close() {
            disableLog();
            enqueueRequest(new CloseLogRequest(this));
        }

        String getFileName() {
            return fileName;
        }

        void internalOpen() throws IOException {
            writer = new BufferedWriter(new FileWriter(new File(logDirectory, fileName), true));
        }

        void internalClose() throws IOException {
            isAlive = false;
            if (writer != null) {
                writer.close();
                writer = null;
            }
        }

        private void disableLog() {
            isAlive = false;
        }

        private void writeLineToFile(long time, String text) throws IOException {
            if (writer != null) {
                writer.write(logEventTimeFormat.format(new Date(time)));
                writer.write(text);
                writer.newLine();
            }
        }

        private void writeLineToFile(String text) throws IOException {
            if (writer != null) {
                writer.write(text);
                writer.newLine();
                writer.flush();
            }
        }

        private void internalWrite(String text) {
            try {
                writeLineToFile(System.currentTimeMillis(), text);
            } catch (IOException ignored) {
            }
        }

        private void flush() {
            if (writer != null) {
                try {
                    writer.flush();
                } catch (IOException ignored) {

                }
            }
        }
    }

    private Thread logThread;
    private volatile boolean running;
    private final LogFile mainLog;
    private final String rootPath;
    private File logDirectory;
    private LogRequest head;

    @SuppressWarnings("SimpleDateFormat")
    private final SimpleDateFormat logEventTimeFormat = new SimpleDateFormat("HH:mm:ss.SSS ");
    @SuppressWarnings("SimpleDateFormat")
    private final SimpleDateFormat logFileNameFormat = new SimpleDateFormat("HHmmss-");
    @SuppressWarnings("SimpleDateFormat")
    private final SimpleDateFormat folderNameFormat = new SimpleDateFormat("yy-MM-dd_HH-mm-ss");

    private LogRequest reverse(LogRequest first) {
        LogRequest res = null;
        while (first != null) {
            LogRequest item = first;
            first = first.next;
            item.next = res;
            res = item;
        }
        return res;
    }

    private void enqueueRequest(LogRequest request) {
        synchronized (this) {
            request.next = head;
            head = request;
            notify();
        }
    }

    private void processOpenRequest(OpenLogRequest request) {
        LogFile file = request.file;
        try {
            file.internalOpen();
        } catch (Exception e) {
            file.disableLog();
            mainLog.internalWrite("ERROR: failed to create log " + file.getFileName() + ". " + e.getMessage());
        }
    }

    private void closeLog(LogFile file) {
        try {
            file.internalClose();
        } catch (Exception e) {
            mainLog.internalWrite("ERROR: failed to close log " + file.getFileName() + ". " + e.getMessage());
        }
    }

    private void processCloseRequest(CloseLogRequest request) {
        closeLog(request.file);
    }

    private void processWriteLineRequest(WriteLineRequest request) {
        LogFile file = request.file;
        if (file == null)
            return;
        try {
            file.writeLineToFile(request.time, request.text);
        } catch (IOException e) {
            mainLog.internalWrite("ERROR: write to log " + file.getFileName() + " failed. " + e.getMessage());
            closeLog(file);
        }
    }

    private ServerLoggerCallback callback;

    public void setCallback(ServerLoggerCallback callback) {
        this.callback = callback;
    }

    public interface ServerLoggerCallback {
        void postMsg(String masterIP, String msg);

        void postLogObj(int id, String ip_port, String log);
    }

    private void processWriteMessageRequest(WriteMessageRequest request, LogFormatter<Message> formatter) {

        LogFile file = request.file;
        try {
            String msg;
            if (request.message == null) {
                msg = formatter.generateLog() + request.commandId;
            } else {
                msg = formatter.generateLog(request.message) + request.commandId;
            }
            if (request.commandId != 7)
                if (request.commandId != 17)
                    if (request.commandId != 2001)


            file.writeLineToFile(msg);
            callback.postMsg(file.fileName, msg);
            if (request.commandId == 1) {
                String device_id = (request.message.toString().split("device_id:")[1].split("kit_tick")[0]).trim();
                String ip_port = file.fileName.split("-")[1].split("\\.")[0];
                System.out.println("Device id: [" + device_id + "]  ip_port: [" + ip_port + "]");
                callback.postLogObj(Integer.parseInt(device_id), ip_port, msg);
            }

        } catch (IOException e) {
            mainLog.internalWrite("ERROR: write to log " + file.getFileName() + " failed. " + e.getMessage());
            closeLog(file);
        }
    }

    private void cleanOldFiles() {
        File rootDir = new File(rootPath);
        File[] rootFolders = rootDir.listFiles();
        if (rootFolders == null)
            return;

        long delPoint = System.currentTimeMillis() - 24 * 60 * 60 * 1000L;
        for (int i = 0; i < rootFolders.length - 1; i++) {
            if (rootFolders[i].lastModified() < delPoint) {
                File[] files = rootFolders[i].listFiles();
                if (files != null) {
                    for (File file : files) {
                        file.delete();
                    }
                }
                rootFolders[i].delete();
            }
        }
    }

    private void prepareFolder() throws IOException {
        try {
            File rootDir = new File(rootPath);
            if (!rootDir.exists() && !rootDir.mkdirs())
                throw new IOException("Failed to create root folder " + rootPath);
            cleanOldFiles();
            Date startDate = new Date(System.currentTimeMillis());
            String folderName = folderNameFormat.format(startDate);
            logDirectory = new File(rootDir, folderName);


            if (!logDirectory.exists() && !logDirectory.mkdirs())
                throw new IOException("Failed to create log folder");

            mainLog.internalOpen();
        } catch (IOException e) {
            mainLog.disableLog();
            throw e;
        }
    }

    public FastServerLogger(String path) {
        rootPath = path;
        running = false;
        mainLog = new LogFile("MainLog.txt");
        start();
    }

    public void start() {
        if (running) {
            stop();
            try {
                logThread.join(5000);
            } catch (InterruptedException ignored) {
            }
        }
        mainLog.isAlive = true;
        running = true;
        logThread = new Thread(() -> {
            try {
                prepareFolder();
                while (true) {
                    LogRequest request;
                    synchronized (FastServerLogger.this) {
                        while (head == null) {
                            FastServerLogger.this.wait();
                        }
                        request = head;
                        head = null;
                    }
                    request = reverse(request);
                    while (request != null) {
                        if (request instanceof WriteLineRequest) {
                            processWriteLineRequest((WriteLineRequest) request);
                        } else if (request instanceof WriteMessageRequest) {
                            processWriteMessageRequest((WriteMessageRequest) request, new ProtoBuffFormatter<>(((WriteMessageRequest) request).type));
                        } else if (request instanceof OpenLogRequest) {
                            processOpenRequest((OpenLogRequest) request);
                        } else if (request instanceof CloseLogRequest) {
                            processCloseRequest((CloseLogRequest) request);
                        } else
                            break;
                        request = request.next;
                    }
                    mainLog.flush();
                }
            } catch (Exception e) {
                mainLog.internalWrite("ERROR: logger thread exits with exception " + e.getMessage());
            }

            running = false;
            closeLog(mainLog);
        });
        logThread.start();
    }

    public void stop() {
        mainLog.writeLine("Log thread stop requested");
        running = false;
        enqueueRequest(new LogRequest());
    }

    private String addressToFileName(SocketAddress address) {
        String res = address.toString();
        res = res.replaceAll("[^0-9\\.:]", "");
        res = res.replaceAll("[\\.:]", "_");
        return res;
    }

    public ProtoServer.LogWriter openConnectionLog(SocketAddress address) {
        long now = System.currentTimeMillis();
        String fileName = logFileNameFormat.format(new Date(now)) + addressToFileName(address) + ".txt";
        LogFile log = new LogFile(fileName);
        if (running)
            enqueueRequest(new OpenLogRequest(log));
        else
            log.disableLog();
        return log;
    }

    @Override
    public ProtoServer.LogWriter getMainLog() {
        return mainLog;
    }
}

