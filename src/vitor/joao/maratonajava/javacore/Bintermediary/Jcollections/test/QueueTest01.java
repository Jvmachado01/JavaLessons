package vitor.joao.maratonajava.javacore.Bintermediary.Jcollections.test;

import java.util.PriorityQueue;
import java.util.Queue;

// Queue, PriorityQueue
public class QueueTest01 {
    public static void main(String[] args) {

        // Queue é mais uma coleção que temos disponível no Java.
        // Tem por padrão a característica FIFU (first in, first out).

        // A classe definida no Queue generic precisa ser Comparable
        Queue<String> fila = new PriorityQueue<>();
        fila.add("C");
        fila.add("A");
        fila.add("B");

       while (!fila.isEmpty()) {
           // peek() retorna o primeiro elemento e não remove o elemento.
//           System.out.println(fila.peek());
           // poll() remove o elemento cabeça da fila.
           System.out.println(fila.poll());
       }
    }
}
