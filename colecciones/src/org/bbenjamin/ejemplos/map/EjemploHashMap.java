package org.bbenjamin.ejemplos.map;

import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {
    public static void main(String[] args) {
        
        Map<String, String> persona = new HashMap();
        persona.put("nombre", "Benjamin");
        persona.put("apellido", "Benitez");
        persona.put("email", "bbenjamin4253@gmail.com");
        persona.put("edad", "25");


        String nombre = persona.get("nombre");
        System.out.println(nombre);

        boolean verdadero = persona.remove("email", "bbenjamin4253@gmail.com"); 
        boolean falso = persona.remove("email", "benjamin4253@gmail.com"); 
        System.out.println(persona );

        System.out.println(verdadero);
        System.out.println(falso);

    }
}
