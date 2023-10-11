package vitor.joao.maratonajava.javacore.Cadvanced.Bconcurrent.test;

/*
    LinkedTransferQueue é uma classe da junção das classes:
    ConcurrentLinkedQueue, SynchrousQueue, LinkedBlockingQueue.
    Basicamente a classe LinkedTransferQueue juntou as funcionalidade das três classes em uma.

 */

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

// Concorrência pt 07 - LinkedTransferQueue
public class LinkedtransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        TransferQueue<Object> tq = new LinkedTransferQueue<>();

        // .ad() vai inserior o elemento, se for possível, vai fazer imediatamente
        // sem violar a capacidade de elementos de dentro, e vai retorna true ou lançar exceção
        // caso não haja espaço para colocar o elemento.
        System.out.println(tq.add("John"));

        //  .offer() faz a mesma coisa que o .add() vai retorna true ao adicionar o elemento,
        // caso contrário em vez de retonar exceção, vai retorena false.
        System.out.println(tq.offer("George"));

        // vai tentar inserior o elmeneto e esperar 10 segundos para o espaço ficar disponível
        System.out.println(tq.offer("Ringo", 10, TimeUnit.SECONDS));

        // .put() inserio o elmento e espera. Se não tiver espaço o put vai ser bloqueado até
        // espaço estar disponível (igual ocorreu na aula anterior).
        tq.put("Paul");


        // .transfer() literalmente vai bloquear a thread, vai ficar esperando um elemento tentar
        // pegar o valor que eu coloquei. É uma característica da SynchrousQueue, que quando
        // adiciono um valor, o valor imediatamente fica esperando até que uma outra threade pegue-o.
        if (tq.hasWaitingConsumer()) {
            tq.transfer("Beatles");
        }
        // ou, em vez do if(). tryTransfer tenta transferir o elmento imediatamente, caso não tenha,
        // vai retornar false.
        System.out.println(tq.tryTransfer("The Beatles"));
        // Espera um consumir aparecer em 5 segundos. Se não aparece, retorna false.
        System.out.println(tq.tryTransfer("The Beatles", 5, TimeUnit.SECONDS));


        // element() vai exibir o primeiro elemento da queue (cabeça) mas não vai remover.
        // A diferença é que lança uma exeção se a lista estiver vazia.
        System.out.println(tq.element());

        // peek() só pegar sem remover
        System.out.println(tq.peek());

        // poll() pega e remove o primeiro elemento, se for vazio retorna null se vazio.
        /// poll() e remove() trabalham igual, a diferença é que o último lança uma exceção.
        System.out.println(tq.poll());

        // take() pega o primeiro o valor e retira da fila, e fica esperando caso esteja vazia,
        // até que alguem coloque um valor lá dentro da fila.
        System.out.println(tq.take());

        // Capacidade de elementos que podemos colocar na coleção
        System.out.println(tq.remainingCapacity());


    }
}
