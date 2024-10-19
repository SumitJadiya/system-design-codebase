package com.sumit.coding.design_patterns.creational.singleton.app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    private static Logger instance;

    private Logger() {
    }

    public static Logger getLoggerInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null)
                    instance = new Logger();
            }
        }
        return instance;
    }

    public void log(String message) {
        String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String logMessage = timeStamp + " - " + message;

        System.out.println(logMessage);
    }

    public static void main(String[] args) {
        // Step 1: Get the logger instance
        Logger appOne = Logger.getLoggerInstance();

        // Step 2: Log some messages
        appOne.log("Application started");
        appOne.log("User logged in");
        appOne.log("Error occurred while fetching data");

        // Step 1: Get the logger instance
        Logger appTwo = Logger.getLoggerInstance();

        // Step 2: Log some messages
        appTwo.log("Application started");
        appTwo.log("User logged in");
        appTwo.log("Error occurred while fetching data");

        System.out.println(appOne.hashCode() == appTwo.hashCode());
    }
}
