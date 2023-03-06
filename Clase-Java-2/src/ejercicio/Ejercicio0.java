package ejercicio;

import java.io.*;

/**
 *
 * @author asebastian36
 */

public class Ejercicio0 {
    //  pasar el texto del archivo a una cadena y mandarla a salida estandar
    public static void main(String[] args) {
        try (Reader r = new FileReader("/home/asebastian36/Organizacion-archivos/Clase-Java-2/Archivos/archivo.txt")) {
            String cadena = "";
            while(r.ready()) {
                cadena = cadena + (char) r.read();
            }
            
            System.out.println(cadena);
            
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        
    }
}
