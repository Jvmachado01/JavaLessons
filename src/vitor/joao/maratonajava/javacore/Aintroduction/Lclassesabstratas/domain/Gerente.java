package vitor.joao.maratonajava.javacore.Aintroduction.Lclassesabstratas.domain;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public void imprime() {
        System.out.println("Imprimindo.... override em Gerente");
    }


    public void calculaBonus() {
        this.salario = this.salario + this.salario * 0.1;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
