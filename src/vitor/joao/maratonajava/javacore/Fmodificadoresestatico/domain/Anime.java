package vitor.joao.maratonajava.javacore.Fmodificadoresestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;

    /*
     *    Ordem de execução da class (até o momento! Em herença será um pouco alterado):
     *       0 - Bloco de inicialização  estático é executado quando a JVM carregar a classe
     *       1 - Alocado espaço em memória para o objeto
     *       2 - Cada atributo da classe é criado e inicializado com valores default ou o que for passado
     *       3 - Bloco de inicialização é executado
     *       4 - Construtor é executado
     *
     */

    static {
        System.out.println("Dentro do bloco de inicialização static 1. ");
        Anime.episodios = new int[100];
        for (int i = 0; i < 100; i++) {
            Anime.episodios[i] = i + 1;
        }
    }

    // O bloco static será carrega UMA vez cada e na sequência.
    static {
        System.out.println("Dentro do bloco de inicialização static 2.");
    }

    static {
        System.out.println("Dentro do bloco de inicialização static 3.");
    }

    // bloco de inicialização NÃO static vai ser executado em todas as instâncias.
    // bloco static serão executados apenas uma vez.
    {
        System.out.println("Dentro do bloco de inicialização NÃO static 4.");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int i : Anime.episodios) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return this.nome;
    }

    public int[] getEpisodios() {
        return this.episodios;
    }
}
