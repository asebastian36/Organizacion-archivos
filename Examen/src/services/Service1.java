package services;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;
/**
 *
 * @author Angel Franco
 */
public class Service1 {
    
    /*
        Ejemplo

        PATRICIA:
        P: 1
        A: 2
        T: 1
        R: 1
        I: 2
        C: 1
     */
    
    public static List<String> obtenTodo() throws IOException {
        List<String> texto = Files.readAllLines(Paths.get("C:\\Organizacion-archivos\\Examen\\archivos\\nombres.txt"));
        return texto;
    }

    public static List<String> obtenNombres(List<String> lista) {
        List<String> nombres = new ArrayList<>();
        lista.forEach(linea -> {
            String separaciones[] = linea.split(",");
            for (String nombre : separaciones) {
                nombres.add(nombre);
            }
        });

        return nombres;
    }

    public static List<String> formatoNombres(List<String> nombres) {
        List<String> nombreFormateado = new ArrayList<>();
        nombres.forEach(nombre -> {
            nombreFormateado.add(nombre.replace("\"", ""));
        });

        return nombreFormateado;
    }

    public static void analisisFrecuencia(List<String> nombresFormateado) {
        nombresFormateado.forEach(nombre -> {
            System.out.println(nombre);
            Service1.contadorLetras(nombre);
        });
    }

    private static void contadorLetras(String nombre) {
        Set<String> mensajes = new LinkedHashSet<>();
        for (int i = 0; i < nombre.length(); i++) {
            int contador = 0;
            for (int j = 0; j < nombre.length(); j++) if (nombre.charAt(i) == nombre.charAt(j)) contador++;
            mensajes.add(nombre.charAt(i) + ": " + contador);
        }
        
        System.out.println(mensajes.toString());
    }
}
