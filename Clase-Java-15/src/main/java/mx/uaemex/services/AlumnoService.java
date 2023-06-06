package mx.uaemex.services;

import java.util.List;
import mx.uaemex.entities.Alumno;
import mx.uaemex.reporitories.AlumnoRepository;
import mx.uaemex.reporitories.IAlumnoRepository;

/**
 *
 * @author Angel Franco
 */

public class AlumnoService {
    private IAlumnoRepository repositorio;
    
    public AlumnoService() {
        this.repositorio = new AlumnoRepository();
    }
    
    public List<Alumno> listar() {
        return repositorio.listar();
    }
    
    public Alumno buscar(Integer id) {
        return repositorio.buscar(id);
    }
    
    public void agregar(Alumno alumno) {
        repositorio.agregar(alumno);
    }
    
    public void actualizar(Alumno alumno) {
        if (repositorio.buscar(alumno.id()) != null) repositorio.actualizar(alumno);
        else System.out.println("Registro no encontrado");
    }
    
    public void eliminar(Alumno alumno) {
        if(repositorio.buscar(alumno.id()) != null) repositorio.eliminar(alumno);
        else System.out.println("Registro no encontrado");
    }
}
