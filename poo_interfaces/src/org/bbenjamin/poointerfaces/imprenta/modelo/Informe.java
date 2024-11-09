package org.bbenjamin.poointerfaces.imprenta.modelo;

public class Informe extends Hoja implements Imprimible{

    private String autor;
    private String revisor;
    

    public Informe(String contenido){
        super(contenido);
    }

    public Informe(String contenido, String autor, String revisor){
        this(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    
    //Methods
    @Override 
    public String imprimir(){
        return "Informe escrito por:" + this.autor + ", Revisado por: "
        + this.revisor + "\n"
        + this.contenido;
    }

}
