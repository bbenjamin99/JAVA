package org.bbenjamin.api.stream.ejemplos;

import org.bbenjamin.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamDistinct {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("Benja", "Mica", "Pepe", "Pepe", "Pepe",
                        "Pipo", "Benja Benitez")
                .distinct();
                nombres.forEach(System.out::println);



    }
}
