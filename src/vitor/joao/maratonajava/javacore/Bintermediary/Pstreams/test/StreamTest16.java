package vitor.joao.maratonajava.javacore.Bintermediary.Pstreams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

// Streams pt 16 - Parallel Streams pt 01
public class StreamTest16 {
    public static void main(String[] args) {

        // Ver quantas threads o Parallel Streams vai usar. O padrão é 8.
        System.out.println(Runtime.getRuntime().availableProcessors());

        long num = 25_000_000;
        sumFor(num);
        sumStreamIterate(num);
        sumParallelStreamIterate(num);
        sumLongStreamIterate(num);
        sumParallelLongStreamIterate(num);

    }

    private static void sumFor(long num) {
        System.out.println("Sum for");
        long result = 0;
        long init = System.currentTimeMillis(); // temp de processamento

        for (long i = 1; i <= num; i++) {
            result += i;
        }

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumStreamIterate(long num) {
        System.out.println("Sum StreamIterate");
        long init = System.currentTimeMillis(); // temp de processamento

        long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumParallelStreamIterate(long num) {
        System.out.println("Sum ParellelStreamIterate");
        long init = System.currentTimeMillis(); // temp de processamento

        long result = Stream.iterate(1L, i -> i + 1).parallel().limit(num).reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumLongStreamIterate(long num) {
        System.out.println("Sum LongtreamIterate");
        long init = System.currentTimeMillis(); // temp de processamento

        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumParallelLongStreamIterate(long num) {
        System.out.println("Sum ParallelLongStreamIterate");
        long init = System.currentTimeMillis(); // temp de processamento

        // rangeClosed eu digo o valor que é de 1 a 20 milhões
        long result = LongStream.rangeClosed(1, num).reduce(0L, Long::sum);


        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

}
