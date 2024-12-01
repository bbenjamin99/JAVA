package org.bbenjamin.java8.lambda;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {
        
        Predicate<Integer> test = num -> num > 10; 

        boolean resultado = test.test(22);

        System.out.println(resultado);

        Predicate<String> t2 = role -> role.equals("ROLE_ADMIN"); 

        System.out.println(t2.test("ROLE_ADMIN"));

        BiPredicate<String, String> t3 = (a,b) -> a.equals(b);

        System.out.println(t3.test("3", "tres"));
    }
}
 