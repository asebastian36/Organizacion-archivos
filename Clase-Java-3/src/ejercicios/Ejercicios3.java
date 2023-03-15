package ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

/**
 *
 * @author asebastian36
 */

public class Ejercicios3 {
    public static void main(String[] args) {
        /**
         * Mandar a salida estandar el nombre y el pais en mayusculas
         */
        File file = new File("/home/asebastian36/Organizacion-archivos/Clase-Java-3/Archivos/sociedades.txt");
        try(Scanner sc = new Scanner(file, Charset.forName("ISO-8859-1"));) {
            //  definir como delimitar el token
            //  sc.useDelimiter(" ");
                        
            while(sc.hasNext()) {
                String linea = sc.nextLine();
                String division[] = linea.split("\t");
                
                System.out.println(division[0] + " " + division[1].toUpperCase() + " " +  division[2].toLowerCase());
                
            }
                        
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
