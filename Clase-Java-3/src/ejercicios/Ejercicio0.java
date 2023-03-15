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
public class Ejercicio0 {

    public static void main(String[] args) {
        /**
         * Separar el archivo por tokens y mandar su longitud
         */
        File file = new File("/home/asebastian36/Organizacion-archivos/Clase-Java-3/Archivos/sociedades.txt");
        try (Scanner sc = new Scanner(file, Charset.forName("ISO-8859-1"));) {

            int contador = 0;

            while (sc.hasNext()) {
                String token = sc.next();
                System.out.print(token);
                System.out.print(" -> " + token.length());
                System.out.println("");
                contador++;
            }

            System.out.println(contador);

        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

}
