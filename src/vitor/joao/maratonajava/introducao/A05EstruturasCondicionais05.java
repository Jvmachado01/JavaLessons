package vitor.joao.maratonajava.introducao;

public class A05EstruturasCondicionais05 {
    public static void main(String[] args) {
        byte day = 2;
        // char, int, byte, short, enum, String
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Value out of range!");
        }


    }
}
