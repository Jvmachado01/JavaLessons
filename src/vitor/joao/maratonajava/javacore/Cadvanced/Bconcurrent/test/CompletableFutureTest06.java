package vitor.joao.maratonajava.javacore.Cadvanced.Bconcurrent.test;


import vitor.joao.maratonajava.javacore.Cadvanced.Bconcurrent.domain.Quote;
import vitor.joao.maratonajava.javacore.Cadvanced.Bconcurrent.service.StoreServiceWithDiscount;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

// Concorrência pt 17 - CompletableFuture pt 06 - allOf, anyOf
public class CompletableFutureTest06 {
    public static void main(String[] args) {
        StoreServiceWithDiscount service = new StoreServiceWithDiscount();
        searchPricesWithDiscountAsync(service);
    }

    private static void searchPricesWithDiscountAsync(StoreServiceWithDiscount service) {
        long start = System.currentTimeMillis();

        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4", "Store 5", "Store 6", "Store 7", "Store 8");

        var completableFutures = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> service.getPriceSync(s)))
                .map(cf -> cf.thenApply(Quote::newQuote))
                .map(cf -> cf.thenCompose(quote -> CompletableFuture.supplyAsync(() -> service.applyDiscount(quote))))
                .map(cf -> cf.thenAccept(store -> System.out.printf("%s finished in %d%n", store, (System.currentTimeMillis() - start))))
                .collect(Collectors.toList())
                .toArray(CompletableFuture[]::new);

//        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(completableFutures);
        CompletableFuture<Object> voidCompletableFuture = CompletableFuture.anyOf(completableFutures);
        voidCompletableFuture.join();
        System.out.printf("Finished? %b%n", voidCompletableFuture.isDone());

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesAsyncCompletableFuture %dms%n", (end - start));
    }
}
