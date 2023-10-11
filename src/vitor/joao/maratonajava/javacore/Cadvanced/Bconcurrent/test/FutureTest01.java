package vitor.joao.maratonajava.javacore.Cadvanced.Bconcurrent.test;

import java.util.concurrent.*;

// Concorrência pt 11 - Executors pt 04 - Future
public class FutureTest01 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> dollarRequest = executorService.submit(() -> {
            TimeUnit.SECONDS.sleep(5);
            return 4.35D;
        });
        System.out.println(doSometing());


        Double dollarResponse = null;
        try {
            dollarResponse = dollarRequest.get(3, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new RuntimeException(e);
        } finally {
            executorService.shutdown();
        }

        System.out.println("Dollar: " + dollarResponse);


    }

    private static long doSometing() {
        System.out.println(Thread.currentThread().getName());
        long sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }
        return sum;
    }
}
