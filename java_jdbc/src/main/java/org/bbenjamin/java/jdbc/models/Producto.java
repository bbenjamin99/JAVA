package org.bbenjamin.java.jdbc.models;

import java.util.Date;

public class Producto {
    private Long id;
    private String nombre;
    private Integer precio;
    private Date fechaRegistro;

    public Producto(){}

    @Override
    public String toString() {
        return
                "id=" + id +
                "|  " + nombre + " | "+
                 precio + " | " +
                 fechaRegistro + " | "  ;
    }

    public Producto(Long id, Date fechaRegistro, Integer precio, String nombre) {
        this.id = id;
        this.fechaRegistro = fechaRegistro;
        this.precio = precio;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
