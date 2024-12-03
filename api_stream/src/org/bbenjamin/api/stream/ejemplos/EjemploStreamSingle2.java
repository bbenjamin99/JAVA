package org.bbenjamin.api.stream.ejemplos;

import org.bbenjamin.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamSingle2 {
    public static void main(String[] args) {

        Usuario user = Stream
                .of("Benja", "Mica", "Pepe", "Pipo", "Benja Benitez")
                .map(nombre -> new Usuario(nombre, null) )
                .filter(u -> u.getNombre().equals(3))
                .findFirst().get();

        System.out.println(user.getId());
    }
}
