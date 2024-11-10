package org.bbenjamin.poointerfaces.models;

import java.util.Objects;

public class Cliente {
    private Integer id;
    private String nombre;
    private String apellido;
    private static Integer ultimoId;
    
    public Cliente(){
        this.id = ++ultimoId;
    }

    public Cliente(Integer id, String nombre, String apellido) {
        this();
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    //Overides Methods
    @Override
    public String toString(){
        return "ID: " + this.id +
        " Nombre: " + this.nombre +
        " Apellido: " + this.apellido;
    }

    @Override
    public boolean equals(Object o){
        if(this == o)return true;
        if(o == null || getClass() != o.getClass()) return false;

        Cliente cliente = (Cliente)o;

        return Objects.equals(id, cliente.id);
    }
    
}
