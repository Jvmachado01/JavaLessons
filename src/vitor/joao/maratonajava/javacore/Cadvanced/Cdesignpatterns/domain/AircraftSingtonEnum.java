package vitor.joao.maratonajava.javacore.Cadvanced.Cdesignpatterns.domain;

import java.util.HashSet;
import java.util.Set;

public enum AircraftSingtonEnum {
    INSTANCE;
    private final Set<String> availableSeats;

    AircraftSingtonEnum() {
        this.availableSeats = new HashSet<>();
        this.availableSeats.add("1A");
        this.availableSeats.add("1B");
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}
