package org.bbenjamin.java8.lambda;

import org.bbenjamin.java8.lambda.models.Usuario;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {
    public static void main(String[] args) {

        Consumer<String> consumidor = saludo -> System.out.println(saludo);
        consumidor.accept("Hola como estás");

        Consumer<Date> consumidor1 = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };
        consumidor1.accept(new Date());

        BiConsumer<String, Integer> consumidorBI = (String nombre, Integer edad) -> System.out.println(nombre + " Tiene " + edad + " años");

        consumidorBI.accept("Benjamin", 25 );

            Consumer<String> consumidor2 =  System.out::println;
        consumidor2.accept("Hello World!");

        List<String> nombres = Arrays.asList("Benjamin", "Benitez", "Rogelio","Pepe", "Paco");

        nombres.forEach(consumidor2);

        Supplier<Usuario> crearUsuario = Usuario::new;
            Usuario usuario = crearUsuario.get();

        BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;

            asignarNombre.accept(usuario, "Ricardito");

        System.out.println("Nombre usuario: " + usuario.getNombre());

        Supplier<String> proveedor = () ->  "Hello world";


        System.out.println( proveedor.get() );





    }
}
