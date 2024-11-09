package org.bbenjamin.poointerfaces.imprenta;

import org.bbenjamin.poointerfaces.imprenta.modelo.Curriculum;
import org.bbenjamin.poointerfaces.imprenta.modelo.Genero;
import org.bbenjamin.poointerfaces.imprenta.modelo.Hoja;
import org.bbenjamin.poointerfaces.imprenta.modelo.Imprimible;
import org.bbenjamin.poointerfaces.imprenta.modelo.Informe;
import org.bbenjamin.poointerfaces.imprenta.modelo.Libro;
import org.bbenjamin.poointerfaces.imprenta.modelo.Pagina;

public class EjemploImprenta {
    public static void main(String[] args) {
        
        Curriculum cv = new Curriculum("Benjamin Benitez", "Ingenieria de sistemas", "Resumen laboral...." );

        cv.addExperiencia("Java");
        cv.addExperiencia("Oracle DBA");
        cv.addExperiencia("Spring Framework");
        cv.addExperiencia("Desarrollador Fullstack");

        Libro libro = new Libro("Erich Gamma", "Patrones de diseño: Elem. Reusables POO", Genero.PROGRAMACION);
        libro.addPagina(new Pagina("Patron Singleton"))
        .addPagina(new Pagina("Patrón Observador"))
        .addPagina(new Pagina("Patrón Factory"))
        .addPagina(new Pagina("Composite "))
        .addPagina(new Pagina("Patron Facade"));
        Informe informe = new Informe("Estudio sobre MicroServicios", "Martin Fowler", "James");


        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

    }

    public static void imprimir(Imprimible imprimible){
         imprimible.imprimir();
    }
}
