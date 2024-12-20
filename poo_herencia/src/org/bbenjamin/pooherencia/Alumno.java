package org.bbenjamin.pooherencia;

public class Alumno extends Persona {
    private String institucion;
    private double notaMatematica;
    private double notaCastellano;
    private double notaHistoria;

    //Constructor
    public Alumno(){
        System.out.println("Alumno: Inicializando Constructor...");
    }

    public Alumno(String nombre, String apellido){
        super(nombre,apellido);
    }

    public Alumno(String nombre, String apellido, int edad){
        super(nombre,apellido,edad);
    }

    public Alumno(String nombre, String apellido, int edad, String institucion){
        super(nombre,apellido,edad);
        this.institucion = institucion;
    }

    public Alumno(String nombre, String apellido, int edad,
                  String institucion, double notaMatematica, double notaCastellano, double notaHistoria){
        this(nombre, apellido, edad, institucion);
        this.notaMatematica = notaMatematica;
        this.notaCastellano = notaCastellano;
        this.notaHistoria = notaHistoria;

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

    // Methods
    @Override
    public String saludar(){
        String saludoPadre = super.saludar();
        return saludoPadre + "soy un alumno y mi nombre es :" + this.getNombre();
    }

    public double calcularPromedio(){
        double total = (notaMatematica + notaCastellano + notaHistoria) / 3;
        return total;
    }

    

}
