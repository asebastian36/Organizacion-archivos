package mx.uaem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

/**
 *
 * @author asebastian36
 */
public class main {

    public static void main(String[] args) {
        File file = new File("/home/asebastian36/Organizacion-archivos/Clase-Java-3/Archivos/sociedades.txt");
        try (Scanner sc = new Scanner(file, Charset.forName("ISO-8859-1"));) {
            //  definir como delimitar el token
            //  sc.useDelimiter(" ");

            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }

        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

}
