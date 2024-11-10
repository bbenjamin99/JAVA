package org.bbenjamin.poointerfaces.repositorio;

import java.util.List;

import org.bbenjamin.poointerfaces.models.Cliente;

public interface PaginableRepositorio {

    List<Cliente> listar(int desde, int hasta);
}
