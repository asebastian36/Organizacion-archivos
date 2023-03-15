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
public class Ejercicio4 {

    public static void main(String[] args) {
        File file = new File("/home/asebastian36/Organizacion-archivos/Clase-Java-3/Archivos/sociedades.txt");
        try (Scanner sc = new Scanner(file, Charset.forName("ISO-8859-1"));) {
            //  definir como delimitar el token
            //  sc.useDelimiter(" ");

            while (sc.hasNext()) {
                String linea = sc.nextLine();
                String division[] = linea.split("\t");
//                if(division[1].contains(" S.A.") || division[1].contains(" S.A. DE C.V.") || division[1].contains(" SA de C") || division[1].contains(" SAB de C.V.")
//                || division[1].contains(", S.A de C.V." || division[1].contains(" SA CV") || division[1].contains(" SA") || division[1].contains(" SA de CV")
//                || division[1].contains(" SA de") || division[1].contains(", S.A") || division[1].contains(", SA de") || division[1].contains(", S")))
                System.out.println(division[1]);
            }

        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
