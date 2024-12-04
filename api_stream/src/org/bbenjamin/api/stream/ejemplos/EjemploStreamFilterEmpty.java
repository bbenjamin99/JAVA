package org.bbenjamin.api.stream.ejemplos;

import org.bbenjamin.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterEmpty {
    public static void main(String[] args) {

        long count = Stream
                .of("Benja", "Mica", "", "Pipo", "")
                .filter(n -> n.isEmpty())
                .peek(System.out::println)
                .count();

        System.out.println("Count = " + count);
    }
}
