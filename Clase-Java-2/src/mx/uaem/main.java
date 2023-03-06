package mx.uaem;

import java.io.*;

/**
 *
 * @author asebastian36
 */

public class main {
    public static void main(String[] args) {
        try (Reader r = new FileReader("/home/asebastian36/Organizacion-archivos/Clase-Java-2/Archivos/archivo.txt");
                BufferedReader buffer = new BufferedReader(r)) {
            while(buffer.ready()) {
                System.out.print((char) buffer.read());
            }
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        
    }
}
