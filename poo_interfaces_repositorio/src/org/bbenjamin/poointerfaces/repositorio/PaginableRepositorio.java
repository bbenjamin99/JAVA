package org.bbenjamin.poointerfaces.repositorio;

import org.bbenjamin.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
