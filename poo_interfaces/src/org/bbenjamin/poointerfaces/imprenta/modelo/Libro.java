package org.bbenjamin.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible{

    private List<Imprimible> paginas;
    private String autor;
    private String titulo;
    private Genero genero;

    public Libro(String autor, String titulo, Genero genero) {
        paginas = new ArrayList<>();
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
    }

    public Libro addPagina(Imprimible pagina){
        paginas.add(pagina);
        return this;
    }

    @Override
    public String imprimir(){
        StringBuilder sb = new StringBuilder("Titulo: ");
        sb.append(this.titulo).append("\n")
        .append("Autor: ").append(this.autor).append("\n")
        .append("Género: ").append(this.genero).append("\n");

        for(Imprimible pagina : this.paginas) {
                if(paginas != null){ 
                    sb.append(pagina.imprimir()).append("\n");
                }

        }

        return sb.toString();
    }
    
}
