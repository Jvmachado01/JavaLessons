package vitor.joao.maratonajava.javacore.Cadvanced.Djdbc.test;

import vitor.joao.maratonajava.javacore.Cadvanced.Djdbc.conn.ConnectionFactory;
import vitor.joao.maratonajava.javacore.Cadvanced.Djdbc.domain.Producer;
import vitor.joao.maratonajava.javacore.Cadvanced.Djdbc.repository.ProducerRepository;
import vitor.joao.maratonajava.javacore.Cadvanced.Djdbc.service.ProducerService;

import java.sql.SQLException;
import java.util.List;

public class ConnectionFactoryTest01 {
    public static void main(String[] args) throws SQLException {
        Producer producer = Producer.ProducerBuilder.builder().name("Studio Deen").build();
        Producer producerToUpdate = Producer.ProducerBuilder.builder().id(1).name("madhouse").build();

//        ProducerService.save(producer);
//    ProducerService.delete(2);
//    ProducerService.update(producerToUpdate);

//        List<Producer> producers = ProducerService.findAll();
//        System.out.println(producers);

//        List<Producer> producers = ProducerService.findByName("H");
//        System.out.println(producers);

//        ProducerService.showProducerMetaData();
//        ProducerService.showDriverMetaData();
//        ProducerService.showTypeScrollWorking();

//        List<Producer> deen = ProducerService.findByNameAndUpdateToUpperCase("Deen");
//        System.out.println(deen);
//        List<Producer> bones = ProducerService.findByNameAndInsertWhenNotFound("A-1 pictures");
//        System.out.println(bones);

//        ProducerService.findByNameAndDelete("A-1 pictures");


//        List<Producer> bones = ProducerService.findByNamePreparedStatement("B or X'='X"); // sql ejection
//        List<Producer> bones = ProducerService.findByNamePreparedStatement("B");
//        System.out.println(bones);

//        ProducerService.updatePreparedStatement(producerToUpdate);

        List<Producer> producers = ProducerService.findByNameCallableStatement("NHK");
        System.out.println(producers);
    }

}
