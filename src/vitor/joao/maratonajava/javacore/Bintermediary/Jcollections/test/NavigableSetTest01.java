package vitor.joao.maratonajava.javacore.Bintermediary.Jcollections.test;

import vitor.joao.maratonajava.javacore.Bintermediary.Jcollections.domain.Filme;
import vitor.joao.maratonajava.javacore.Bintermediary.Jcollections.domain.Smartphone;

import java.util.*;

// Posso criar quantas classes eu quiser dentro do mesmo arquivo, desde que apenas
// um seja public e que tenha o mesmo nome no arquivo e na classe.
class SmartphoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone smartphone, Smartphone t1) {
        return smartphone.getMarca().compareTo(t1.getMarca());
    }
}

class FilmePrecoComparator implements  Comparator<Filme> {

    @Override
    public int compare(Filme filme, Filme t1) {
        return Double.compare(filme.getPreco(), t1.getPreco());
    }
}

// Coleções pt 17 - NavigableSet, TreeSet pt 02
public class NavigableSetTest01 {
    public static void main(String[] args) {

        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        System.out.println(set);

        /*
         Quando usar o TreeSet? Quando a classe que estou criando a coleção implementa
         a interface Comparable, ou caso não tenha Comparable, ter certeza absoluta
         que estamos criando uma classe que implementa a interface Comparator( no caso
         SmartphoneMarcaComparator, e que é passada como argumento para instanciar o
         objeto TreeSet, vide linha 20).

         Todas as vezes que inserirmos uma elemento, o TreeSet vai reordenar a coleção
         baseado no valor do método comparteTo() na classe que está implementando
         Comparable (no caso class Filme), ou no método compare() da class que implementou
         Comparator.

         Nota: TreeSet também não aceita elementos duplicados porque também implementa a
         interface Set.

         P.S: TreeSet falha em obedecer o contrato da interface Set. Quer dizer que set
         não utiliza o equals() para verificar se dois elementos são iguais.
         A class TreeSet se baseia no método compareTo() ou no Comparator que eu passo
         quando estou criando o TreeSet. Isso significa que mesmo eu tendo o equals(),
         eu posso ter elementos duplicados.
         Exemplo: equals() dentro da class Filme leva em consideração o id e o nome, isto é,
         dois objetos são iguais se o id e o nome forem iguais.
         Porém TreeSet usa o compareTo(), no qual está verificando o nome.
         Fica evidente, então, que se eu adicionar o mesmo item, mas trocando apenas o id,
         o que de acordo com o equals será elemento diferente, o item não será incluído,
         visto que TreeSet vai usar o compareTo(), e este verifica o nome.
        */
        NavigableSet<Filme> filmes = new TreeSet<>(new FilmePrecoComparator());
        filmes.add(new Filme(5L, "The Godfather", 19.9, 0));
        filmes.add(new Filme(3L, "Scarface", 9, 5));
        filmes.add(new Filme(4L, "Casino", 3.2, 0));
        filmes.add(new Filme(1L, "Pulp Fiction", 11.20, 2));
        filmes.add(new Filme(2L, "The Rescue of Private Ryan", 2.99, 0));

        for (Filme filme : filmes) {
            System.out.println(filme);
        }

        // descendingSet() exibe em ordem alfabética inversa
        System.out.println(filmes.descendingSet());

        // A class FilmePrecoComparator() foi passada como argumento para o
        // TreeSet, então agora a comparação é dada pelo preço.



        Filme theIrishman = new Filme(8L, "The Irishman", 8, 5);
        // lower <  traz o menor valor antes da referência que passei
        // floor <= traz o menor valor consdierando o valor de referência que passei
        // higher > traz o maior valor depois da referência que passei
        // ceiling >= traz o maior valor consdierando o valor de referência que passei
        System.out.println();
        System.out.println(filmes.lower(theIrishman));
        System.out.println(filmes.floor(theIrishman));
        System.out.println(filmes.higher(theIrishman));
        System.out.println(filmes.ceiling(theIrishman));

        // Retirar elementos da lista um por um.
        System.out.println(filmes.size());
        System.out.println(filmes.pollFirst());
        System.out.println(filmes.pollLast());
        System.out.println(filmes.size());

    }
}
