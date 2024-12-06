package org.bbenjamin.api.stream.ejemplos;

import org.bbenjamin.api.stream.ejemplos.models.Usuario;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamDistinctUsuarioSum {
    public static void main(String[] args) {

        IntStream largoNombres = Stream
                .of("Benja", "Mica", "Pepe", "Pipo", "Benja Benitez", "Benja benito")
                .distinct()
                .mapToInt(user -> user.toString().length()  )
                .peek(System.out::println);

//        largoNombres.forEach(System.out::println);
//        System.out.println(largoNombres.sum());
        System.out.println(largoNombres.max());

    }
}
