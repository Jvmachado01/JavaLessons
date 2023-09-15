package vitor.joao.maratonajava.javacore.Eblocoinicializacao.domain;

public class Anime {
    /*
    *    Ordem de execução da class (até o momento! Em herença será um pouco alterado):
    *       1 - Alocado espaço em memória para o objeto
    *       2 - Cada atributo da classe é criado e inicializado com valores default ou o que for passado
    *       3 - Bloco de inicialização é executado
    *       4 - Construtor é executado
    *
    */
    private String nome;
    private int[] episodios;

    // Bloco de inicialização não estático. A cada instância será executado.
    // Será executado antes do construtor.
    {
        System.out.println("Dentro do bloco de inicialização (exe antes do construtor.)");
        this.episodios = new int[100];
        for (int i = 0; i < 100; i++) {
            this.episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int i : this.episodios) {
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
