package org.bbenjamin.poointerfaces.imprenta.modelo;

import java.util.List;

public class Libro implements Imprimible{

    private List<Hoja> paginas;
    private String autor;
    private String titulo;
    private Genero genero;

    public Libro(String autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
    }

    public Libro addPagina(Hoja pagina){
        paginas.add(pagina);
        return this;
    }

    public String imprimir(){
        StringBuilder sb = new StringBuilder("Titulo: ");
        sb.append(this.titulo).append("\n")
        .append("Autor: ").append(this.autor).append("\n")
        .append("Género: ").append(this.genero).append("\n");

        for(Hoja pagina : this.paginas) {
            if(paginas.size() < 4) {
                sb.append(pagina.imprimir()).append("\n");
            } 

        }

        return sb.toString();
    }
    
}
