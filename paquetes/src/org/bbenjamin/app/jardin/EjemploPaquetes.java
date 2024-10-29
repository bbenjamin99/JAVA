package org.bbenjamin.app.jardin;
import org.bbenjamin.app.hogar.*;

public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setNombre("Benjamin");
        System.out.println();

        Perro perro1 = new Perro();
        perro1.setNombre("Rocco");

        String jugando = perro1.Jugar(persona1);

        System.out.println(jugando);
    }
}
