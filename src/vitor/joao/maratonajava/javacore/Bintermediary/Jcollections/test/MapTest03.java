package vitor.joao.maratonajava.javacore.Bintermediary.Jcollections.test;

import vitor.joao.maratonajava.javacore.Bintermediary.Jcollections.domain.Consumidor;
import vitor.joao.maratonajava.javacore.Bintermediary.Jcollections.domain.Filme;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Coleções pt 19 - Map, HashMap, LinkedHashMap pt 02
public class MapTest03 {
    public static void main(String[] args) {

        // Criar um Map que vai armazenar o consumidor e varios filmes que o consumidor comprou:

        Consumidor consumidor = new Consumidor("Figueiredo");
        Consumidor consumidor1 = new Consumidor("Médici");

        Filme theGodfather = new Filme(5L, "The Godfather", 19.9);
        Filme scarface = new Filme(3L, "Scarface", 9);
        Filme casino = new Filme(4L, "Casino", 3.2);
        Filme pulpFiction = new Filme(1L, "Pulp Fiction", 11.20);
        Filme theRescueOfPrivateRyan = new Filme(2L, "The Rescue of Private Ryan", 2.99);

        List<Filme> filmeConsumidor = List.of(scarface, casino, pulpFiction);
        List<Filme> filmeConsumidor1 = List.of(theRescueOfPrivateRyan, theGodfather);
        Map<Consumidor, List<Filme>> consumidorFilmeMap = new HashMap<>();
        consumidorFilmeMap.put(consumidor, filmeConsumidor);
        consumidorFilmeMap.put(consumidor1, filmeConsumidor1);

        for (Map.Entry<Consumidor, List<Filme>> entry : consumidorFilmeMap.entrySet()) {
            System.out.println(entry.getKey().getNome());
            for (Filme filme : entry.getValue()) {
                System.out.println("------------> " + filme.getNome());
            }
        }


    }
}
