package org.bbenjamin.poointerfaces.imprenta;

import org.bbenjamin.poointerfaces.imprenta.modelo.*;

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
         System.out.println(imprimible.imprimir());
    }
}
