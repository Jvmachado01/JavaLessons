package vitor.joao.maratonajava.javacore.Cadvanced.Bconcurrent.service;


import vitor.joao.maratonajava.javacore.Cadvanced.Bconcurrent.domain.Members;

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

        while (this.members.isOpen() || this.members.pendingEmails() > 0) {
            try {
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
