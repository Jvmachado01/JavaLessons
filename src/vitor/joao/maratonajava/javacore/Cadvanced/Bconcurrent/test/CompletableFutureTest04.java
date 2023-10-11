package vitor.joao.maratonajava.javacore.Cadvanced.Bconcurrent.test;



import vitor.joao.maratonajava.javacore.Cadvanced.Bconcurrent.domain.Quote;
import vitor.joao.maratonajava.javacore.Cadvanced.Bconcurrent.service.StoreServiceWithDiscount;

import java.util.List;

// Concorrência pt 15 - CompletableFuture pt 04 - Encadeando chamadas pt 01
public class CompletableFutureTest04 {
    public static void main(String[] args) {
        StoreServiceWithDiscount service = new StoreServiceWithDiscount();
        searchPricesWithDiscount(service);
    }

    private static void searchPricesWithDiscount(StoreServiceWithDiscount service) {
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
//        stores.forEach(s -> System.out.println(service.getPriceSync(s)));

        stores.stream()
                .map(service::getPriceSync) // store:price:code
                .map(Quote::newQuote)
                .map(service::applyDiscount)
                .forEach(System.out::println);
    }
}
