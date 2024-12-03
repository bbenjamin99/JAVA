package org.bbenjamin.api.stream.ejemplos;

import org.bbenjamin.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamAnyMatch {
    public static void main(String[] args) {

        boolean existe = Stream
                .of("Benja", "Mica", "Pepe", "Pipo", "Benja Benitez")
                .map(nombre -> new Usuario(nombre, null) )
                .anyMatch(u -> u.getId().equals(3));

        System.out.println(existe);
    }
}
