package vitor.joao.maratonajava.javacore.Bintermediary.Jcollections.test;

import vitor.joao.maratonajava.javacore.Bintermediary.Jcollections.domain.Smartphone;

// equals pt 01
public class EqualsTest01 {
    public static void main(String[] args) {

        String nome = "Lemmy Kilmister";
        String nome1 = new String("Lemmy Kilmister");
        // nome está no pool de string e nome1 está no heap.
        // Quando usamos o == o que é comparado não é o valor em si do objeto,
        // e sim a referência.
        System.out.println(nome == nome1); // false

        // equals utiliza o valor da string se os dois valores são iguais.
        // String tem override do equals para comparar o valor da string e não a referência.
        System.out.println(nome.equals(nome1)); // true

        Smartphone s1 = new Smartphone("1ABC2", "Apple");
        Smartphone s2 = new Smartphone("1ABC2", "Apple");
        // false porque s1 e s2 fazem referências para objetos diferentes.
        // para ser true deveria ser       s1 = s2, ai fariam referência para o mesmo obj.
        //Porém o método equals agora é override e a comparação dá-se pelo serialNumber.
        System.out.println(s1.equals(s2)); // false





    }
}
