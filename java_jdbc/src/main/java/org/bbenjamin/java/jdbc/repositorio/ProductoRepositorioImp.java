package org.bbenjamin.java.jdbc.repositorio;

import org.bbenjamin.java.jdbc.models.Producto;
import org.bbenjamin.java.jdbc.util.ConexionDb;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoRepositorioImp implements Repositorio<Producto> {

    private Connection getConnection() throws SQLException {
        return ConexionDb.getInstance();
    }

    @Override
    public List<Producto> listar() {
        List<Producto> productos = new ArrayList<>();

        try(Statement stmt = getConnection().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM productos")){
            while(rs.next()){
                Producto p = crearProducto(rs);

                productos.add(p);
            }
            }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return productos;
    }



    @Override
    public Producto buscarPorId(Long id) {
        Producto p = null;

        try (PreparedStatement stmt = getConnection().
                prepareStatement("SELECT * FROM productos WHERE id = ? ")) {

            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                p = crearProducto(rs);

            }

            rs.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return p;
    }

    @Override
    public void guardar(Producto producto) {
        String sql = null;
        if (producto.getId()  != null && producto.getId() > 0) {
            sql = "UPDATE productos SET nombre=?, precio=? WHERE id=?";
        } else {
            sql = "INSERT INTO productos(nombre, precio, fecha_registro) VALUES(?,?,?)";
        }
        try(PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            stmt.setString(1, producto.getNombre() );
            stmt.setLong(2, producto.getPrecio() );

            if (producto.getId()  != null && producto.getId() > 0) {
                stmt.setLong(3, producto.getId());
            } else {

                stmt.setDate(3, new Date(producto.getFechaRegistro().getTime() ));
            }

            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void modificar(Producto producto) {

    }

    @Override
    public void eliminar(Long id) {

    }

    private static Producto crearProducto(ResultSet rs) throws SQLException {
        Producto p = new Producto();
        p.setId(rs.getLong("id"));
        p.setNombre(rs.getString("nombre"));
        p.setPrecio(rs.getInt("precio"));
        p.setFechaRegistro(rs.getDate("fecha_registro"));
        return p;
    }
}
