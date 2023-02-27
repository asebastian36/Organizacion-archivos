package mx.uaem;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author asebastian36
 */

public class principal {
    public static void main(String[] args) throws IOException {
        //  creando un archivo
        
        //  recibe la ruta del recurso, ruta o archivo a acceder
        //  si no se asigna una ruta se crea dentro del proyecto
        File file = new File("/home/asebastian36/Organizacion-archivos/archivos/archivo0.txt");
        
        //  pregunta relacionadas al archivo
        System.out.println("Se puede ejecutar? = " + file.canExecute());
        System.out.println("Se puede leer? = " + file.canRead());
        System.out.println("Se puede escribir? = " + file.canWrite());
        
        //  creando otro archivo
        
        //  crear un nuevo archivo, retorna true si se crea, retorna false sino
        System.out.println("Se creo el archivo? = " + file.createNewFile());
        System.out.println("Existe el nuevo archivo? = " + file.exists());
        
        File archivo = new File("/home/asebastian36/Organizacion-archivos/archivos/archivo1.txt");
        System.out.println("Se creo el archivo? = " + archivo.createNewFile());
        System.out.println("Existe? = " + archivo.exists());
        
        //  comparacion lexicografica que regresa un numero
        System.out.println("Se comparo file y archivo, el resultado es = " + file.compareTo(archivo));
        
        //  eliminar archivo, solo se elimina si tienes los permisos
        System.out.println(archivo.delete());
        
        //  deleteOnExit elimina cuando termine de ejecutarse
        //  file.deleteOnExit();
        
        //  para obtener la ruta absoluta
        String path = file.getAbsolutePath();
        System.out.println("path = " + path);
        
        //  obtener otro objeto
        File fileClon = file.getAbsoluteFile();
        
        //  path unico del s.o
        String pathCanonicoClon = fileClon.getCanonicalPath();
        System.out.println("pathCanonicoClon = " + pathCanonicoClon);
        
        String pathCanonico = file.getCanonicalPath();
        System.out.println("pathCanonico = " + pathCanonico);
        
        System.out.println("espacio libre del directorio en bytes = " + file.getFreeSpace());
        System.out.println("obtener la ruta del recurso = " + file.getParent());
        
        file.delete();
        
    }
}
