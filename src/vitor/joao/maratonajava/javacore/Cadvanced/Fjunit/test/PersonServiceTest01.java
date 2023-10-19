package vitor.joao.maratonajava.javacore.Cadvanced.Fjunit.test;

import vitor.joao.maratonajava.javacore.Cadvanced.Fjunit.domain.Person;
import vitor.joao.maratonajava.javacore.Cadvanced.Fjunit.service.PersonService;

public class PersonServiceTest01 {
    public static void main(String[] args) {
        Person person = new Person(15);
        PersonService personService = new PersonService();
        boolean adult = personService.isAdult(person);
        System.out.println("isAdult: " + adult);
    }
}
