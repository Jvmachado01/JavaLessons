package vitor.joao.maratonajava.javacore.Jmodificadorfinal.domain;

public class Carro {
    private String nome;
    public static final int CAPACIDADE_ARENA_CARROS= 20;
    public static final double VELOCIDADE_LIMITE;
    public final double CAPACIDADE_ASSENTOS_MAXIMO;
    // Para a constante COMPRADOR teremos apenas uma referência para o objeto criado pela
    // instância de new Comprador(), mas os atributos do objeto COMPRADOR poderá ser definido.
    public final Comprador COMPRADOR = new Comprador();

    static {
        // Foi possível inicializar a constante porque o bloco de inicialização
        // sempre será executado! Independente da inicialização ser feita após a declaração
        // da constante.
        VELOCIDADE_LIMITE = 250;
    }

    public Carro() {
        // O importante é antes de usar a constante é termos ela com o valor.
        CAPACIDADE_ASSENTOS_MAXIMO = 8;
    }

    // Esse com modificador final nunca poderá ser sobreescrito em subclasses
    public final void imprime() {
        System.out.println(this.nome);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
