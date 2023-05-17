package mx.uaem;

import java.io.*;
import java.util.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Angel Franco
 */

public class Ejercicio {
    /*
        Dejar con un buen formato el excel
    */
    
    public List<String> leer() throws FileNotFoundException, IOException {
        List<String> info = new ArrayList<>();
        FileInputStream file = new FileInputStream("C:\\Organizacion-archivos\\Clase-Java-13\\Archivos\\AccidentesBicicletas.xlsx");
        Workbook libro = new XSSFWorkbook(file);
        
        Sheet hoja = libro.getSheetAt(0);
        
        for (int i = 0; i < hoja.getLastRowNum(); i++) {
            Row fila = hoja.getRow(i);
            for (int j = 0; j < hoja.getLastRowNum(); j++) {
                Cell celda = fila.getCell(j);
                info.add(celda.toString());
            }
        }
        return info;
    }
}
