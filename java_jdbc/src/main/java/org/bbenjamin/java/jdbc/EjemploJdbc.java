package org.bbenjamin.java.jdbc;

import org.bbenjamin.java.jdbc.util.ConexionDb;

import java.sql.*;

public class EjemploJdbc {
    public static void main(String[] args) {

        try(
        Connection conn = ConexionDb.getInstance();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery("SELECT * FROM productos"))) {

            while (result.next()){
                System.out.print("ID = " + result.getInt(1) + "\t |");
                System.out.print(result.getString("nombre") + "\t |" );
                System.out.print(result.getString("precio") + "\t |" );
                System.out.println(result.getDate("fecha_registro") + "\t | " );
            } catch(){
            }
        }


        }
    }

