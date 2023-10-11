package vitor.joao.maratonajava.javacore.Cadvanced.Bconcurrent.test;


import vitor.joao.maratonajava.javacore.Cadvanced.Bconcurrent.domain.Members;
import vitor.joao.maratonajava.javacore.Cadvanced.Bconcurrent.service.EmailDeliveryService;

import javax.swing.*;

//  Concorrência pt 03 - Conditions
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
