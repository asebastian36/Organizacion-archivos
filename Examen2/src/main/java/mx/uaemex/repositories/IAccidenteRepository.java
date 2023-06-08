package mx.uaemex.repositories;

import java.util.List;
import mx.uaemex.entities.AccidenteBicicleta;

/**
 *
 * @author Angel Franco
 */

public interface IAccidenteRepository {
    List<AccidenteBicicleta> listar();
    AccidenteBicicleta buscar(Integer id);
    List<AccidenteBicicleta> buscar(String dia);
    void agregar(AccidenteBicicleta accidente);
    void eliminar(AccidenteBicicleta accidente);
    List<String> leer();
}
