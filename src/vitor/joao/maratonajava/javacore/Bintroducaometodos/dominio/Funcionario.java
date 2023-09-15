package vitor.joao.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

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

    public double[] getSalarios() {
        return this.salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return this.media;
    }


    public void imprime() {
        if (salarios == null) {
            return;
        }

        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double i : salarios) {
            System.out.print("Salário: " + i + " | ");
        }
    }

    public void impreMediaSalarial() {
        if (salarios == null) {
            return;
        }


        for (double i : salarios) {
            media += i;
        }
        media /= salarios.length;
        System.out.println("\nMédia salarial: " + media);

    }

}
