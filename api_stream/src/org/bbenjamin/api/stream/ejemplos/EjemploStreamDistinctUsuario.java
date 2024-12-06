package org.bbenjamin.api.stream.ejemplos;

import org.bbenjamin.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamDistinctUsuario {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("Benja", "Mica", "Pepe", "Pipo", "Benja Benitez", "Benja benito")
                .distinct()
                .map(nombre -> new Usuario(nombre, null) );


        nombres.forEach(System.out::println);


    }
}
