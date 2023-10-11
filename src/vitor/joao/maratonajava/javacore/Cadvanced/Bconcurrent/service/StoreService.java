package vitor.joao.maratonajava.javacore.Cadvanced.Bconcurrent.service;

import java.util.concurrent.*;

public class StoreService {
    // Basicamente vai criar threads conforme necessário e vai reutilizar as threads
    // quando elas tiverem disponíveis.
    private static final ExecutorService ex = Executors.newCachedThreadPool();

    public double getPriceSync(String storeName) {
        System.out.printf("Getting prices sync for store %s%n", storeName);
        return priceGenerator();
    }

    public Future<Double> getPriceAsyncFuture(String storeName) {
        System.out.printf("Getting prices sync for store %s%n", storeName);
        return ex.submit(this::priceGenerator);
    }

    public CompletableFuture<Double> getPricesAsyncCompletableFuture(String storeName) {
        System.out.printf("Getting prices sync for store %s%n", storeName);

        /*
           No CompletableFuture não precisamos mais do Executors, pois ele tem um método
           chamado supplyAsync() onde ele recebe um argumento supplier e retornamos ele.
           Não estamos usando Executors, mas por trás é usado o ForkJoinPool.commonPool() para
           criar as threads.
        */
        return CompletableFuture.supplyAsync(this::priceGenerator);

    }

    private void delay() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private double priceGenerator() {
        System.out.printf("%s generating price %n", Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    public static void shutdown() {
        ex.shutdown();
    }
}
