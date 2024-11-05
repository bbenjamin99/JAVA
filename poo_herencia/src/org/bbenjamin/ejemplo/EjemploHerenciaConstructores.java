package org.bbenjamin.ejemplo;

import org.bbenjamin.pooherencia.*;

public class EjemploHerenciaConstructores {
    public static void main(String[] args){


        System.out.println("========Creando la Instancia de Alumno=======");
        Alumno alumno = new Alumno("Benjamin", "Benitez",25,"Mariano Moreno");
        alumno.setNotaHistoria(6.5);
        alumno.setNotaCastellano(8);
        alumno.setNotaMatematica(7.7);
        alumno.setEmail("alumno@alumno.com");
        System.out.println("Nombre completo Alumno: " + alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("========================================================");


        System.out.println("========Creando la Instancia de AlumnoInternacional=======");
        AlumnoInternacional alumnoInternacional = new AlumnoInternacional("Benshamin","Gosling","New Zealand");
        alumnoInternacional.setEdad(15);
        alumnoInternacional.setInstitucion("National Institute");
        alumnoInternacional.setNotaIdiomas(5.8);
        alumnoInternacional.setNotaHistoria(4.8);
        alumnoInternacional.setNotaMatematica(6.5);
        System.out.println("========================================================");

        System.out.println("========Creando la Instancia de AlumnoInternacional=======");
        Profesor profesor = new Profesor("Andrés", "Guzmán", "Matemáticas");
        profesor.setEdad(40);
        
        // imprimir(alumno);
        // imprimir(alumnoInternacional);
        imprimir(profesor);
        System.out.println( alumnoInternacional.saludar() );
    }

    public static void imprimir(Persona persona) {
        System.out.println("Imprimiendo datos del tipo Persona:");
        System.out.println("Nombre: "+ persona.getNombre() + ", Apellido: " + persona.getApellido() +
        ", Edad: " + persona.getEdad() + ", Email : " + persona.getEmail() );

        if(persona instanceof Alumno) {
            System.out.println("Imprimiendo datos del tipo Alumno");
            System.out.println("Institución : " + ((Alumno)persona).getInstitucion());  
            System.out.println("Nota Matemáticas: " + ((Alumno)persona).getNotaMatematica());  
            System.out.println("Nota Historia: " + ((Alumno)persona).getNotaHistoria());  
            System.out.println("Nota Castellano: " + ((Alumno)persona).getNotaCastellano());  

            if(persona instanceof AlumnoInternacional){
                System.out.println("Imprimiendo datos del tipo Alumno Internacional");
                System.out.println("Pais : " + ((AlumnoInternacional)persona).getPais());
                System.out.println("Nota idiomas : " + ((AlumnoInternacional)persona).getNotaIdiomas());
            }
    
        }
        if(persona instanceof Profesor){
            System.out.println("Imprimiendo datos del tipo Profesor");
            System.out.println("Asignatura del profesor: " + ((Profesor)persona).getAsignatura());
        }        

    }
}
