package org.bbenjamin.pooherencia;

public class Profesor extends Persona{
    private String asignatura;


    //Constructor
    public Profesor(String nombre){

        System.out.println("Profesor: Inicializando Constructor...");
    }

    //Getters & Setters 
    public String getAsignatura(){
        return asignatura;
    }  

    public void setAsignatura(String asignatura){
        this.asignatura = asignatura;
    }

}
