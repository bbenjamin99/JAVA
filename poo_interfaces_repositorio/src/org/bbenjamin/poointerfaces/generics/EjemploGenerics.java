package org.bbenjamin.poointerfaces.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bbenjamin.poointerfaces.modelo.Cliente;

public class EjemploGenerics {
    public static void main(String[] args) {
        
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Benjamin", "Benitez") );  
        
        Cliente benjamin = clientes.iterator().next();

        Cliente[] clientesArray = {new Cliente("Benjamin", "Benitez"),
         new Cliente("Ronalda", "Deluca")  }; 

        Integer[] enteros = {1,2,3};

        Character[] caracteres = {'a', 'b' , 'c', 'd'};

        List<Cliente> clientes2 = fromArrayToList(clientesArray);
        List<Integer> enterosToList = fromArrayToList(enteros);
        List<Character> charToList = fromArrayToList(caracteres);

        clientes2.forEach(System.out::println);
        enterosToList.forEach(System.out::println);
        charToList.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[]{"Benjamin", "Emanuel", "Benitez", "Mica", "Marta"}, enterosToList);
    }   

    public static <T> List<T> fromArrayToList(T[] clients){

        return Arrays.asList(clients);
    }

    public static <T, G> List<T> fromArrayToList(T[] clients, G[] g){

        for(G element : g){
            System.out.println(element);
        }

        return Arrays.asList(clients);
    }
}
