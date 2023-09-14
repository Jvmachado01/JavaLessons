package vitor.joao.maratonajava.introducao;

public class A06EstruturaRepeticao04 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
        // Condição é que o valorParcela >= 1000
        double valorTotal = 500;

        for (int i = 1; i <= valorTotal; i++) {
            double valorParcela = valorTotal / i;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela: " + i + " R$ " + valorParcela);
        }
    }

}
