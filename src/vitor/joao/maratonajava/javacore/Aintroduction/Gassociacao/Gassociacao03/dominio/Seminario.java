package vitor.joao.maratonajava.javacore.Aintroduction.Gassociacao.Gassociacao03.dominio;

public class Seminario {
    private String titulo;
    // O seminário pode ter UM ou VÁRIOS alunos
    private Aluno[] alunos;
    // O seminário deve ter UM local
    private Local local;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    // Overload of constructor
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
