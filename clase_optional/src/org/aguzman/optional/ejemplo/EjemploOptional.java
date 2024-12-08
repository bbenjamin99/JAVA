package org.aguzman.optional.ejemplo;

import java.util.Optional;

public class EjemploOptional {
    public static void main(String[] args) {

        String nombre = "Benjamin";
        Optional<String> opt = Optional.of(nombre);
        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent()) ; // está presente boolean
        if (opt.isPresent()) {
            System.out.println("Está presente xd" + opt.get() );
        }


        System.out.println(opt.isEmpty());

        opt.ifPresent( valor -> System.out.println("Hi, " + valor));

        nombre = null;
        opt = Optional.ofNullable(nombre);

        System.out.println(opt.isPresent() );
        System.out.println(opt.isEmpty() );

        opt.ifPresentOrElse( valor -> System.out.println("Hello, " + valor), () -> {
            System.out.println("No está presente");

        } );

        if (opt.isPresent()) {
            System.out.println("Está presente xd" + opt.get() );
        } else {
            System.out.println("No está presente");
        }
    }
}
