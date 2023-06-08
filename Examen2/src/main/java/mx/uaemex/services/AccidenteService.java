package mx.uaemex.services;

import java.util.List;
import mx.uaemex.entities.AccidenteBicicleta;
import mx.uaemex.repositories.AccidenteRepository;

/**
 *
 * @author Angel Franco
 */

public class AccidenteService {
    AccidenteRepository repositorio = new AccidenteRepository();
    
    public List<AccidenteBicicleta> listar() {
        return repositorio.listar();
    }
    
    public AccidenteBicicleta buscar(Integer id) {
        return repositorio.buscar(id);
    }
    
    public void agregar(AccidenteBicicleta accidente) {
        repositorio.agregar(accidente);
    }
    
    public void eliminar(AccidenteBicicleta accidente) {
        repositorio.eliminar(accidente);
    }
    
    public List<AccidenteBicicleta> buscar(String dia) {
        return repositorio.buscar(dia);
    }
    
    public List<String> leer() {
        return repositorio.leer();
    }
    
    public void agregarRegistros(List<String> lista) {
        repositorio.agregarRegistros(lista);
    }
}
