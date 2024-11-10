package org.bbenjamin.poointerfaces.repositorio;

import org.bbenjamin.poointerfaces.models.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteListRepositorio implements CrudRepositorio,
        OrdenableRepositorio, PaginableRepositorio{

    private List<Cliente> dataSource;

    public ClienteListRepositorio(){
        this.dataSource = new ArrayList<>();
    }



    //Methods
    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    @Override
    public Cliente porId(Integer id) {
    Cliente clienteEncontrado = null;
        for(Cliente cliente : dataSource){
            if(cliente.getId().equals(id)){
                clienteEncontrado = cliente;
                break;
            }

        }
        return clienteEncontrado;
    }

    @Override
    public void crearCliente(Cliente cliente) {
        this.dataSource.add(cliente);
    }

    @Override
    public void editarCliente(Cliente cliente) {
    Cliente c = this.porId(cliente.getId());
    c.setNombre(cliente.getNombre() );
    c.setApellido(cliente.getApellido() );
    }

    @Override
    public void eliminarCliente(Integer id) {
        dataSource.remove(this.porId(id));
    }

    @Override
    public List<Cliente> listar(String campo, Enum dir) {
        dataSource.sort(new Comparator<Cliente>() {
            @Override
            public int compare(Cliente a, Cliente b){
                int resultado = 0;
                if(dir == Direccion.ASC){
                    switch(campo){
                        case "id" ->
                            resultado = a.getId().compareTo(b.getId());
                        case "nombre" ->
                            resultado = a.getNombre().compareTo(b.getNombre());
                        case "apellido" -> 
                            resultado = a.getApellido().compareTo(b.getApellido());
                    }
                } else if( dir == Direccion.DESC){
                    switch(campo){
                        case "id" ->
                            resultado = b.getId().compareTo(a.getId());
                        case "nombre" ->
                            resultado = b.getNombre().compareTo(a.getNombre());
                        case "apellido" -> 
                            resultado = b.getApellido().compareTo(a .getApellido());
                }
            }
            return resultado;
        }});
        return dataSource;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }
}
