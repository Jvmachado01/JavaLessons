package vitor.joao.maratonajava.javacore.Cadvanced.Cdesignpatterns.test;

import vitor.joao.maratonajava.javacore.Cadvanced.Cdesignpatterns.domain.AircraftSingtonEnum;

public class AircraftSingletonEnumTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");

    }

    private static void bookSeat(String seat) {
        System.out.println(AircraftSingtonEnum.INSTANCE.hashCode());
        AircraftSingtonEnum instance = AircraftSingtonEnum.INSTANCE;
        System.out.println(instance.bookSeat(seat));
    }
}
