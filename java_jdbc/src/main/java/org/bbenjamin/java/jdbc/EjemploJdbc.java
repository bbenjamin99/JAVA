package org.bbenjamin.java.jdbc;

import org.bbenjamin.java.jdbc.models.Producto;
import org.bbenjamin.java.jdbc.repositorio.ProductoRepositorioImp;
import org.bbenjamin.java.jdbc.repositorio.Repositorio;
import org.bbenjamin.java.jdbc.util.ConexionDb;

import java.sql.*;

public class EjemploJdbc {
    public static void main(String[] args) {
        try(
        Connection conn = ConexionDb.getInstance()) {
            Repositorio<Producto> repositorio = new ProductoRepositorioImp();

            repositorio.listar().forEach( System.out::println  );
            System.out.println(repositorio.buscarPorId(2L));


        } catch(SQLException e){

            e.printStackTrace();
            }


        }

}


