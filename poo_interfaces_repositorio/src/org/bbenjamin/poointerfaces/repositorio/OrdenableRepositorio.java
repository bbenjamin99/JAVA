package org.bbenjamin.poointerfaces.repositorio;

import java.util.List;

import org.bbenjamin.poointerfaces.models.Cliente;

public interface OrdenableRepositorio  {
    List<Cliente> listar(String campo, Enum dir);
}
