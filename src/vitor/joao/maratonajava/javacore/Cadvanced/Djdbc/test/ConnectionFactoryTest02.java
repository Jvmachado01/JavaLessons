package vitor.joao.maratonajava.javacore.Cadvanced.Djdbc.test;

import vitor.joao.maratonajava.javacore.Cadvanced.Djdbc.domain.Producer;
import vitor.joao.maratonajava.javacore.Cadvanced.Djdbc.repository.ProducerRepositoryRowSet;
import vitor.joao.maratonajava.javacore.Cadvanced.Djdbc.service.ProducerServiceRowSet;

import java.util.List;

public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        Producer producerToUpdate = Producer.ProducerBuilder.builder().id(1).name("Mad House").build();
//        ProducerServiceRowSet.updateJdbcRowSet(producerToUpdate);
        ProducerServiceRowSet.updateCachedRowSet(producerToUpdate);
        System.out.println("----------------------");

//        List<Producer> producers = ProducerRepositoryRowSet.findByNameJdbcRowSet("");
//        System.out.println(producers);


    }
}
