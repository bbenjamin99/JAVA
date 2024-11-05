package org.bbenjamin.appfacturas.model;

public class Producto {
    //Attributes
    private int codigo;
    private String nombre;
    private Double precio;
    private static int ultimoCodigo;

    public Producto(){
        this.codigo = ++ultimoCodigo;
    }

    
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    
}
