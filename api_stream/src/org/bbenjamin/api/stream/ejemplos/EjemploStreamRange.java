package org.bbenjamin.api.stream.ejemplos;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamRange {
    public static void main(String[] args) {

        IntStream enteros = IntStream.range(5, 20).peek(System.out::println);
        

//        int resultado = enteros.reduce(0, Integer::sum );
//        int resultado = enteros.sum();

        IntSummaryStatistics stats = enteros.summaryStatistics();

//        System.out.println(stats);

        System.out.println("Max: "+ stats.getMax());
        System.out.println("Min: "+ stats.getMin());
        System.out.println("Sum: "+ stats.getSum());
        System.out.println("Promedio: " +stats.getAverage());
        System.out.println("Total: "+ stats.getCount());


    }
}
