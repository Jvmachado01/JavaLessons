package vitor.joao.maratonajava.javacore.Aintroduction.Jmodificadorfinal.domain;

public class Comprador {
    private String nome;

    @Override
    public String toString() {
        return "Comprador{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
