package vitor.joao.maratonajava.javacore.Cadvanced.Athreads.domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

// Três métodos que temos dentro de todos os objetos: wait(), notify(), notifyAll()
// São utilizados quando estamos trabalhando com múltiplas threads

// Class responsible for adding emails
public class Members {
    // Queue para adicionar na ordem. ArrayBlockingQueue usa thread-safe.
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen() {
        return this.open;
    }

    // método que verifica se tem algum e-mail esperando pra ser enviado.
    // Apesar da lista ser sincronizada, precisamos sincronizar a camada que está acima dela.
    // Vamos sincronizar o objeto emails para apenas um thread acessá-lo.
    public int pendingEmails() {
        synchronized (this.emails) {
            return emails.size();
        }
    }


    public void addMemberEmails(String email) {
        synchronized (this.emails) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " adicionou e-mail na lista");

            this.emails.add(email);

            // Outras threads estão esperando.
            // Aqui vamos notificar todas as threads que existe e-mail.
            this.emails.notifyAll();
        }
    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " checando se há e-mails");
        synchronized (this.emails) {
            // Se não houver e-mail, não quero que esse método finelize. Quero que a thread
            // fique aguardando
            while (this.emails.size() == 0) {
                if (!open) return null;
                System.out.println(Thread.currentThread().getName() + " não tem e-mail disponível na lista, entrando em modo de espera");
                // fazer a thread que está processamento this.emails deve entrar em modo de espera.
                // só podemos chamar o wait se tivermo o lock do objeto, isto é, estar num blocl sincronizado.
                this.emails.wait();
            }
            // retornar e retira da lista sempre o primeiro e-mail da lista.
            return this.emails.poll();

        }
    }

    // método para fechar a lista.
    public void close() {
        this.open = false;
        synchronized (this.emails) {
            System.out.println(Thread.currentThread().getName() + " notificando todo mundo que não estamos mais pegando emails");
        }
    }
}
