package org.bbenjamin.api.stream.ejemplos;

import org.bbenjamin.api.stream.ejemplos.models.Factura;
import org.bbenjamin.api.stream.ejemplos.models.Usuario;

import java.util.Arrays;
import java.util.List;

public class EjemploStreamFlatMapFactura {
    public static void main(String[] args) {

        Usuario u1 = new Usuario("John", "Doe");
        Usuario u2 = new Usuario("Pepe", "Pérez");

        u1.addFactura( new Factura("Compras Tecnología"));
        u1.addFactura(new Factura("Muebles"));

        u2.addFactura( new Factura("Bicicleta"));
        u2.addFactura( new Factura("Notebook Gamer"));

        List<Usuario> usuarios = Arrays.asList(u1,u2);

        usuarios.stream().flatMap(u -> u.getFacturas().stream() )
                .forEach(f -> System.out.println(f.getDescripcion().concat(" : cliente ")
                        .concat(f.getUsuario().toString()  )));



//        for (Usuario u : usuarios) {
//            for (Factura f : u.getFacturas()){
//                System.out.println(f.getDescripcion());
//            }
//        }
    }
}
