package org.bbenjamin.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduceInt {
    public static void main(String[] args) {

        Stream<Integer> enteros = Stream.of(5,10,15,20,25)
                .distinct();

        int resultado = enteros.reduce(0, Integer::sum );
        System.out.println(resultado);



    }
}
