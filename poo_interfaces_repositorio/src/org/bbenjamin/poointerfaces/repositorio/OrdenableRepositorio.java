package org.bbenjamin.poointerfaces.repositorio;

import org.bbenjamin.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);
}