package vitor.joao.maratonajava.introducao;

public class A06EstruturaRepeticao05 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
        // Condição é que o valorParcela >= 1000
        double valorTotal = 42000;
        for (int i = (int) valorTotal; i >= 1; i--) {
            double valorParcela = valorTotal / i;
            if (valorParcela < 1000) {
                continue;
            }

            System.out.println("Parcela: " + i + " R$ " + valorParcela);
        }
    }

}
