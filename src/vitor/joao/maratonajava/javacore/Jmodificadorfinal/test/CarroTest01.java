package vitor.joao.maratonajava.javacore.Jmodificadorfinal.test;

import vitor.joao.maratonajava.javacore.Jmodificadorfinal.domain.Carro;
import vitor.joao.maratonajava.javacore.Jmodificadorfinal.domain.Comprador;
import vitor.joao.maratonajava.javacore.Jmodificadorfinal.domain.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrai = new Ferrari();
        ferrai.setNome("Enzo");
        ferrai.imprime();
    }

}
