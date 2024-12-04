package org.bbenjamin.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduce {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("Benja", "Mica", "Pepe", "Pepe", "Pepe",
                        "Pipo", "Benja Benitez")
                .distinct();

        String resultado = nombres.reduce("Resultado: ", (a,b) -> a+ ", " +b );
        System.out.println(resultado);



    }
}
