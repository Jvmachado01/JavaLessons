package vitor.joao.maratonajava.javacore.Cadvanced.Athreads.test;

import vitor.joao.maratonajava.javacore.Cadvanced.Athreads.domain.Members;
import vitor.joao.maratonajava.javacore.Cadvanced.Athreads.service.EmailDeliveryService;

import javax.swing.*;

// Threads pt 09 - Sincronismo de thread pt 05 - Wait, notify e notifyAll
public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();

        // Criação das threads
        Thread paulista = new Thread(new EmailDeliveryService(members), "Paulista");
        Thread carioca = new Thread(new EmailDeliveryService(members), "Carioca");

        // Start das threads que irão entregar os e-mails.
        // start faz o método .run() ser executado
        paulista.start();
        carioca.start();

        // Pedir os e-mails para enviar.
        while (true) {
            String email = JOptionPane.showInputDialog("Entre com seu email");
            if (email == null || email.isEmpty()) {
                // close() para o programa
                members.close();
                break;
            }

            // Adicionar o e-mail.
            members.addMemberEmails(email);
        }
    }
}
