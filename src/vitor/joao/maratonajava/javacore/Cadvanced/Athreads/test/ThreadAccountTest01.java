package vitor.joao.maratonajava.javacore.Cadvanced.Athreads.test;

import vitor.joao.maratonajava.javacore.Cadvanced.Athreads.domain.Account;

// Threads pt 05 - Sincronismo de thread pt 01 e 02
public class ThreadAccountTest01 implements Runnable {
    private Account account = new Account();

    public static void main(String[] args) {
        // Fazer o código rodar em threads diferentes
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();

        // Duas threads acessando o mesmo objeto
        Thread t1 = new Thread(threadAccountTest01, "Hestia");
        Thread t2 = new Thread(threadAccountTest01, "Bell Cranel");

        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (account.getBalance() < 0) {
                System.out.println("fodeo");
            }
        }
    }

    /*
     Fazer que esse bloco de código (método no caso)seja executado de forma atômica, isto é,
     a thrad que começar a executar o método withdrawal tem que terminar
     de executar até o fim do bloco.
     Outra thread não pode entrar pra executar no mesmo momento.
     Isso significa que precisamos dar um lock - todo objeto tem um lock!
     Para dar o lock, utilizamos a palavra synchronized.
     O lock vem do  objeto criado na linha 11. new ThreadAccountTest01();
    */
    private synchronized void withdrawal(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + " está indo sacar dinheiro");
            account.withdrawal(amount);
            System.out.println(Thread.currentThread().getName() + "completou o saque, valor atual da conta: " + account.getBalance());
        } else {
            System.out.println("Sem dinheiro para " + Thread.currentThread().getName() + " efetuar o saque " + account.getBalance());
        }
    }
}
