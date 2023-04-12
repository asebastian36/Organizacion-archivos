package mx.uaem;

import domain.Persona;
import java.util.List;
import static mx.uaem.services.EjercicioMultas.crearArchivosAlfabeticamente;
import static mx.uaem.services.EjercicioMultas.getNombres;
import static mx.uaem.services.EjercicioMultas.getObjetos;
import static mx.uaem.services.EjercicioMultas.ordenarLista;

/**
 *
 * @author Angel Franco
 */
public class Main {

    public static void main(String[] args) {
        List<String> lista = getNombres();        
        List<Persona> personas = getObjetos(lista);
        ordenarLista(personas);
        crearArchivosAlfabeticamente(personas);
    }
}
