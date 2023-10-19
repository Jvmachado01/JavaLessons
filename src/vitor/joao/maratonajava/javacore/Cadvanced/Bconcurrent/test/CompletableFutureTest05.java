package vitor.joao.maratonajava.javacore.Cadvanced.Bconcurrent.test;


import vitor.joao.maratonajava.javacore.Cadvanced.Bconcurrent.domain.Quote;
import vitor.joao.maratonajava.javacore.Cadvanced.Bconcurrent.service.StoreServiceWithDiscount;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

// Concorrência pt 16 - CompletableFuture pt 05 - Encadeando chamadas pt 02
public class CompletableFutureTest05 {
    public static void main(String[] args) {
        StoreServiceWithDiscount service = new StoreServiceWithDiscount();
        searchPricesWithDiscountAsync(service);
    }

    private static void searchPricesWithDiscount(StoreServiceWithDiscount service) {
        long start = System.currentTimeMillis();

        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
        stores.stream()
                .map(service::getPriceSync)
                .map(Quote::newQuote)
                .map(service::applyDiscount)
                .forEach(System.out::println);

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesAsyncCompletableFuture %dms%n", (end - start));
    }

    private static void searchPricesWithDiscountAsync(StoreServiceWithDiscount service) {
        long start = System.currentTimeMillis();

        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4", "Store 5", "Store 6", "Store 7", "Store 8");

        List<CompletableFuture<String>> completableFutures = stores.stream()
                // Getting the price async storeNome:price:discountCode
                .map(s -> CompletableFuture.supplyAsync(() -> service.getPriceSync(s)))
                // Instantiating a new Quote from the string generated by getPriceSync
                .map(cf -> cf.thenApply(Quote::newQuote))
                // Composing the firest completable future
                .map(cf -> cf.thenCompose(quote -> CompletableFuture.supplyAsync(() -> service.applyDiscount(quote))))
                .collect(Collectors.toList());

        completableFutures.stream()
                .map(CompletableFuture::join)
                .forEach(System.out::println);


        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesAsyncCompletableFuture %dms%n", (end - start));
    }
}