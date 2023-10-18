package vitor.joao.maratonajava.javacore.Cadvanced.Djdbc.test;

import vitor.joao.maratonajava.javacore.Cadvanced.Djdbc.domain.Producer;
import vitor.joao.maratonajava.javacore.Cadvanced.Djdbc.service.ProducerService;

import java.sql.SQLException;
import java.util.List;

public class ConnectionFactoryTest03 {
    public static void main(String[] args) {
        Producer producer = Producer.ProducerBuilder.builder().name("Toei Animation").build();
        Producer producer1 = Producer.ProducerBuilder.builder().name("White Fox").build();
        Producer producer2 = Producer.ProducerBuilder.builder().name("Studio Ghibli").build();

        ProducerService.saveTransaction(List.of(producer, producer1, producer2));
    }
}
