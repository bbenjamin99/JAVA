package org.bbenjamin.java8.lambda;

import org.bbenjamin.java8.lambda.aritmetica.Aritmetica;
import org.bbenjamin.java8.lambda.aritmetica.Calculadora;

public interface EjemploInterfaceFunctional {
    public static void main(String[] args) {
        
        Aritmetica suma = (a,b) ->  a+b;
        Aritmetica resta = (a,b) ->  a-b;
        Aritmetica multiplicacion = (a,b) ->  a*b;
        Aritmetica division = (a,b) ->  a/b;

        Calculadora calc = new Calculadora();

        System.out.println(calc.computar(2, 5, multiplicacion));
    }
}
