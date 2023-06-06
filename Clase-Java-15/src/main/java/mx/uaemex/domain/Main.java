package mx.uaemex.domain;

import mx.uaemex.entities.Alumno;
import mx.uaemex.services.AlumnoService;

/**
 *
 * @author Angel Franco
 */

public class Main {
    public static void main(String[] args) {
        AlumnoService servicio = new AlumnoService();
        
        Alumno alumno = servicio.buscar(100);
        System.out.println("alumno = " + alumno);
        
//        Alumno nuevo = new Alumno(null, "Julio", 25);
//        servicio.agregar(nuevo);

        servicio.actualizar(new Alumno(19, "Juan", 29));
        servicio.eliminar(new Alumno(12, "", 0));
        servicio.listar().forEach(System.out::println);
        
    }
}
