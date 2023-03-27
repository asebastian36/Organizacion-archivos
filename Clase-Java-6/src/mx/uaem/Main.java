package mx.uaem;

import java.util.List;
import mx.uaem.services.Services;

/**
 *
 * @author Angel Franco
 */

public class Main {
    public static void main(String[] args) {
        Services servicio = new Services();
        
        List<String> todo = servicio.obtenTodo();
        List<String> nombres = servicio.obtenNombres(todo);
        //  nombres.forEach(System.out::println);
        
        System.out.println(servicio.cantidadNombres(nombres));
        
        List<String> finalisimo = servicio.formatoNombres(nombres);
        // finalisimo.forEach(System.out::println);
        servicio.buscar(finalisimo, "linda");
        
        List<String> formato = servicio.capitalizar(finalisimo);
        formato.forEach(System.out::println);
        
    }
}
