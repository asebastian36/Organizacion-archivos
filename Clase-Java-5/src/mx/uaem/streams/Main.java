package mx.uaem.streams;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asebastian36
 */

public class Main {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("1");
        lista.add("2");
        lista.add("3");

        //  pasar los valores a entero con streams
        int numeros = lista
                .stream()
                .mapToInt(Integer::parseInt)
                .sum();
        
        //  convencionalmente
        int suma = 0;
        for(String elemento : lista) suma += Integer.parseInt(elemento);
        System.out.println(suma);
    }
}
