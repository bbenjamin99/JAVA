package org.bbenjamin.pooclasesabstractas.form.validador;

abstract public class Validador {
    protected String mensaje;

    //Get Set
    abstract public void setMensaje(String mensaje);
    abstract public String getMensaje();

    //Methods
    abstract public boolean esValido(String valor);
}
