package org.bbenjamin.app.hogar;

import java.util.Date;

import org.bbenjamin.app.jardin.Perro;

public class EjemploHogar {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Perro perro1 = new Perro();
        
        Date edadPersona1 = new Date() - 1999;
        
        persona1.setEdad();
    }
}
