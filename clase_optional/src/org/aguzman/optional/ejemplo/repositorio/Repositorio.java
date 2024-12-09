package org.aguzman.optional.ejemplo.repositorio;

import org.aguzman.optional.ejemplo.models.Computadora;

import java.util.Optional;

public interface Repositorio<T> {

    Optional<Computadora> filtrar(String nombre);
}
