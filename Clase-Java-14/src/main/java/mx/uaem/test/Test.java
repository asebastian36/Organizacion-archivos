package mx.uaem.test;

import java.sql.*;
import java.util.*;
import mx.uaem.domain.Alumno;

/**
 *
 * @author Angel Franco
 */

public class Test {

    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/escuela?useSSL=false";
        String USER = "root";
        String PASSWORD = "L4c1b0rgv4c4#";

        Connection conexion = null;
        try {
            List<Alumno> alumnos = new ArrayList<>();
            Alumno alumno = null;
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement statement = conexion.createStatement();
            String nombre = "Alberto";
            int edad = 31;
            String insert = "insert into alumnos (nombre, edad) values ('" + nombre + "', "+ edad +")";
            int entero = statement.executeUpdate(insert);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
