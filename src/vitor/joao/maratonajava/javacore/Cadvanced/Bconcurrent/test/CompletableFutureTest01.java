package vitor.joao.maratonajava.javacore.Cadvanced.Bconcurrent.test;


import vitor.joao.maratonajava.javacore.Cadvanced.Bconcurrent.service.StoreService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

// Concorrência pt 12 - CompletableFuture pt 01 - get and join
public class CompletableFutureTest01 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();

//        searchPriceSync(storeService);
//        searchPricesAsyncFuture(storeService);
        searchPricesAsyncCompletableFuture(storeService);
    }

    private static void searchPriceSync(StoreService storeService) {
        long start = System.currentTimeMillis();
        System.out.println(storeService.getPriceSync("Store 1"));
        System.out.println(storeService.getPriceSync("Store 2"));
        System.out.println(storeService.getPriceSync("Store 3"));
        System.out.println(storeService.getPriceSync("Store 4"));
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync %dms%n", (end - start));
    }

    private static void searchPricesAsyncFuture(StoreService storeService) {
        long start = System.currentTimeMillis();

        Future<Double> priceAsyncFuture = storeService.getPriceAsyncFuture("Store 1");
        Future<Double> priceAsyncFuture1 = storeService.getPriceAsyncFuture("Store 2");
        Future<Double> priceAsyncFuture2 = storeService.getPriceAsyncFuture("Store 3");
        Future<Double> priceAsyncFuture3 = storeService.getPriceAsyncFuture("Store 4");

        try {
            System.out.println(priceAsyncFuture.get());
            System.out.println(priceAsyncFuture1.get());
            System.out.println(priceAsyncFuture2.get());
            System.out.println(priceAsyncFuture3.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync %dms%n", (end - start));
        StoreService.shutdown();
    }

    private static void searchPricesAsyncCompletableFuture(StoreService storeService) {
        long start = System.currentTimeMillis();

        // Como não estamos usando Executors, e sim o getPricesAsyncCompletableFuture, não
        // é necessário dar o .shutdown(), pois o supplyAsync toma conta disso agora.
        CompletableFuture<Double> priceAsyncFuture = storeService.getPricesAsyncCompletableFuture("Store 1");
        CompletableFuture<Double> priceAsyncFuture1 = storeService.getPricesAsyncCompletableFuture("Store 2");
        CompletableFuture<Double> priceAsyncFuture2 = storeService.getPricesAsyncCompletableFuture("Store 3");
        CompletableFuture<Double> priceAsyncFuture3 = storeService.getPricesAsyncCompletableFuture("Store 4");

        // CompletableFuture além do .get(), também tem o join(), o qual
        // tem a vantagem de não tratar exception, pois ele não as lança exceções do tipo CHECKED.
        System.out.println(priceAsyncFuture.join());
        System.out.println(priceAsyncFuture1.join());
        System.out.println(priceAsyncFuture2.join());
        System.out.println(priceAsyncFuture3.join());

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesAsyncCompletableFuture %dms%n", (end - start));
    }
}
