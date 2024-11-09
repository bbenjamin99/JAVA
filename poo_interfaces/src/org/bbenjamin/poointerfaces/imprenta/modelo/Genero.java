package org.bbenjamin.poointerfaces.imprenta.modelo;

public enum Genero {
    DRAMA("Drama"),
    ACCION("Acción"),
    AVENTURA("Aventura"),
    TERROR("Terror"),
    CIENCIA_FICCION("Ciencia Ficción"),
    PROGRAMACION("Programación");


     private String genero;

    Genero(String genero){
        this.genero = genero;
    }
}
