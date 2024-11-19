package org.bbenjamin.hilos.ejemplos.runnable;

public class ViajeTarea implements Runnable {
    private String nombre;

    public ViajeTarea(String nombre){
        this.nombre = nombre;
    }


    public String getNombre(){
        return this.nombre;
    }


    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println(i + " - " + this.nombre);
            try {
                Thread.sleep( (long)Math.random() *1000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
        
        System.out.println("Finalmente me voy de viaje a : " + this.nombre);
    }


    
}
