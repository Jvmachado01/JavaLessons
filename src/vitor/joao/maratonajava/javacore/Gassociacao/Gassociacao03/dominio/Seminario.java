package vitor.joao.maratonajava.javacore.Gassociacao.Gassociacao03.dominio;

public class Seminario {
    private String titulo;
    // O seminário pode ter UM ou VÁRIOS alunos
    private Aluno[] alunos;
    // O seminário deve ter UM local
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    // Overload of constructor 1
    public Seminario(String titulo, Aluno[] alunos) {
        this.titulo = titulo;
        this.alunos = alunos;
    }

    // Overload of constructor 2
    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return this.alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return this.local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
