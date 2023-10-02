package vitor.joao.maratonajava.javacore.Bintermediary.Jcollections.domain;

import java.util.Objects;

// A interface Comparable que tem um método que vai saber como sorting o
// objeto dentro de coleções.
public class Filme implements Comparable<Filme> {
    // Classes que vão representa algo no mundo real, então precisamos de um id único.
    private Long id;
    private String nome;
    private double preco;
    private int quantidade;

    public Filme(Long id, String nome, double preco) {
        Objects.requireNonNull(id, "id não pode ser null");
        Objects.requireNonNull(nome, "nome não pode ser null");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    // Overload constructor
    public Filme(Long id, String nome, double preco, int quantidade) {
        this(id, nome, preco);
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Filme filme = (Filme) o;
        return Objects.equals(id, filme.id) && Objects.equals(nome, filme.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public String toString() {
        return "Filme{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // comparateTo retorna um int.
    // Temos acesso a dois objetos: o this que é o objeto que está executando o método
    // e o outro objeto que está sendo passado como argumento.
    @Override
    public int compareTo(Filme outroFilme) {
        /*  Regras:
        negativo se o this < outroFilme
        se this == outroFilme, return 0
        return positivo se this > outroFilme
        */

//        if (this.id < outroFilme.getId()) {
//            return -1;
//        } else if (this.id.equals(outroFilme.getId())) {
//            return 0;
//        } else {
//            return 1;
//        }

        // O código acima foi reduzidao para (com tipo primitivo eu não poderia usar
        // o método do Long Warraper):
        //return this.id.compareTo(outroFilme.getId());

        // Para organizar os filmes pelo preço (preço é tipo primitivo), então:
        // return Double.valueOf(preco).compareTo(outroFilme.getPreco());

        // Para os filmes por string:
        return this.nome.compareTo(outroFilme.getNome());

        // Nota: sempre que possível delegar esse trabalho para as próprias classes do Java.

    }
}
