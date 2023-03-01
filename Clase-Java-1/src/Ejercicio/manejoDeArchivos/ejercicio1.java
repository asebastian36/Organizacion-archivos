package Ejercicio.manejoDeArchivos;

import java.io.File;

/**
 *
 * @author asebastian36
 */
public class ejercicio1 {

    public static void main(String[] args) {
        //  listar contenido de un directorio
        File file = new File("/home/asebastian36/Organizacion-archivos/archivos");
        
        file.mkdir();
        
        recorrido(file.listFiles());
        
        eliminar(file.listFiles());
    }

    public static void recorrido(File files[]) {
        for(File file : files) {
            if (file.isFile()) System.out.println(file.getName());
            else {
                System.out.println("ruta de la carpeta " + file.getAbsolutePath());
                recorrido(file.listFiles());
            }
        }
        
    }
    
    public static void eliminar(File files[]) {
        for(File file : files) {
            if(file.isDirectory() && file.length() > 0) eliminar(file.listFiles());
            
            file.delete();
        }
    }
    
    //  tarea investigar como leer un archivo de texto plano
}
