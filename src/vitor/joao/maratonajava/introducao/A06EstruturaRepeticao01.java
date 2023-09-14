package vitor.joao.maratonajava.introducao;

public class A06EstruturaRepeticao01 {
    public static void main(String[] args) {

        int count = 0;
        while (count <= 5) {
            System.out.println(count);
            count++;
        }

        int contador = 10;
        do {
            System.out.println("Dentro do do-while");
            contador++;
        } while (contador <= 3);


        for (int i = 0; i <= 4; i++) {
            System.out.println("Quero café!");
        }
    }
}
