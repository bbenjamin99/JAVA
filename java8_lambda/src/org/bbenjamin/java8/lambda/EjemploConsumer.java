package org.bbenjamin.java8.lambda;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class EjemploConsumer {
    public static void main(String[] args) {

        Consumer<String> consumidor = saludo -> System.out.println(saludo);
        consumidor.accept("Hola como estás");

        Consumer<Date> consumidor1 = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };
        consumidor1.accept(new Date());

        BiConsumer<String, Integer> consumidorBI = (String nombre, Integer edad) -> {
            System.out.println(nombre + " Tiene " + edad + " años");
        };
        consumidorBI.accept("Benjamin", 25 );










    }
}
