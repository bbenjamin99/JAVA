package org.bbenjamin.anotaciones.ejemplo;

import org.bbenjamin.anotaciones.ejemplo.models.Producto;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.Arrays;

public class EjemploAnotacion {
    public static void main(String[] args) {

        Producto p = new Producto();
        p.setFecha(LocalDate.now());
        p.setNombre("Mesa de Centro roble");
        p.setPrecio(1000L);

        Field[] atributos = p.getClass().getDeclaredFields();

           String json =  Arrays.stream(atributos).filter(f -> f.isAnnotationPresent(JsonAtributo.class) )
                    .map( f -> {
                    f.setAccessible(true);

                    String nombre = f.getAnnotation(JsonAtributo.class).nombre().equals("")
                            ? f.getName()
                            : f.getAnnotation(JsonAtributo.class).nombre();

                    try {
                        return "\"  " + nombre + "\":\"" + f.get(p) + "\" ";
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                })
                .reduce("{", (a,b) ->  {
                    if("{".equals(a)){
                        return a+b;
                    } else {
                        return a + ", " + b;
                    }
                }).concat("}");

        System.out.println("json = " + json);
    }
}
