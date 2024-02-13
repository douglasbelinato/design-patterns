package br.com.patterns.creational.singleton.approach01;

public class LoggerClient {

    public static void main(String[] args) {
        var loggerA = Logger.getInstance();
        loggerA.log("Message 1");

        var loggerB = Logger.getInstance();
        loggerB.log("Message 2");

        System.out.println("LoggerA instance is " + loggerA);
        System.out.println("LoggerB instance is " + loggerB);
    }
}
