package mx.uaemex.reporitories;

import java.util.List;
import mx.uaemex.entities.Alumno;

/**
 *
 * @author Angel Franco
 */

public interface IAlumnoRepository {
    List<Alumno> listar();
    Alumno buscar(Integer id);
    void agregar(Alumno alumno);
}
