package vitor.joao.maratonajava.javacore.Gassociacao.Gassociacao02.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;

    private Professor professor;

    private Local local;


    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public void imprime() {
        System.out.println("Título seminário: " + this.titulo);
        if (this.alunos == null) return;
        for (Aluno aluno: this.alunos) {
            System.out.println("Aluno: " + aluno.getNome());
        }
        System.out.println("Professor: " + this.professor.getNome());
        System.out.println("Local: " + this.local.getEndereco());
        System.out.println("---------------------------------------------------");
    }


    public String getTitulo() {
        return this.titulo;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public void setAlunos(Aluno[] aluno) {
        this.alunos = aluno;
    }

    public Aluno[] getAlunos() {
        return this.alunos;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }



}
