package vitor.joao.maratonajava.javacore.Aintroduction.Npolimorfismo.test;

import vitor.joao.maratonajava.javacore.Aintroduction.Npolimorfismo.domain.Computador;
import vitor.joao.maratonajava.javacore.Aintroduction.Npolimorfismo.domain.Televisao;
import vitor.joao.maratonajava.javacore.Aintroduction.Npolimorfismo.domain.Tomate;
import vitor.joao.maratonajava.javacore.Aintroduction.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        Televisao tv = new Televisao("Samsung 50\"", 5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("----------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------------------------");
        CalculadoraImposto.calcularImposto(tv);


    }
}
