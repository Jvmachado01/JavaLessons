package vitor.joao.maratonajava.javacore.Npolimorfismo.service;

import vitor.joao.maratonajava.javacore.Npolimorfismo.domain.Computador;
import vitor.joao.maratonajava.javacore.Npolimorfismo.domain.Produto;
import vitor.joao.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if (produto instanceof Tomate) {
            // Narrowing casting:the process of conversion of higher data type to lower data type
            // Simplificando o código abaixo:
            //Tomate tomate = (Tomate) produto;
            //System.out.println("Validade: " + tomate.getDataValidade());
            String dataValidade = ((Tomate) produto).getDataValidade();
            System.out.println("Validde: " + dataValidade);
        }
    }
}
