package org.bbenjamin.ejemplos.set;

import java.util.ArrayList;
import java.util.List;

import org.bbenjamin.ejemplos.modelo.Alumno;

public class EjemploArrayList {
    public static void main(String[] args) {
        
        List<Alumno> al = new ArrayList<>();
        System.out.println( al + ", Size : " + al.size());
        System.out.println("Esta vacía? =" + al.isEmpty() );
        al.add(new Alumno("Benjamin", 8));
        al.add(new Alumno("Micaelita", 6));
        al.add(0, new Alumno("Ronalda", 4));
        al.add(new Alumno("Rockito", 7));
        al.add(new Alumno("Martita", 3));
        al.add(new Alumno("Benito", 2));


        System.out.println( al + ", Size : " + al.size());

        al.remove(new Alumno("Benito", 2));

        System.out.println(al + " Size = " + al.size());
    }
}
