package vitor.joao.maratonajava.javacore.Bintermediary.Mcomportamento.test;

import vitor.joao.maratonajava.javacore.Bintermediary.Mcomportamento.domain.Car;

import java.util.ArrayList;
import java.util.List;


// Parametrizando comportamentos
public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1999), new Car("red", 2019));

    public static void main(String[] args) {
        System.out.println(filterCarByColor(cars, "green"));
        System.out.println(filterCarByColor(cars, "red"));

        System.out.println();

        System.out.println(filterAge(cars, 2015));

    }

    private static List<Car> filterCarByColor(List<Car> cars, String color) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                greenCars.add(car);
            }
        }

        return greenCars;
    }

    private static List<Car> filterAge(List<Car> cars, int year) {
        List<Car> oldCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                oldCars.add(car);
            }
        }

        return oldCars;
    }
}
