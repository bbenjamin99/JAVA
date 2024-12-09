package org.aguzman.archivos.ejemplos.services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoServicio {


    public void crearArchivo(String nombre){
        File archivo = new File(nombre);
        try {
            FileWriter escritor = new FileWriter(archivo, true);
            escritor.append("Hola que tal amigos \n")
                    .append("Todo bien! \n")
                    .append("bueno hasta luego pa \n");
            escritor.close();
            System.out.println("El archivo se creó con éxito...\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
