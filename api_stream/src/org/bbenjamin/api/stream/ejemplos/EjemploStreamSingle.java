package org.bbenjamin.api.stream.ejemplos;

import org.bbenjamin.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamSingle {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("Benja", "Mica", "Pepe", "Pipo", "Benja Benitez")
                .map(nombre -> new Usuario(nombre, null) )
                .filter(u -> u.getNombre().equals("Benjax"))
                .peek(u -> System.out.println(u.getNombre()));
        nombres.forEach( u -> System.out.println(u.getNombre() ) );

        Optional<Usuario> user = nombres.findFirst();
        System.out.println(user.orElse(new Usuario("John", "Doe")) );
    }
}
