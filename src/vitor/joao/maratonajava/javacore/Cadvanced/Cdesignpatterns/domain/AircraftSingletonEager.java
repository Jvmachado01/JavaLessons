package vitor.joao.maratonajava.javacore.Cadvanced.Cdesignpatterns.domain;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonEager {
    // Eager initialization
    private static final AircraftSingletonEager INSTANCE = new AircraftSingletonEager("B-17");
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    private AircraftSingletonEager(String name) {
        this.name = name;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }



    public static AircraftSingletonEager getInstance() {
        return INSTANCE;
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
    
}
