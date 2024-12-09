package org.aguzman.archivos.ejemplos;

import org.aguzman.archivos.ejemplos.services.ArchivoServicio;

public class EjemploCrearArchivo {
    public static void main(String[] args) {

        String nombreArchivo = "C:\\Users\\Benjamin\\Desktop\\JAVA\\archivo\\java.txt";

        ArchivoServicio service = new ArchivoServicio();
        service.crearArchivo(nombreArchivo);
    }
}
