package org.aguzman.optional.ejemplo;

import org.aguzman.optional.ejemplo.models.Computadora;
import org.aguzman.optional.ejemplo.repositorio.ComputadoraRepositorio;
import org.aguzman.optional.ejemplo.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorio {
    public static void main(String[] args) {

        Repositorio<Computadora> repositorio = new ComputadoraRepositorio();
        repositorio.filtrar("asus rog").ifPresentOrElse(System.out::println,
                () -> System.out.println("No se encontró"));
//        Optional<Computadora> pc = repositorio.filtrar("nasus rog");
//        if (pc.isPresent()) {
//            System.out.println(Optional.of(pc.get().toString()) );
//        } else {
//            System.out.println("No se encontró");
//        }


    }
}
