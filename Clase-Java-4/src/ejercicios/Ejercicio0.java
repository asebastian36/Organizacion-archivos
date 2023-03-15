package ejercicios;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author asebastian36
 */
public class Ejercicio0 {

    public static void main(String[] args) {
        /**
         * Pasar nombre y pais a minusculas leyendo el archivo con files
         */

        try {
            List<String> lineas = Files.readAllLines(Paths.get("/home/asebastian36/Organizacion-archivos/Clase-Java-4/Archivos/sociedades.txt"), Charset.forName("ISO-8859-1"));
            lineas.forEach(linea -> {
                String renglones[] = linea.split("\t");
                System.out.println(renglones[0] + " " + renglones[1].toLowerCase() + "  " + renglones[2].toLowerCase());
            });
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
