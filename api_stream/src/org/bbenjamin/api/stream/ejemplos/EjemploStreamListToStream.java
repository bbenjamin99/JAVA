package org.bbenjamin.api.stream.ejemplos;

import org.bbenjamin.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamListToStream {
    public static void main(String[] args) {

        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Benjamin", "Benitez"));
        lista.add(new Usuario("Micaela", "De Luca"));
        lista.add(new Usuario("Rockito", "De Luca"));
        lista.add(new Usuario("Martita", "Imas"));
        lista.add(new Usuario("Javier", "Milei"));
        lista.add(new Usuario("Benjamin", "Benitez"));

        Stream<Usuario> listaStream = lista.stream();

        listaStream.map( u -> u.getNombre().toUpperCase()
                .concat(" ")
                .concat(u.getApellido()).toUpperCase())
                .flatMap(nombre -> {
                    if (nombre.contains("Rockito".toUpperCase() )){

                        return Stream.of(nombre);
                    }

                    return Stream.empty();
                })
                .forEach(System.out::println);
    }
}
