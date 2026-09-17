package Sequifi.qa.reporting.framework;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
//import abc.xyz.esutilities.ELKIntegration;

public class Logging {
    protected static Logger log = LogManager.getLogger();
    protected static Logger debug = LogManager.getLogger("DebugLogger");
    private static String logFileDirectory;
//    private static ELKIntegration elk = new ELKIntegration;

    public Logging() {
    }

    public static void logDebug(String message) {
        debug.log(Level.DEBUG, message);
    }

    public static void logDebug(String message, Exception e) {
        StackTraceElement[] stackTraceElements = e.getStackTrace();
        logStackTraceMessage(Level.DEBUG, message, stackTraceElements);
    }

    public static Map<String, String> logDebug(String message, Map<String, String> messMap) {
        debug.log(Level.DEBUG, message);
        messMap.put("debugMessage", message);
//        elk.sendData(messMap);
        return messMap;
    }

    public static void logWarning(String message) {
        debug.log(Level.WARN, message);
    }

    public static void logWarning(String message, Exception e) {
        StackTraceElement[] stackTraceElements = e.getStackTrace();
        logStackTraceMessage(Level.WARN, message, stackTraceElements);
    }

    public static Map<String, String> logWarning(String message, Map<String, String> messMap) {
        messMap.put("warningMessage", message);
//        elk.sendData(messMap);
        return messMap;
    }

    public static void logError(String error, Exception e) {
        StackTraceElement[] stackTraceElements = e.getStackTrace();
        logStackTraceMessage(Level.ERROR, error, stackTraceElements);
    }

    public static void logError(String error) {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        logStackTraceMessage(Level.ERROR, error, stackTraceElements);
    }

    public static void logError(String error, Map<String, String> messMap) {
        messMap.put("errorMessage", error);
    }

    public static void logStackTraceMessage(Level level, String message, StackTraceElement[] stackTraceElements) {
        debug.log(level, message + "\n-------->");
        StackTraceElement[] var3 = stackTraceElements;
        int var4 = stackTraceElements.length;

        for (int var5 = 0; var5 < var4; ++var5) {
            StackTraceElement ele = var3[var5];
            debug.log(level, ele.getClassName() + " " + ele.getMethodName() + " " + ele.getLineNumber());
        }
    }

    public static void logInfo(String message) {
        debug.log(Level.DEBUG, message);
    }

    public static void logInfo(String message, Map<String, String> messMap) {
        debug.log(Level.DEBUG, message);
        messMap.put("infoMessage", message);
    }

    public static void copyLogFiles() {
        try {
            if (!getLogFileDirectory().isEmpty()) {
                File srcDir = new File((new File("")).getAbsolutePath() + "/logs");
                File destDir = new File(getLogFileDirectory());
                FileUtils.copyDirectory(srcDir, destDir);
            }
        } catch (Exception var2) {
            logError("Log Files Not Copied: ", var2);
        }
    }

    public static void copyLogFiles(String loggingDirectory) {
        try {
            File srcDir = new File((new File("")).getAbsolutePath() + "/logs");
            File destDir = new File(getLogFileDirectory());
            FileUtils.copyDirectory(srcDir, destDir);
        } catch (Exception var3) {
            logError("Log Files Not Copied: ", var3);
        }
    }

    public static String getRandomString(int length) {
        StringBuilder buildString = new StringBuilder();
        String characterSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int charLength = characterSet.length() - 1;
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < length; ++i) {
            int index = random.nextInt(charLength);
            buildString.append(characterSet.charAt(index));
        }
        return buildString.toString();
    }

    public static String getFileNameDateTimeStamp() {
        try {
            return (new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss")).format(new Date());
        } catch (Exception var1) {
            logError("Get Date Error: ", var1);
            return null;
        }
    }

    public static String getLogFileDirectory() {
        return logFileDirectory;
    }

    public static void setLogFileDirectory(String logFileDirectory) {
        Logging.logFileDirectory = logFileDirectory;
    }

}
