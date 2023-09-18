package vitor.joao.maratonajava.javacore.Gassociacao.Gassociacao02.test;

import vitor.joao.maratonajava.javacore.Gassociacao.Gassociacao02.dominio.Aluno;
import vitor.joao.maratonajava.javacore.Gassociacao.Gassociacao02.dominio.Local;
import vitor.joao.maratonajava.javacore.Gassociacao.Gassociacao02.dominio.Professor;
import vitor.joao.maratonajava.javacore.Gassociacao.Gassociacao02.dominio.Seminario;

// Exercicio realizado pelo João Vitor. Resolução do professor eno próximo package.

public class SeminarioTest01 {
    public static void main(String[] args) {

        Local local1 = new Local("Av. Atlântica");
        Aluno aluno1 = new Aluno("Kilmister", 30);
        Professor professor1 = new Professor("Hendrix", "Guitarrista");
        Seminario seminario1 = new Seminario("Rock and Roll");

        Aluno[] alunos = {aluno1};
        Seminario[] seminarios = {seminario1};

        seminario1.setAlunos(alunos);
        professor1.setSeminarios(seminarios);
        seminario1.setLocal(local1);
        seminario1.setProfessor(professor1);

        seminario1.imprime();
        professor1.imprime();
        local1.imprime();
        aluno1.imprime();

    }

}
