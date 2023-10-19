package vitor.joao.maratonajava.javacore.Cadvanced.Fjunit.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Pattern Matching for instanceof
class EmployeeTest {

    @Test
    public void instanceOf_ExecutesChildClassMethod_WhenObjectIsOfChildType() {
         Employee employeeDeveloper = new Developer("1", "Java");

         // Usando casting
         if (employeeDeveloper instanceof Developer) {
             Developer developer = (Developer)  employeeDeveloper;
             Assertions.assertEquals("Java", developer.getMainLanguage());
         }

         // Usando  Pattern Matching for instanceof
        // Se a condição for true, já retorna o objeto developer 'castigado'
        if (employeeDeveloper instanceof Developer developer) {
            Assertions.assertEquals("Java", developer.getMainLanguage());
        }
    }

}