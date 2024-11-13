package org.bbenjamin.ejemplos.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {

    public static void main(String[] args) {
        
        Set<String> treeSet = new TreeSet<>( (String a, String b) -> b.compareTo(a));

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
