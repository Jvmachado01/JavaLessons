package vitor.joao.maratonajava.javacore.Hheranca.domain;

public class Funcionario extends Pessoa {

    private double salario;

    public Funcionario(String nome) {
        super(nome);
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
