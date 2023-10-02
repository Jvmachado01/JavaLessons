package vitor.joao.maratonajava.javacore.Bintermediary.Jcollections.test;

import vitor.joao.maratonajava.javacore.Bintermediary.Jcollections.domain.Consumidor;
import vitor.joao.maratonajava.javacore.Bintermediary.Jcollections.domain.Filme;

import java.util.HashMap;
import java.util.Map;

// Coleções pt 19 - Map, HashMap, LinkedHashMap pt 02
public class MapTest02 {
    public static void main(String[] args) {

        // Criar um Map que vai armazenar o consumidor e o filme que o consumidor comprou:

        Consumidor consumidor = new Consumidor("Figueiredo");
        Consumidor consumidor1 = new Consumidor("Médici");

        Filme theGodfather = new Filme(5L, "The Godfather", 19.9);
        Filme scarface = new Filme(3L, "Scarface", 9);
        Filme casino = new Filme(4L, "Casino", 3.2);
        Filme pulpFiction = new Filme(1L, "Pulp Fiction", 11.20);
        Filme theRescueOfPrivateRyan = new Filme(2L, "The Rescue of Private Ryan", 2.99);

        // Associar consumidor como chave e o filme como valor
        Map<Consumidor, Filme> consumidorFilme = new HashMap<>();
        consumidorFilme.put(consumidor, scarface);
        consumidorFilme.put(consumidor1, theGodfather);

        // Exibe pelo toString()
        for (Map.Entry<Consumidor, Filme> entry : consumidorFilme.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // Exibe só o nome do consumidor e o nome do filme
        for (Map.Entry<Consumidor, Filme> entry : consumidorFilme.entrySet()) {
            System.out.println(entry.getKey().getNome() + ": " + entry.getValue().getNome());
        }


    }
}
