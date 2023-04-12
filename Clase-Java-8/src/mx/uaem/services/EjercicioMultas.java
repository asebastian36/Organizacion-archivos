package mx.uaem.services;

import domain.Persona;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;

/**
 *
 * @author Angel Franco
 */

public class EjercicioMultas {

    public static List<String> getNombres() {
        List<String> archivo = new LinkedList<>();
        try {
            archivo = Files.readAllLines(Paths.get("C:\\Organizacion-archivos\\Clase-Java-8\\Archivos\\multas.txt"));
            return archivo;
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return archivo;
    }

    public static List<Persona> getObjetos(List<String> nombres) {
        List<Persona> personas = new ArrayList<>();
        for (int i = 0; i < nombres.size(); i++) {
            if (i > 0) {
                String[] separacion = nombres.get(i).split("\\|");
                Persona persona = new Persona(separacion[0], separacion[1], separacion[2], Double.parseDouble(separacion[3]));
                personas.add(persona);
            }
        }
        return personas;
    }

    public static void ordenarLista(List<Persona> personas) {
        Collections.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p1.getNombre().compareTo(p2.getNombre());
            }
        });
    }

    public static void crearArchivosAlfabeticamente(List<Persona> personas) {
        //  solo funciona si ya esta ordenado
        List<Character> letrasArchivo = new LinkedList<>();
        personas.forEach(persona -> {
            String nombre = persona.getNombre();

            if (!(letrasArchivo.contains(nombre.charAt(0)))) {
                letrasArchivo.add(nombre.charAt(0));
            }
            try {
                FileOutputStream file = new FileOutputStream("C:\\Organizacion-archivos\\Clase-Java-8\\Archivos\\Personas\\" + nombre.charAt(0), true);
                BufferedOutputStream buffer;
                buffer = new BufferedOutputStream(file);
                String salida = persona.getId() + " " + persona.getNombre() + " " + persona.getTipo() + " " + persona.getImporte() + "\n";
                buffer.write(salida.getBytes());
                buffer.flush();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
    }
}
