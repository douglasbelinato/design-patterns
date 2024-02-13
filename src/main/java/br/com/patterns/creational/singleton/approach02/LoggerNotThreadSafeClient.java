package br.com.patterns.creational.singleton.approach02;

import br.com.patterns.creational.singleton.approach01.Logger;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public final class LoggerNotThreadSafeClient {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        var task1 = process(1, 5);
        var task2 = process(2, 2);

        task1.get();
        task2.get();
    }

    private static CompletableFuture<Void> process(int processId, int secondsToSleep) {
        return CompletableFuture.runAsync(() -> {
            System.out.println("Starting process " + processId);

            var loggerThreadSafeInstance = Logger.getInstance();

            System.out.println("loggerThreadSafeInstance instance id: " + loggerThreadSafeInstance);
            loggerThreadSafeInstance.log("Loggin process id " + processId);

            try {
                TimeUnit.SECONDS.sleep(secondsToSleep);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Finished process " + processId);
        });
    }

}
