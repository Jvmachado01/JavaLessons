package vitor.joao.maratonajava.javacore.Gassociacao.test;

import vitor.joao.maratonajava.javacore.Gassociacao.dominio.Escola;
import vitor.joao.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Juscelino");
        Professor professor2 = new Professor("Carlos");
        Professor[] professores = {professor1, professor2};

        // Associação  ONE TO MANY
        Escola escola1 = new Escola("E. E. Ernesto Monte", professores);

        escola1.imprime();

    }

}
