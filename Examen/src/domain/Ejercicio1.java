package domain;

import java.io.IOException;
import java.util.List;
import services.Service1;

/**
 *
 * @author Angel Franco
 */

public class Ejercicio1 {
    public static void main(String[] args) throws IOException {
        List<String> archivo = Service1.obtenTodo();
        List<String> nombres = Service1.obtenNombres(archivo);
        List<String> nombresFormato = Service1.formatoNombres(nombres);
        Service1.analisisFrecuencia(nombresFormato);
    }
}
