package mx.uaem;

import java.io.IOException;
import java.util.logging.*;

/**
 *
 * @author Angel Franco
 */

public class Main {
    //  obtener el nombre de la clase
    public static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    
    public static void main(String[] args) throws IOException {
        Handler fileHandler = new FileHandler("C:\\Organizacion-archivos\\Clase-Java-12\\Archivos\\archivo.log");
        //  cambiar el formato del handler
        fileHandler.setFormatter(new SimpleFormatter());
        LOGGER.addHandler(fileHandler);
        //  para evitar que escriba en salida estandar
        LOGGER.setUseParentHandlers(false);
        LOGGER.log(Level.INFO, "Hola mundo");

        fileHandler.flush();
    }
}
