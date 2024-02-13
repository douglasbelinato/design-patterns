package br.com.patterns.creational.singleton.approach02;

public final class LoggerThreadSafe {

    private static final LoggerThreadSafe instance = new LoggerThreadSafe();

    private LoggerThreadSafe(){
    }

    public static LoggerThreadSafe getInstance() {
        return instance;
    }

    public void log(String message) {
        System.out.println("Logging message " + message);
    }

}
