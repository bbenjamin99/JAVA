package org.bbenjamin.pooherencia;

public class Profesor extends Persona{
    private String asignatura;


    //Constructor
    public Profesor( ){

        System.out.println("Profesor: Inicializando Constructor...");
    }

    public Profesor(String nombre, String apellido ){
        super(nombre, apellido);
    }

    public Profesor(String nombre, String apellido, String asignatura){
        super(nombre, apellido);
        this.asignatura = asignatura;
    }

    //Getters & Setters 
    public String getAsignatura(){
        return asignatura;
    }  

    public void setAsignatura(String asignatura){
        this.asignatura = asignatura;
    }

    // Methods
    public String saludar(){
        return "Buenos días soy el profesor: " + this.getNombre() + " de la materia: " + getAsignatura();
    }

}
