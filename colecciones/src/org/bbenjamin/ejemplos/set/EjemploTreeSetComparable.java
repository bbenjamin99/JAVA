package org.bbenjamin.ejemplos.set;


import java.util.Set;
import java.util.TreeSet;

import org.bbenjamin.ejemplos.modelo.Alumno;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {

         Set<Alumno> setAlumnos = new TreeSet<>( (a,b) -> a.getNombre().compareTo(b.getNombre() ) );
         
         setAlumnos.add(new Alumno("Benjamin", 8));
         setAlumnos.add(new Alumno("Micaelita", 6));
         setAlumnos.add(new Alumno("Ronalda", 4));
         setAlumnos.add(new Alumno("Rockito", 7));
         setAlumnos.add(new Alumno("Martita", 3));
         setAlumnos.add(new Alumno("Benito", 2));

         System.out.println(setAlumnos);
    }

}