package vitor.joao.maratonajava.javacore.Npolimorfismo.test;

import vitor.joao.maratonajava.javacore.Npolimorfismo.domain.Computador;
import vitor.joao.maratonajava.javacore.Npolimorfismo.domain.Produto;
import vitor.joao.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import vitor.joao.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {

        // Widening casting: The process of conversion of a lower data type to a higher data type
        Produto produto = new Computador("Ryzen 9", 3000);
        CalculadoraImposto.calcularImposto(produto);

        System.out.println("-------------------------------");

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2023");

        CalculadoraImposto.calcularImposto(tomate);
    }
}
