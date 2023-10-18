package vitor.joao.maratonajava.javacore.Cadvanced.Djdbc.service;

import vitor.joao.maratonajava.javacore.Cadvanced.Djdbc.domain.Producer;
import vitor.joao.maratonajava.javacore.Cadvanced.Djdbc.repository.ProducerRepositoryRowSet;

import java.util.List;

public class ProducerServiceRowSet {

    public static List<Producer> findByNameJdbcRowSet(String name) {
        return ProducerRepositoryRowSet.findByNameJdbcRowSet(name);
    }

    public static void updateJdbcRowSet(Producer producer) {
        ProducerRepositoryRowSet.updateJdbcRowSet(producer);
    }

    public static void updateCachedRowSet(Producer producer) {
        ProducerRepositoryRowSet.updateCachedRowSet(producer);
    }

}
