package vitor.joao.maratonajava.javacore.Hheranca.domain;

// All Java classes are daughters of the Object class
public class Pessoa {
    // protected modifier only gives access to sub-classes or classes in the same package
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    // In classes without a constructor, Java automatically adds a constructor to the code build
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf) {
        this(nome);
        this.cpf = cpf;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + " " + this.endereco.getCep());
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
