package org.bbenjamin.ejemplo;

import org.bbenjamin.pooherencia.*;

public class EjemploHerencia {
    public static void main(String[] args){


        System.out.println("========Creando la Instancia de Alumno=======");
        Alumno alumno = new Alumno("Benjamin");
        alumno.setApellido("Benitez");
        alumno.setInstitucion("Mariano Moreno");
        alumno.setNotaHistoria(6.5);
        alumno.setNotaCastellano(8);
        alumno.setNotaMatematica(7.7);
        System.out.println("Nombre completo Alumno: " + alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("========================================================");


        System.out.println("========Creando la Instancia de AlumnoInternacional=======");
        AlumnoInternacional alumnoInternacional = new AlumnoInternacional("Benshamin");
        alumnoInternacional.setApellido("Gosling");
        alumnoInternacional.setPais("New Zealand");
        alumnoInternacional.setEdad(25);
        alumnoInternacional.setInstitucion("National Institute");
        alumnoInternacional.setNotaIdiomas(5.8);
        alumnoInternacional.setNotaHistoria(4.8);
        alumnoInternacional.setNotaMatematica(6.5);
        System.out.println("========================================================");


        System.out.println("========Creando la Instancia de Profesor=======");
        Profesor profesor = new Profesor("Andres");
        profesor.setApellido("Guzman");
        profesor.setAsignatura("Matematicas");
        System.out.println("Nombre completo Profesor : " + profesor.getNombre() + " " + profesor.getApellido());
        System.out.println("========================================================");

        Class clase = alumnoInternacional.getClass();

        while(clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();

            System.out.println("Clase Hija : " + hija);
            System.out.println("Clase Padre : " + padre);

            clase = clase.getSuperclass();
        }






    }
}
