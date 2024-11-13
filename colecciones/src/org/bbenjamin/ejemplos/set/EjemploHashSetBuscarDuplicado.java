package org.bbenjamin.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado {
    public static void main(String[] args) {
        
        String[] peces = {"Corvina", "Lenguado", "Pejerrey", "Robalo", "Atun", "Lenguado"};

        Set<String> unicos = new HashSet<>();

        for(String pez : peces) {

            if(!unicos.add(pez)){
                System.out.println("Elementos duplicados : " + pez);
            }
        }

        System.out.println("Elementos no repetidos: " + unicos);
    }
}
