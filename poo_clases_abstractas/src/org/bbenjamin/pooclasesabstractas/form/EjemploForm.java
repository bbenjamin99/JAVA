package org.bbenjamin.pooclasesabstractas.form;

import org.bbenjamin.pooclasesabstractas.form.elementos.*;
import org.bbenjamin.pooclasesabstractas.form.elementos.select.Opcion;

public class EjemploForm {
    public static void main(String[] args) {
       
        InputForm username = new InputForm("Nombre de usuario", "text");  
        InputForm password = new InputForm("Contraseña", "password");
        InputForm email = new InputForm("Email", "email");
        InputForm edad = new InputForm("Edad", "number");

        TextareaForm textarea = new TextareaForm("Mensaje", 10,10);

        SelectForm lenguaje = new SelectForm("Lenguaje");
        Opcion java = new Opcion("1", "Java");
        Opcion python = new Opcion("2", "Python");
        Opcion javascript = new Opcion("3", "Javascript");
        Opcion typescript = new Opcion("4", "Typescript");
        Opcion php = new Opcion("5", "PHP");
        lenguaje.addOpcion(java);
        lenguaje.addOpcion(python);
        lenguaje.addOpcion(javascript);
        lenguaje.addOpcion(typescript);
        lenguaje.addOpcion(php);

        username.setValor("Benjamin.Benitez");
        password.setValor("a1b2c3");
        email.setValor("bbenjamin@corre.com");
        edad.setValor("25");

        java.setSelected(true);

        




    }
    
}
