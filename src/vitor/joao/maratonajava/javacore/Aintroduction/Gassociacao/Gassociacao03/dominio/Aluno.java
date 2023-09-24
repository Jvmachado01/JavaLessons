package vitor.joao.maratonajava.javacore.Aintroduction.Gassociacao.Gassociacao03.dominio;

public class Aluno {
    private String nome;
    private int idade;

    // O aluno só pode estar em UM seminário.
    private Seminario seminario;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

