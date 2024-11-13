package org.bbenjamin.ejemplos.set;


import java.util.Set;
import java.util.TreeSet;

import org.bbenjamin.ejemplos.modelo.Alumno;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {
        
        Set<String> treeSet = new TreeSet<>();

        treeSet.add("Uno");
        treeSet.add("Dos");
        treeSet.add("Tres");
        treeSet.add("Cuatro");
        treeSet.add("Cinco");
        treeSet.add("Tres");

        System.out.println("Treeset = " + treeSet);

        Set<Integer> numeros = new TreeSet<>((a,b ) -> b.compareTo(a));

        numeros.add(2);
        numeros.add(5);
        numeros.add(3);
        numeros.add(1);
        numeros.add(6);
        numeros.add(7);

        System.out.println("Set numeros  = "+ numeros);
    }

}