package Ejercicio.manejoDeArchivos;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author asebastian36
 */
public class ejercicio0 {
    
    public static void main(String[] args) throws IOException {
        //  crear 3 archivos
        File archivo0 = new File("/home/asebastian36/Organizacion-archivos/archivos/archivos0.txt");
        File archivo1 = new File("/home/asebastian36/Organizacion-archivos/archivos/archivos1.txt");
        File archivo2 = new File("/home/asebastian36/Organizacion-archivos/archivos/archivos2.txt");

        archivo0.createNewFile();
        archivo1.createNewFile();
        archivo2.createNewFile();
        
        archivo0.delete();
        archivo1.delete();
        archivo2.delete();
    }
}
