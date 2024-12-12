package org.bbenjamin.java.jdbc.util;

import java.sql.*;

public class ConexionDb {

    private static String url = "jdbc:mysql://localhost:3306/java_curso?serverTimeZone=UTC";
    private static String username = "root";
    private static String password = "root";

    private static Connection connection;


   public static Connection getInstance()throws SQLException {
       if(connection == null) {
           connection = DriverManager.getConnection(url, username, password);
       }

       return connection;
   }
}
