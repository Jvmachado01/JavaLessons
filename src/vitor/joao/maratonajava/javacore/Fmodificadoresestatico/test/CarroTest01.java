package vitor.joao.maratonajava.javacore.Fmodificadoresestatico.test;

import vitor.joao.maratonajava.javacore.Fmodificadoresestatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);

        // set static attribute
        Carro.setVelocidadeLimite(270);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }

   }
