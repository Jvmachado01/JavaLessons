package vitor.joao.maratonajava.javacore.Bintermediary.Kgenerics.test;

import vitor.joao.maratonajava.javacore.Bintermediary.Kgenerics.domain.Barco;
import vitor.joao.maratonajava.javacore.Bintermediary.Kgenerics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {

        List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Canoa Marota"));
        System.out.println(barcoList);
    }

    // Método genérico quando não há opção de colocar o tipo diretamente na declaração da classe.
    private static <T> List<T> criarArrayComUmObjeto(T t) {
        return List.of(t);
    }
}


