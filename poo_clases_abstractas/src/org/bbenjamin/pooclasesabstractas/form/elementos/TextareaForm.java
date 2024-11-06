package org.bbenjamin.pooclasesabstractas.form.elementos;

public class TextareaForm extends ElementoForm {

    private int filas;
    private int columnas;

    //Constructor
    public TextareaForm(String nombre){
        super(nombre);
    }

    public TextareaForm(String nombre, int filas, int columnas){
        super(nombre);
        this.filas = filas;
        this.columnas = columnas;
    }




    // Methods
    @Override
    public String dibujarHtml(){
        return "<textarea name=\""+ this.nombre
        +"\" cols=\" "+ this.columnas
        +"\" rows=\""+ this.filas
        +"\">"+ this.valor +"</textarea>";
    }
}
 