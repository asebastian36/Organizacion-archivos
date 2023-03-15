package mx.uaem;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author asebastian36
 */
public class SociedadRepositoryImpl implements ISociedadRepository {

    @Override
    public List<String> obtenTodo() {
        try {
            List<String> lineas = Files.readAllLines(Paths.get("/home/asebastian36/Organizacion-archivos/Clase-Java-4/Archivos/sociedades.txt"), Charset.forName("ISO-8859-1"));
            return lineas;
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    }

}
