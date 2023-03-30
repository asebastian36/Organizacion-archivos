package domain;

import java.io.IOException;
import java.util.List;
import services.Service;

/**
 *
 * @author Angel Franco
 */

public class Ejercicio {
    public static void main(String[] args) throws IOException {
        char a ='a';
        
        if ("a".equals('a')) {
            System.out.println("igual");
        }
        
        List<String> archivo = Service.obtenTodo();
        List<String> nombres = Service.obtenNombres(archivo);
        List<String> nombresFormato = Service.formatoNombres(nombres);
        Service.vocalesConsonantes(nombresFormato);
    }
}
