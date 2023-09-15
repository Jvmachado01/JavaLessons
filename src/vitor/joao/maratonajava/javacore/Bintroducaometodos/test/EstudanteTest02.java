package vitor.joao.maratonajava.javacore.Bintroducaometodos.test;

import vitor.joao.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import vitor.joao.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Lemmy";
        estudante01.idade = 30;
        estudante01.sexo = 'M';

        estudante02.nome = "Ringo";
        estudante02.idade = 28;
        estudante02.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();
    }

}
