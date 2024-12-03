package org.bbenjamin.api.stream.ejemplos;

import org.bbenjamin.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamMap {
    public static void main(String[] args){


        Stream<Usuario> nombres = Stream
                .of("Benja", "Mica", "Pepe", "Pipo", "Benja Benitez")
                .map(nombre -> new Usuario(nombre, null) )
                .peek(u -> System.out.println(u.getNombre()))
                .filter(u -> u.getNombre().equals("Benja"))
                .map( usuario -> {

                   String nombre = usuario.getNombre().toLowerCase();
                   usuario.setNombre(nombre);

                   return usuario;
                });
                nombres.forEach( u -> System.out.println(u.getNombre() ) );
    }



}
