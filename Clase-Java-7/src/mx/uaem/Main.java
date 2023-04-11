package mx.uaem;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import mx.uaem.ejercicios.Ejercicio0;

/**
 *
 * @author Angel Franco
 */

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //  escribir en un archivo
        FileOutputStream canal = new FileOutputStream("C:\\Organizacion-archivos\\Clase-Java-7\\Archivos\\recurso.txt");
        String mensaje = "Hola mundo =-D\ndesde\nJava";
        canal.write(mensaje.getBytes());
        canal.close();
        
        String nombre = Ejercicio0.getNombre();

        //  leer el archivo en consola
        List<String> texto = Files.readAllLines(Paths.get("C:\\Organizacion-archivos\\Clase-Java-7\\Archivos\\recurso.txt"));
        texto.forEach(System.out::println);
    }
}
