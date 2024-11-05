package org.bbenjamin.appfacturas;

import java.util.Scanner;

import org.bbenjamin.appfacturas.model.*;

public class EjemploFactura {
    public static void main(String[] args){

        //Cliente de ejemplo
        Cliente cliente1 = new Cliente();
        cliente1.setNif("20-42536814-2");
        cliente1.setNombre("Benjamin Benitez");

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la Descricpion de la factura: ");
        String descripcion = scan.nextLine();
        Factura factura1 = new Factura(descripcion, cliente1); 
        Producto producto;
        String nombre;
        double precio;
        int cantidad;

        System.out.println("\n");

        for(int i = 0; i < 5; i++){
            producto = new Producto();
            System.out.print("Ingrese Producto N " + producto.getCodigo());
            nombre = scan.nextLine();
            producto.setNombre(nombre);
            System.out.print("Ingrese el Precio:");
            precio = scan.nextDouble();
            producto.setPrecio(precio);

            System.out.print("Ingrese la cantidad:");
            cantidad = scan.nextInt();

            ItemFactura item = new ItemFactura(cantidad, producto); 
            factura1.AddItemFactura(item);

            System.out.println("\n");
            scan.nextLine();
        }

        System.out.println(factura1.verDetalle());
















    }
}
