package org.bbenjamin.ejemplos.set;

import java.util.HashSet;
 
public class EjemploHashSetAgregar {
    public static void main(String[] args) {
        
        HashSet<String> hs = new HashSet<>();
        hs.add("Uno");
        hs.add("Dos");
        hs.add("Tres");
        hs.add("Cuatro");
        hs.add("Cinco");
        
        System.out.println(hs);

        boolean b = hs.add("Tres");

        System.out.println(hs);
        System.out.print("Permite elementos duplicados? :\t");
        System.out.println(b);
    }
}
 