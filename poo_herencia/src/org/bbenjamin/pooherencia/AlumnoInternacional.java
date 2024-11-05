package org.bbenjamin.pooherencia;

public class AlumnoInternacional extends Alumno {
    private String pais;
    private double notaIdiomas;

    //Constructor
    public AlumnoInternacional( ){
        System.out.println("AlumnoInternacional : Inicializando Constructor...");
    }

    public AlumnoInternacional(String nombre, String apellido){
        super(nombre, apellido);
    }

    public AlumnoInternacional(String nombre, String apellido, String pais ){
        super(nombre, apellido);
        this.pais = pais;
    }

    public AlumnoInternacional(String nombre, String apellido, String pais, double notaIdiomas ){
        this(nombre, apellido, pais);
        this.notaIdiomas = notaIdiomas;
    }

    // Getters & Setters
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public double getNotaIdiomas() {
        return notaIdiomas;
    }
    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }


    //Methods
    @Override
    public String saludar(){
        return "Hi, my name is : " + this.getNombre() + ", and im student from : " + this.getPais(); 
    }

    @Override
    public double calcularPromedio() {

        return ((super.calcularPromedio() * 3 ) + getNotaIdiomas() ) / 4  ;
    }
    
    

}