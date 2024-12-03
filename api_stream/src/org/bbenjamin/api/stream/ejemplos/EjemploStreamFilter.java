package org.bbenjamin.api.stream.ejemplos;

import org.bbenjamin.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFilter {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("Benja", "Mica", "Pepe", "Pipo", "Benja Benitez")
                .map(nombre -> new Usuario(nombre, null) )
                .filter(u -> u.getNombre().equals("Benja"))
                .peek(u -> System.out.println(u.getNombre()));
        nombres.forEach( u -> System.out.println(u.getNombre() ) );
    }
}
