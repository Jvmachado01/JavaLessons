package vitor.joao.maratonajava.javacore.Aintroduction.Gassociacao.Gassociacao02.dominio;

public class Local {
    private String endereco;

    public Local(String endereco) {
        this.endereco = endereco;
    }

    public void imprime() {
        System.out.println("Local: " + this.endereco);
        System.out.println("---------------------------------------------------");
    }


    public String getEndereco() {
        return this.endereco;
    }


}
