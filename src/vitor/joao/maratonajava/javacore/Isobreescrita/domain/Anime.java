package vitor.joao.maratonajava.javacore.Isobreescrita.domain;

public class Anime {
    private String nome;

    // Regras da sobreescrita
    // 1 - O nome do método deve ser o mesmo
    // 2 - A quantidade de parâmetros as mesmas
    // 3 - O tipo de retorno deve ser a classe ou a subclasse (ex. String).
    // 4 - Modificador de acesso não pode ser mais restritivo que o original
    @Override // Para certeza absoluta de que o método está sendo sobreescrito
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
