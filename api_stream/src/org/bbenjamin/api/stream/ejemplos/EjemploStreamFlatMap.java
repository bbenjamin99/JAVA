package org.bbenjamin.api.stream.ejemplos;

import org.bbenjamin.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFlatMap {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("Benja", "Mica", "Pepe", "Pipo", "Benja Benitez")
                .map(nombre -> new Usuario(nombre, null) )
                .flatMap(u -> {
                    if(u.getNombre().equalsIgnoreCase("pepe")){
                        return Stream.of(u);
                    }

                    return Stream.empty();

                });
    }
}
