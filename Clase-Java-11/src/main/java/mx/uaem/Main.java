package mx.uaem;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        List<String> excel = Ejercicio.leer();
        List<String> excelFormateado = Ejercicio.aplicarFormato(excel);
    }
}
