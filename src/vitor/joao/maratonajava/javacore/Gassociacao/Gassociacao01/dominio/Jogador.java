package vitor.joao.maratonajava.javacore.Gassociacao.Gassociacao01.dominio;

public class Jogador {
    private String nome;
    private Time time;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println(this.nome);
        if (this.time != null) {
            System.out.println(this.time.getNome());
        }

    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Time getTime() {
        return this.time;
    }


}
