package vitor.joao.maratonajava.javacore.Kenum.domain;

// enum é um tipo especial de classe!
public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"), // PESSOA_FISICA é do tipo TipoCliente
    PESSOA_JURIDICA(2, "Pessoa Jurídica"); // PESSOA_JURIDICA é do tipo TipoCliente

    public final int VALOR;
    public final String NOME_RELATORIO;

    // O construtor é private; quem chama o construtor é a enumeração!
    TipoCliente(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.NOME_RELATORIO = nomeRelatorio;
    }

    // Método para buscar o enum com base na variável String nomeRelatorio
    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNOME_RELATORIO().equals(nomeRelatorio)) {
                return tipoCliente;
            }

        }
        return null;
    }


    public String getNOME_RELATORIO() {
        return NOME_RELATORIO;
    }
}
