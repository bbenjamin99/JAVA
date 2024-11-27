package org.bbenjamin.anotaciones.ejemplo.models;

import org.bbenjamin.anotaciones.ejemplo.JsonAtributo;

import java.time.LocalDate;

public class Producto {

    @JsonAtributo(nombre = "Descripcion")
    private String nombre;
    @JsonAtributo
    private Long precio;

    private LocalDate fecha;

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}