package org.bbenjamin.java8.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {

        Function<String, String> f1 = param -> "Hola que tal! " + param;

        String resultado  = f1.apply("Benjamin");
        System.out.println(resultado);

        Function<String, String> f2 =  String::toUpperCase;
        System.out.println(f2.apply("Como va chavales!"));

        BiFunction<String, String, String> f3 = (a,b) -> a.toUpperCase().concat(b.toUpperCase());

        String resultado2 = f3.apply("hola buenos días", "chau buenas noches");
        System.out.println(resultado2) ;

        BiFunction<String, String, Integer> f4 = String::compareTo;
        System.out.println(f4.apply("Benjamin", "Benjamin")) ;

    }
}
        