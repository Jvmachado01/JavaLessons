package vitor.joao.maratonajava.javacore.Bintermediary.Kgenerics.test;

import vitor.joao.maratonajava.javacore.Bintermediary.Kgenerics.domain.Barco;
import vitor.joao.maratonajava.javacore.Bintermediary.Kgenerics.domain.Carro;
import vitor.joao.maratonajava.javacore.Bintermediary.Kgenerics.service.BarcoRentavelService;
import vitor.joao.maratonajava.javacore.Bintermediary.Kgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;


public class ClasseGenericaTest03 {
    public static void main(String[] args) {

        List<Carro> carrosDisponiveis = new ArrayList<>(
                List.of(new Carro("BMW"), new Carro("Mercedes"))
        );

         List<Barco> barcosDisponiveis = new ArrayList<>(
                List.of(new Barco("Sessa Marine"), new Barco("Azimut Yachts"))
        );

        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalServiceCarro.buscarObjetoDisponivel();
        System.out.println("Usando o carro por um mês...");
        rentalServiceCarro.retornarObjetoAlugado(carro);

        System.out.println("----------------------------------------");

        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("Usando o barco por um mês...");
        rentalServiceBarco.retornarObjetoAlugado(barco);

    }
}
