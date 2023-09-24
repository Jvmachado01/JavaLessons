package vitor.joao.maratonajava.javacore.Aintroduction.Jmodificadorfinal.test;

import vitor.joao.maratonajava.javacore.Aintroduction.Jmodificadorfinal.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
    }

}
