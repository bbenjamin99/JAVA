package org.bbenjamin.appfacturas.model;

import java.util.Date;

public class Factura {
    //Attributes

    private int folio; // Numero de Factura
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceItems;
    public static final int MAX_ITEMS = 10;
    private static int ultimoFolio;


    public Factura(String descripcion, Cliente cliente){
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.folio = ++ultimoFolio;
        this.fecha = new Date();
    }
    public int getFolio() {
        return folio;
    } 

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getDescripción() {
        return descripcion;
    }

    public void setDescripción(String descripción) {
        this.descripcion = descripción;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente(Cliente cliente){
        return cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public ItemFactura[] getItemsFactura(){
        return items;
    }



    //Methods

    public void AddItemFactura(ItemFactura item){
        if(indiceItems < MAX_ITEMS){
            this.items[indiceItems++] = item;
        }

    }


    public Double calcularTotal(){
        return 0D;
    }

    public String verDetalle(){
        return "";
    }


}
