package vitor.joao.maratonajava.javacore.Minterfaces.domain;

// Multiplas implementações de interfaces em uma classe.
public class DatabaseLoader implements DataLoader, DataRemover {
    // Private -> Default (modificador de acesso de pacote) -> protected -> public
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados.");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados.");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados.");
    }

    // Esse método com a mesma assinatura da interface NÃO foi sobreescrito.
    public static void retrievemaxDataSize() {
        System.out.println("Dentro retrievemaxDataSize na classe DatabaseLoader.");
    }
}
