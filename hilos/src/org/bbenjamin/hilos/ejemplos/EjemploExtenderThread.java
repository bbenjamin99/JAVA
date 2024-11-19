package org.bbenjamin.hilos.ejemplos;

import org.bbenjamin.hilos.ejemplos.threads.NombreThread;

public class EjemploExtenderThread {
    
    public static void main(String[] args) throws InterruptedException {
        Thread hilo = new NombreThread("Benjamin Benitez");
        hilo.start();
        Thread.sleep(1002);
        System.out.println(hilo.getState());

        Thread hilo2 = new NombreThread("Hilo2");
        hilo2.start();
        NombreThread hilo3 = new NombreThread("Hilo3");
        hilo3.start();


    }
}
  