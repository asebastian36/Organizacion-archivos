package Ejercicio.manejoDeArchivos;

import java.io.File;

/**
 *
 * @author asebastian36
 */
public class ejercicio2 {
    /*
        Crear un metodo para escribir en salida estandar todo el contenido
        que se encuentra en la carpeta usuario del s.o
    */
    
    public static void main(String[] args) {
        File file = new File("/home/asebastian36");
        salida(file.listFiles());
    }
    
    public static void salida(File files []) {
        for(File file : files) {
            if (file.isDirectory() && file.length() > 0) {
                file.getName();
                salida(file.listFiles());
            }
            
            file.getName();
        }
    }
}
