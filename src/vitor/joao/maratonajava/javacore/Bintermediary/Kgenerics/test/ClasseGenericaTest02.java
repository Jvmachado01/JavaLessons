package vitor.joao.maratonajava.javacore.Bintermediary.Kgenerics.test;

import vitor.joao.maratonajava.javacore.Bintermediary.Kgenerics.domain.Barco;
import vitor.joao.maratonajava.javacore.Bintermediary.Kgenerics.domain.Carro;
import vitor.joao.maratonajava.javacore.Bintermediary.Kgenerics.service.BarcoRentavelService;
import vitor.joao.maratonajava.javacore.Bintermediary.Kgenerics.service.CarroRentavelService;

// Generics pt 04 - Classes Genéricas pt 01
public class ClasseGenericaTest02 {
    public static void main(String[] args) {

        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando o barco por um mês...");
        barcoRentavelService.retornarBarcoAlugado(barco);

    }
}
