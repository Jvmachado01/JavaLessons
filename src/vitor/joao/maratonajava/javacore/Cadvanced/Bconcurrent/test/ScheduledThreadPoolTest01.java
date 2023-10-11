package vitor.joao.maratonajava.javacore.Cadvanced.Bconcurrent.test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// Concorrência pt 09 - Executors pt 02 - ScheduledExecutorService
public class ScheduledThreadPoolTest01 {
    private static final ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    private static void beeper() {
        Runnable r = () -> {
            System.out.println(LocalTime.now().format(formatter) + " beep");

            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        // Executa uma vez depois do tempo determinado, no caso é 5 segundos.
//        executor.schedule(r, 5, TimeUnit.SECONDS);

        // (Runnable, quando começa, a cada quanto tempo executa).
        // Esse método executa indefinidamente.
        ScheduledFuture<?> scheduleWithFixedDelay = executor.scheduleAtFixedRate(r, 1, 2, TimeUnit.SECONDS);

//        ScheduledFuture<?> scheduleWithFixedDelay = executor.scheduleWithFixedDelay(r, 1, 2, TimeUnit.SECONDS);
        executor.schedule(() -> {
            System.out.println("Cancelando o scheduleWithFixedDelay");
            // false é para não cancelar imediatamente, e sim esperar o processo concluir.
            scheduleWithFixedDelay.cancel(false);
            executor.shutdown();
        }, 10, TimeUnit.SECONDS); // executa após 10 segundos

    }

    public static void main(String[] args) {
        System.out.println(LocalTime.now().format(formatter));
        beeper();
    }


}
