package vitor.joao.maratonajava.javacore.Bintroducaometodos.test;


import vitor.joao.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import vitor.joao.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Lemmy";
        estudante01.idade = 30;
        estudante01.sexo = 'M';

        estudante02.nome = "Ringo";
        estudante02.idade = 28;
        estudante02.sexo = 'M';


        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }


}
