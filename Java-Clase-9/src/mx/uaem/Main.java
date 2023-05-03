package mx.uaem;

import java.io.IOException;
import java.nio.file.*;

/**
 *
 * @author Angel Franco
 */

public class Main {
    public static void main(String[] args) throws IOException {
        //  para escribir con write con un Path
        Path path = Paths.get("C:\\Organizacion-archivos\\Java-Clase-9\\Archivos\\hola.txt");
        Files.writeString(path, "Hola");
    }
}
