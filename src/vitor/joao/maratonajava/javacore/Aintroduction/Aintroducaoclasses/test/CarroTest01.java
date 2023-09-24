package vitor.joao.maratonajava.javacore.Aintroduction.Aintroducaoclasses.test;

import vitor.joao.maratonajava.javacore.Aintroduction.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro golf = new Carro();
        Carro opala = new Carro();
        

        golf.nome = "Golf";
        golf.modelo = "MK1";
        golf.ano = 1977;

        opala.nome = "Opala";
        opala.modelo = "SS";
        opala.ano = 1979;

        //golf = opala; // Agora golf aponta para o mesmo endereço RAM do opala

        System.out.println(golf.nome + " " + golf.modelo + " " + golf.ano);
        System.out.println(opala.nome + " " + opala.modelo + " " + opala.ano);

    }

}
