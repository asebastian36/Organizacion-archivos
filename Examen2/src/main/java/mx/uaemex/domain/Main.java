package mx.uaemex.domain;

import java.util.List;
import mx.uaemex.entities.AccidenteBicicleta;
import mx.uaemex.services.AccidenteService;

/**
 *
 * @author Angel Franco
 */

public class Main {
    public static void main(String[] args) {        
       AccidenteService servicio = new AccidenteService();
       List<String> lista = servicio.leer();
       
//       lista.forEach(System.out::println);
//       
//       servicio.agregarRegistros(lista);
       List<AccidenteBicicleta> listaFinal = servicio.listar();
       //   listaFinal.forEach(System.out::println);
       
       List<AccidenteBicicleta> martes = servicio.buscar("martes");
       martes.forEach(System.out::println);
    }
}
