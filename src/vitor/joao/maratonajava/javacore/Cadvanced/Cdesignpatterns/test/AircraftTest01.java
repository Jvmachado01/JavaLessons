package vitor.joao.maratonajava.javacore.Cadvanced.Cdesignpatterns.test;

import vitor.joao.maratonajava.javacore.Cadvanced.Cdesignpatterns.domain.Aircraft;

public class AircraftTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat) {
        Aircraft aircraft = new Aircraft("B-29");
        System.out.println(aircraft.bookSeat(seat));
    }
}
