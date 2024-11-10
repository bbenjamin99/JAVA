package org.bbenjamin.poointerfaces.repositorio;

import java.util.List;

import org.bbenjamin.poointerfaces.models.Cliente;

public interface CrudRepositorio {

    List<Cliente> listar();
    Cliente porId(Integer id);
    void crearCliente(Cliente cliente);
    void editarCliente(Cliente cliente);
    void eliminarCliente(Integer id);
}
