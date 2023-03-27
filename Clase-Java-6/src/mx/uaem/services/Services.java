package mx.uaem.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Angel Franco
 */

public class Services {
    
    public List<String> obtenTodo() {
        try {
            List<String> lineas = Files.readAllLines(Paths.get("C:\\Organizacion-archivos\\Clase-Java-6\\archivos\\nombres.txt"));
            return lineas;
            
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    public List<String> obtenNombres(List<String> lista) {
        List<String> nombres = new ArrayList<>();
        lista.forEach(linea -> {
            String separaciones[] = linea.split(",");
            for(String nombre : separaciones) nombres.add(nombre);
        });
        
        return nombres;
    }
    
    public int cantidadNombres(List<String> nombres) {
        return nombres.size();
    }
    
    public void buscar(List<String> nombres, String nombre) {
        for(String linea : nombres) {
            if(linea.equals(nombre.toUpperCase())){
                    System.out.println("encontrado");
                }
        }
    }
    
    public List<String> formatoNombres(List<String> nombres) {
        List<String> nombreFormateado = new ArrayList<>();
        nombres.forEach(nombre -> {
            nombreFormateado.add(nombre.replace("\"", ""));
        });
        
        return nombreFormateado;
    }
    
    public List<String> capitalizar(List<String> nombres) {
        List<String> nombreFormateado = new ArrayList<>();
        nombres.forEach(nombre -> {
            Character inicial = nombre.charAt(0);
            
            String nuevaCadena = inicial.toString().toUpperCase() + nombre.substring(1).toLowerCase();
            nombreFormateado.add(nuevaCadena);
        });
        
        return nombreFormateado;
    }
}
