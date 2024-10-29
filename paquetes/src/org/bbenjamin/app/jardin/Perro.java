package org.bbenjamin.app.jardin;

import org.bbenjamin.app.hogar.Persona;

public class Perro {
    String nombre;
    String raza;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }


    String Jugar(Persona persona){
        
        return this.nombre + " Buscando pelota que lanzo: " + persona.getNombre();
    }
}
