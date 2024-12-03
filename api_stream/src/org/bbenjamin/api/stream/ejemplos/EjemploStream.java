package org.bbenjamin.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {

//        Stream<String> nombres = Stream.of("Benja", "Mica", "Pepe", "Pipo");
//        nombres.forEach(System.out::println);
//
//        String[] arr = {"Benja", "Mica", "Pepe", "Pipo"};
//        nombres = Arrays.stream(arr);
//       nombres.forEach(System.out::println);

//        Stream<String> nombres = Stream.<String>builder().add("Benito")
//                .add("Camelas").add("Ricardito").build();
//
//        nombres.forEach(System.out::println);

        List<String> lista = new ArrayList<>();

        lista.add("Benja");
        lista.add("Mica");
        lista.add("Rockito");

        Stream<String> nombres = lista.stream();
        nombres.forEach(e -> System.out.println(e));
    }
}
