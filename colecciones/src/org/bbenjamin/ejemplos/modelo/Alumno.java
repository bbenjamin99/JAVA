package org.bbenjamin.ejemplos.modelo;

public class Alumno implements Comparable<Alumno> {

    private String nombre;
    private Integer nota;
    public Alumno(){

    }

    public Alumno(String nombre, Integer nota){
        this.nombre = nombre;
        this.nota = nota;
    }

    // G & S
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    @Override
    public String toString(){
        
        return this.nombre + "\t" + " Nota: " + this.nota + "\n";
    }

    @Override
    public int compareTo(Alumno a) {
        
        // if(this.nombre == null) return 0;

        // return this.nombre.compareTo(a.nombre);

        if( this.nota == null){
            return 0;
            } else return this.nota.compareTo(a.nota);
             
        

        
    }

    
}
 