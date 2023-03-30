package services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Angel Franco
 */

public class Service {
    public static List<String> obtenTodo() throws IOException {
            List<String> texto = Files.readAllLines(Paths.get("C:\\Organizacion-archivos\\Examen\\archivos\\nombres.txt"));
            return texto;
    }
    
    public static List<String> obtenNombres(List<String> lista) {
        List<String> nombres = new ArrayList<>();
        lista.forEach(linea -> {
            String separaciones[] = linea.split(",");
            for(String nombre : separaciones) nombres.add(nombre);
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
    
    public static void vocalesConsonantes(List<String> listaNombres) {
        listaNombres.forEach(nombre -> {
            int vocales = 0;
            
            vocales = Service.vocales(nombre);
            
            int consonantes = (nombre.length()) - vocales;
            System.out.println(nombre + ":");
            System.out.println("\tvocales: " + vocales);
            System.out.println("\tconsonantes: " + consonantes);
        });
    }
    
    private static int vocales(String nombre) {
        int vocales = 0;
        for (int i = 0; i < nombre.length(); i++) {
            if (nombre.charAt(i) == 'A' 
            || nombre.charAt(i) == 'E' 
            || nombre.charAt(i) == 'I'
            || nombre.charAt(i) == 'O'
            || nombre.charAt(i) == 'U') {
                vocales++;
            }
            
        }
        
        return vocales;
    }
}
