package vitor.joao.maratonajava.introducao;

public class A07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e dlouble: inicialização padrão 0
        // char '\u0000' inicialização padrão  com ' '
        // boolean inicialização padrão false
        // String inicialização padrão null

        String[] nomes = new String[3];
        nomes[0] = "Lemmy";
        nomes[1] = "Ringo";
        nomes[2] = "Keith";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
