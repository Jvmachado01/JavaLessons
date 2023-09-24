package vitor.joao.maratonajava.javacore.Aintroduction.Gassociacao.Gassociacao02.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void imprime() {
        if (seminarios == null) return;
        for (Seminario seminario : seminarios) {
            System.out.println("Seminários: " + seminario.getTitulo());
        }
        System.out.println("---------------------------------------------------");
    }


    public String getNome() {
        return this.nome;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }


}
