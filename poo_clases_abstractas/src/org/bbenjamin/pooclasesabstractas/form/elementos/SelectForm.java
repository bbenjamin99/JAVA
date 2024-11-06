package org.bbenjamin.pooclasesabstractas.form.elementos;

import java.util.ArrayList;
import java.util.List;

import org.bbenjamin.pooclasesabstractas.form.elementos.select.Opcion;

public class SelectForm extends ElementoForm{


    private List<Opcion> opciones;


    //Constructor
    public SelectForm(String nombre){
        super(nombre);
      this.opciones = new ArrayList<Opcion>();
    }

    public SelectForm(String nombre, List<Opcion> opciones){
        this(nombre);
        this.opciones = opciones;

    }

    //Getters&Setters


    // methods

    public SelectForm addOpcion(Opcion opcion){
        this.opciones.add(opcion);
        return this;
    }
    @Override public String dibujarHtml(){
        StringBuilder sb = new StringBuilder("<select");
        sb.append("name='").append(this.nombre + " '>");
        
        for(Opcion opc : this.opciones){
            sb.append("\n");
            sb.append("<option value= \"" + opc.getValor() +"\"");

            if(opc.isSelected() == true) {
                sb.append( " selected");
                this.valor = opc.getValor();
            }
            sb.append(">");

            
            sb.append(opc.getNombre()).append("</option>");
        }
        sb.append("</select>");

        return sb.toString();
    }


}
