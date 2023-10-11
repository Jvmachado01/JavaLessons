package vitor.joao.maratonajava.javacore.Cadvanced.Bconcurrent.test;

import vitor.joao.maratonajava.javacore.Cadvanced.Bconcurrent.service.StoreService;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Concorrência pt 13 - CompletableFuture pt 02 - Streams
public class CompletableFutureTest02 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
        searchPricesAsyncCompletableFuture(storeService);
    }

    private static void searchPricesAsyncCompletableFuture(StoreService storeService) {
        long start = System.currentTimeMillis();

        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");

        List<CompletableFuture<Double>> completableFutures = stores.stream()
                .map(storeService::getPricesAsyncCompletableFuture)
                .collect(Collectors.toList());

        List<Double> prices = completableFutures.stream()
                .map(CompletableFuture::join).collect(Collectors.toList());

        System.out.println(prices);

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesAsyncCompletableFuture %dms%n", (end - start));
    }
}
