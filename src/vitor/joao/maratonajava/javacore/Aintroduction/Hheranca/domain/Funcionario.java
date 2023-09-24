package vitor.joao.maratonajava.javacore.Aintroduction.Hheranca.domain;

public class Funcionario extends Pessoa {

    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estático de Funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicialização NÃO estático de Funcionario - 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização NÃO estático de Funcionario - 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de Funcionario");
    }

    // Method overload (must have the same signature - name - of the super-class)
    public void imprime() {
        // super executes the method exactly as it is in the super-class and then executes the code we request.
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.nome + " recebi o salário de " + this.salario);
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
