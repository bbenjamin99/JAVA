package org.bbenjamin.pooherencia;

public class Alumno extends Persona {
    private String institucion;
    private double notaMatematica;
    private double notaCastellano;
    private double notaHistoria;

    //Constructor
    public Alumno(String nombre){
        System.out.println("Alumno: Inicializando Constructor...");
    }

    //Getteres & Setters

    public String getInstitucion() {
        return institucion;
    }
    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }
    public double getNotaMatematica() {
        return notaMatematica;
    }
    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }
    public double getNotaCastellano() {
        return notaCastellano;
    }
    public void setNotaCastellano(double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }
    public double getNotaHistoria() {
        return notaHistoria;
    }
    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    

}
