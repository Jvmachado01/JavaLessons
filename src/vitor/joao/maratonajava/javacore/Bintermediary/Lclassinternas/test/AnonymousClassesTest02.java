package vitor.joao.maratonajava.javacore.Bintermediary.Lclassinternas.test;


import vitor.joao.maratonajava.javacore.Bintermediary.Kgenerics.domain.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class BarcoNomeComparator implements Comparator<Barco> {
    @Override
    public int compare(Barco barco, Barco t1) {
        return barco.getNome().compareTo(t1.getNome());
    }
}

// Classes Internas pt 03 - Classes Anônimas
public class AnonymousClassesTest02 {
    public static void main(String[] args) {

        List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
        // new em interface só em classe anônima. Pois é criada uma subclass que implmenta a
        // interface Comparator. Após executar a class é morta, sendo útil em alguns pontos do código.
        barcoList.sort(new Comparator<Barco>() {
            @Override
            public int compare(Barco barco, Barco t1) {
                return barco.getNome().compareTo(t1.getNome());
            }
        });

        System.out.println(barcoList);
    }
}
