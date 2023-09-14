package vitor.joao.maratonajava.introducao;

public class A05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Given the values from 1 to 7, where 1 is Sunday, print if it is last day or weekend.

        byte day = 7;
        switch (day) {
            case 1:
            case 7:
                System.out.println("Weekend");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Last day");
                break;
            default:
                System.out.println("Value out of range.");
        }

    }

}
