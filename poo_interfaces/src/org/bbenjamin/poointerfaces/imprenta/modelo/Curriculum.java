package org.bbenjamin.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements Imprimible{

    private String persona;
    private String carrera; 
    private List<String> experiencias;
    

    public Curriculum(String contenido){
        super(contenido);
        experiencias = new ArrayList<>();
    }

    public Curriculum( String persona, String carrera, String contenido ){
        this.persona = persona;
        this.carrera = carrera;
        this(contenido);

    }

    public Curriculum( String persona, String carrera, String contenido, List<String> experiencias ){
        this.persona = persona;
        this.carrera = carrera;
        this(contenido);
        this.experiencias = experiencias;
    }

    public Curriculum addExperiencia(String experiencia){

        this.experiencias.add(experiencia);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre : ");
        sb.append(persona).append("\n")
          .append("Resumen: ").append(this.contenido + "\n")
          .append("Profesion: ").append(this.carrera + "\n")
          .append("Experiencias: ").append("\n");

          for(String experiencia : experiencias){
            sb.append("* " + experiencia + "\n");
          }

        return sb.toString();
    }




}
