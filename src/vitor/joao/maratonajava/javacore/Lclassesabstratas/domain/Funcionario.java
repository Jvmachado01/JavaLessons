package vitor.joao.maratonajava.javacore.Lclassesabstratas.domain;

/*

A funcionaliade da classe abstrata é ser estendida; não pode ser instanciada.
classe abstrata não pode usar o modificador final, porque o final não permite que a classe seja
estendida (final é usado quando queremos, por exemplo, apenas uma instância da classe,
tipo classe de conexão de DB onde queremos apenas uma instância para todos que a solicitar)

 */
public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

// A regra: se tiver uma classe abstrada estendendo outra classe abstrata
// Ela não é obrigada a implementar os métodos; ficando só obrigado as classes concretas a
// implmentarem todos os métodos de ambas as classes abstratas.
// Mas se eu desejar implementar o método abstrato imprime da classe abstrata Pessoa
    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }

    public abstract void calculaBonus();

    // Em classes abastratas eu posso ter métodos abastrador e não abstratos
    // Porém não vou poder ter métodos abastratos em uma classe concreta.
    // Métodos abastratos só podem existir dentro de classes abstratas.
    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
