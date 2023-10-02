package vitor.joao.maratonajava.javacore.Bintermediary.Kgenerics.test;

import vitor.joao.maratonajava.javacore.Bintermediary.Kgenerics.domain.Carro;
import vitor.joao.maratonajava.javacore.Bintermediary.Kgenerics.service.CarroRentavelService;

// Generics pt 04 - Classes Genéricas pt 01
public class ClasseGenericaTest01 {
    public static void main(String[] args) {

        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando o carro por um mês...");
        carroRentavelService.retornarCarroAlugado(carro);

    }
}
