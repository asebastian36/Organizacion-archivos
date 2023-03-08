package mx.uaem.service;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;
import mx.uaem.entities.Sociedad;

/**
 *
 * @author asebastian36
 */
public class SociedadService {

    public List<Sociedad> obtenTodos() {

        List<Sociedad> lista = new ArrayList<>();
        //  latin-1 es el nombre del charset
        try (Reader r = new FileReader("/home/asebastian36/Organizacion-archivos/Clase-Java-2/Archivos/sociedades.txt", Charset.forName("ISO-8859-1")); BufferedReader buffer = new BufferedReader(r)) {
            while (buffer.ready()) {
                lista.add(StringToSociedad(buffer));
            }
        } catch (IOException ex) {
            throw new RuntimeException();
        }

        return lista;

    }

    public Sociedad StringToSociedad(BufferedReader buffer) throws IOException {
        String sociedad[] = buffer.readLine().split("\t");
        return new Sociedad(sociedad[0], sociedad[1], sociedad[2]);
    }

    public List<Sociedad> buscaId(String id) {
        List<Sociedad> lista = obtenTodos();
        List<Sociedad> resultados = new ArrayList<>();

            for (Sociedad sociedad : lista)
                if (sociedad.getId().equals(id)) resultados.add(sociedad);        

        return resultados;
    }
    
    public List<Sociedad> buscaNombre(String nombre) {
        List<Sociedad> lista = obtenTodos();
        List<Sociedad> resultados = new ArrayList<>();

            for (Sociedad sociedad : lista)
                if (sociedad.getNombre().equals(nombre)) resultados.add(sociedad);        

        return resultados;
    }
}
