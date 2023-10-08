package vitor.joao.maratonajava.javacore.Cadvanced.Athreads.service;

import vitor.joao.maratonajava.javacore.Cadvanced.Athreads.domain.Members;

// Class responsible for sending the emails
public class EmailDeliveryService implements Runnable {
    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " starting  a entrega dos e-mails");

        // Só pode enviar e-mail se estiver aberto OU pending maior que zero.
        // O método pendingEmails foi criado para não ter que usar o get e ter que liberar o acesso
        // aos atributos.
        while (this.members.isOpen() || this.members.pendingEmails() > 0) {
            try {
                // Pegar o e-mail
                String email = this.members.retrieveEmail();

                if (email == null) continue;

                System.out.println(threadName + " enviando e-mail para " + email);
                Thread.sleep(2000);
                System.out.println(threadName + " enviou e-mail com suceso para " + email);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Todos os e-mails foram enviados com sucesso!");
        }
    }
}
