package vitor.joao.maratonajava.javacore.Cadvanced.Cdesignpatterns.domain;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonLazy {
    private static AircraftSingletonLazy INSTANCE;
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    private AircraftSingletonLazy(String name) {
        this.name = name;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    // double lock para evitar que duas threads acessem a mesma instância.
    public static AircraftSingletonLazy getInstance() {
        if (INSTANCE == null) {
            synchronized (AircraftSingletonLazy.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AircraftSingletonLazy("B-17");
                }
            }
        }
        return INSTANCE;
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }

}
