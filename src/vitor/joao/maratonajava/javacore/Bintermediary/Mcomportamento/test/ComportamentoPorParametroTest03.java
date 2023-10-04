package vitor.joao.maratonajava.javacore.Bintermediary.Mcomportamento.test;

import vitor.joao.maratonajava.javacore.Bintermediary.Mcomportamento.domain.Car;
import vitor.joao.maratonajava.javacore.Bintermediary.Mcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class ComportamentoPorParametroTest03 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1999), new Car("red", 2019));
    private static List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    public static void main(String[] args) {

        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green"));
        List<Car> redCars = filter(cars, car -> car.getColor().equals("red"));
        List<Car> yearBeforeCars = filter(cars, car -> car.getYear() < 2015);

        System.out.println(greenCars);
        System.out.println(redCars);
        System.out.println(yearBeforeCars);

        System.out.println();

        // Filtrar números pares da List de Integer.
        System.out.println(filter(numeros, num -> num % 2 == 0));

        // NOTA: fica demonstrado então que o método filter() recebe qualquer tipo de
        // comportamento e pra qualquer tipo de lista de forma genérica.

    }

    // private static <Type> List<Tipo de Lista que será retornado>
    // Como argumento recebe um List<não sei, será passado na infocação>,
    // Predicate<vai seguir o mesmo tipo>
    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                filteredList.add(e);
            }
        }

        return filteredList;
    }

}
