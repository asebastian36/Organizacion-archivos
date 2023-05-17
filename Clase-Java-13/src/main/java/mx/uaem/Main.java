package mx.uaem;

import java.io.IOException;
import java.util.List;


/**
 *
 * @author Angel Franco
 */

public class Main {
    public static void main(String[] args) throws IOException {
        Ejercicio instancia = new Ejercicio();
        
        List<String> excelSeparado = instancia.leer();
        excelSeparado.forEach(System.out::println);
    }
}
