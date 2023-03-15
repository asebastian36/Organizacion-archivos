package mx.uaem.services;

import java.util.ArrayList;
import java.util.List;
import mx.uaem.SociedadRepositoryImpl;

/**
 *
 * @author asebastian36
 */
public class SociedadServiceImpl implements ISociedadService {

    SociedadRepositoryImpl sociedades = new SociedadRepositoryImpl();

    @Override
    public List<String> obtenMayus() {
        List<String> resultado = new ArrayList<>();
        sociedades.obtenTodo().forEach(linea -> {
            String lineas[] = linea.split("\t");
            String formato = lineas[0] + " " + lineas[1].toUpperCase() + " " + lineas[2].toUpperCase();
            resultado.add(formato);
        });
        return resultado;
    }

    @Override
    public List<String> obtenMinus() {
        List<String> resultado = new ArrayList<>();
        sociedades.obtenTodo().forEach(linea -> {
            String lineas[] = linea.split("\t");
            String formato = lineas[0] + " " + lineas[1].toLowerCase() + " " + lineas[2].toLowerCase();
            resultado.add(formato);
        });
        return resultado;
    }

}
