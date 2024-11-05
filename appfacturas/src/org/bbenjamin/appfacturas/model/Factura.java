package org.bbenjamin.appfacturas.model;

import java.text.SimpleDateFormat;
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
        Double total = 0.0D;
        for( ItemFactura item : this.items) {
            if(items != null)continue;

            total += item.calcularImporte();
        }
        return total;
    }

    public String verDetalle(){
        StringBuilder sb = new StringBuilder("Factura Numero: " + this.folio + "\n");
        SimpleDateFormat df = new SimpleDateFormat("dd 'De' MMMM, yyyy");
        sb.append("Fecha emision: " + df.format(this.fecha) + "\n");
        sb.append(this.folio + "\n")
        .append("Cliente: " + this.cliente.getNombre() +  "\n")
        .append( "NIF : " + this.cliente.getNif() + "\n")
        .append("Descripcion: " + this.descripcion + "\n")
        .append("#\tnombre\t$\tCant.\tTotal\n");




        for(ItemFactura item : this.items){
            if( item == null)continue;
            sb.append(item.getProducto().getCodigo())
            .append("\t")
            .append(item.getProducto().getNombre() + "\t")
            .append(item.getProducto().getPrecio() + "\t")
            .append(item.getCantidad() + "\n");
            
        }
        sb.append("Total: " + calcularTotal() + "\n"); 
        System.out.println("\n");


        return sb.toString();
    }


}
