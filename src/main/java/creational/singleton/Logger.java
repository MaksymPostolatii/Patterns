package creational.singleton;

import static java.lang.System.*;

public class Logger {
    private static Logger logger;
    private static final String LOG_INFO = "[INFO] - ";

    public static synchronized Logger getLogger() {
        if (logger == null) logger = new Logger();
        return logger;
    }

    private Logger() {
    }

    public void addLog(String log) {
        out.println(LOG_INFO + log);
    }
}
