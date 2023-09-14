package vitor.joao.maratonajava.introducao;

public class A09ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[] myArray = {1, 2};
        int[][] arrayInt = new int[3][];

        arrayInt[0] = myArray;
        arrayInt[1] = new int[]{1, 2, 3, 4};
        arrayInt[2] = new int[6];

        String[][] frutasArray = { {"Mamão", "Pêra", "Maçã"}, {"Uva", "Amora"}, {"Banana"}};

        for (int[] arrayBase : arrayInt) {
            System.out.println("\n-------------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\n\n********************************");

        for (String[] arrayBase : frutasArray) {
            System.out.println("\n--------------------------------");
            for (String frutas : arrayBase) {
                System.out.print(frutas + " ");
            }
        }
    }

}
