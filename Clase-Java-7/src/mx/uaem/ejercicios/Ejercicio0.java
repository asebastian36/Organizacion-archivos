package mx.uaem.ejercicios;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Angel Franco
 */

public class Ejercicio0 {
    public static String getNombre() throws FileNotFoundException, IOException {
        //  escribir nombre en el archivo
        FileOutputStream flujo = new FileOutputStream("C:\\Organizacion-archivos\\Clase-Java-7\\Archivos\\recurso.txt", true);
        String nombre = "\nFranco Lopez Angel Sebastian";
        flujo.write(nombre.getBytes());
        flujo.close();
        return nombre;
    }
}
