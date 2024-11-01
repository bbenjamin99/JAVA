package org.bbenjamin.appfacturas.model;

public class ItemFactura {


    private int cantidad;
    private Producto producto;


    public ItemFactura(int cantidad, Producto producto){
        this.cantidad = cantidad;
        this.producto = producto;
    }


    public int getCantidad(){
        return cantidad;
    }

    //Methods
    public Double calcularImporte(){

        return 0d;
    }

    public Producto getProducto(){
        return producto;
    } 

    public void setProducto(Producto producto){
        this.producto = producto;
    }
    

}
