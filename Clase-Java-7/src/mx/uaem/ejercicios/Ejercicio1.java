package mx.uaem.ejercicios;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author Angel Franco
 */

public class Ejercicio1 {
    public static void main(String[] args) throws IOException {
        Ejercicio1.getTablas();
        
        //  leer el archivo en consola
        List<String> texto = Files.readAllLines(Paths.get("C:\\Organizacion-archivos\\Clase-Java-7\\Archivos\\tablas.txt"));
        texto.forEach(System.out::println);
    }
    
    
/*
    Ejercicio tablas de multiplicar en un archivo
*/
    public static void getTablas() throws FileNotFoundException, IOException {
        //  escribir tablas de multiplicar en el archivo
        FileOutputStream flujo = new FileOutputStream("C:\\Organizacion-archivos\\Clase-Java-7\\Archivos\\tablas.txt");
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                String linea = (i + 1) + " x " + (j + 1) + " = " + ((i + 1) * (j + 1) + "\n");
                flujo.write(linea.getBytes());
            }
            flujo.write("\n".getBytes());
        }
        
        flujo.close();
    }
}
