package mx.uaemex.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Angel Franco
 */

public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/escuela?useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "L4c1b0rgv4c4#";
    private static Connection conexion;
    
    public static Connection getInstance() throws SQLException {
        if(conexion == null) {
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            return conexion;
        }
        
        return conexion;
    }
}
