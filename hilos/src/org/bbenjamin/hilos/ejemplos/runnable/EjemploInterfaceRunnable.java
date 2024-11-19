package org.bbenjamin.hilos.ejemplos.runnable;

public class EjemploInterfaceRunnable {
    public static void main(String[] args) {
        
        new Thread(new ViajeTarea("Isla de Pascua")).start(); 
        new Thread(new ViajeTarea("Robinson Crusoe")).start(); 
        new Thread(new ViajeTarea("Bariloche")).start(); 
        new Thread(new ViajeTarea("Chubut")).start(); 
    }

}
