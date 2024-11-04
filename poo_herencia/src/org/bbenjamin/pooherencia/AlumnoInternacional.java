package org.bbenjamin.pooherencia;

public class AlumnoInternacional extends Alumno {
    private String pais;
    private double notaIdiomas;

    //Constructor
    public AlumnoInternacional(String nombre){
        super(nombre);
        System.out.println("AlumnoInternacional : Inicializando Constructor...");
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


    

}