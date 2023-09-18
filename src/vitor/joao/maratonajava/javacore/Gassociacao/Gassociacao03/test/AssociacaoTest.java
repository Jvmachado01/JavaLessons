package vitor.joao.maratonajava.javacore.Gassociacao.Gassociacao03.test;

import vitor.joao.maratonajava.javacore.Gassociacao.Gassociacao03.dominio.Aluno;
import vitor.joao.maratonajava.javacore.Gassociacao.Gassociacao03.dominio.Local;
import vitor.joao.maratonajava.javacore.Gassociacao.Gassociacao03.dominio.Professor;
import vitor.joao.maratonajava.javacore.Gassociacao.Gassociacao03.dominio.Seminario;

public class AssociacaoTest {
    // Resolução utilizando a lógica do instrutor.

    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("One Piece", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();


    }

}
