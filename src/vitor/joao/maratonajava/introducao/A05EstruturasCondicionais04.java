package vitor.joao.maratonajava.introducao;

public class A05EstruturasCondicionais04 {
    public static void main(String[] args) {

//        float salarioAnual = -1F;
//        float taxesLevelOne = 37149F;
//        float taxesLevelTwo = 73031F;
//
//        if (salarioAnual < 0 ) {
//            System.out.println("Não há taxa a ser cobrada");
//        } else if (salarioAnual >= 0 && salarioAnual < taxesLevelOne) {
//            System.out.println("Taxa imposto: 9.28");
//        } else if (salarioAnual >= taxesLevelOne && salarioAnual <= taxesLevelTwo) {
//            System.out.println("Taxa imposto: 36.93");
//        } else {
//            System.out.println("Taxa imposto: 49.50");
//        }

        double salarioAnual = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFAixa = 49.50 / 100;
        double valorImposto;

        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorImposto = salarioAnual * segundaFaixa;
        } else {
            valorImposto = salarioAnual * terceiraFAixa;
        }
        System.out.println(valorImposto);

    }


}
