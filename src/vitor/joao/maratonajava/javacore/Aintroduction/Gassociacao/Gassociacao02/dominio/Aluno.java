package vitor.joao.maratonajava.javacore.Aintroduction.Gassociacao.Gassociacao02.dominio;

public class Aluno {
    private String nome;
    private int idade;
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprime() {
        System.out.println("Aluno: " + this.nome);
        System.out.println("---------------------------------------------------");
    }


    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }





}

