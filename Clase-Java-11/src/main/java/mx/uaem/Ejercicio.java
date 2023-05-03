package mx.uaem;

import java.io.*;
import java.util.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ejercicio {

    public static List<String> leer() throws FileNotFoundException, IOException {
        List<String> informacion = new ArrayList<>();
        FileInputStream file = new FileInputStream("C:\\Organizacion-archivos\\Clase-Java-11\\src\\Archivo\\AccidentesBicicletas.xlsx");
        Workbook libro = new XSSFWorkbook(file);

        //  leer la primera hoja
        Sheet hoja = libro.getSheetAt(0);

        for (int i = 0; i < hoja.getLastRowNum(); i++) {
            if (i != 0) {
                Row fila = hoja.getRow(i);
                for (int j = 0; j < fila.getLastCellNum(); j++) {
                    Cell celda = fila.getCell(j);
                    informacion.add(celda.toString());
                }
            }
        }

        return informacion;
    }

    public static List<String> aplicarFormato(List<String> info) {
        List<String> nuevaInfo = new ArrayList<>();
        info.forEach(celda -> {
            nuevaInfo.add(celda.replaceAll(";", ""));
        });
        return nuevaInfo;
    }

    public static void crearArchivo(List<String> info) throws FileNotFoundException, IOException {
        FileOutputStream archivo = new FileOutputStream("C:\\Organizacion-archivos\\Clase-Java-11\\Archivos\\archivo.txt");
        info.forEach(fila -> {
            try {
                String mensaje = fila + "\n";
                archivo.write(mensaje.getBytes());
            } catch (IOException e) {
                // manejar la excepción lanzada por archivo.write()
            }
        }); // manejar la excepción lanzada por info.forEach()
        archivo.close();
    }

    public static void crearArchivoExcel(List<String> info) throws FileNotFoundException, IOException {
        Workbook workbook = new HSSFWorkbook();
        Map<String, Integer> dias = new HashMap<>();
        info.forEach(registro -> {
            String dia = obtenerDia(registro);
            Sheet hoja = null;
            Row filaActual = null;
            Cell celda = null;
            if (!(dias.containsKey(dia))) {
                hoja = workbook.createSheet(dia);
                filaActual = hoja.createRow(0);
                celda = filaActual.createCell(0);
                celda.setCellValue(registro);
                dias.put(dia, 0);
            } else {
                int indice = dias.get(dia) + 1;
                hoja = workbook.getSheet(dia);
                filaActual = hoja.createRow(indice);
                celda = filaActual.createCell(0);
                celda.setCellValue(registro);
                dias.put(dia, indice);
            }
        });
        
        FileOutputStream archivo = new FileOutputStream("C:\\Organizacion-archivos\\Clase-Java-11\\Archivos\\archivo.xlsx");
        workbook.write(archivo);
        archivo.close();
    }

    private static String obtenerDia(String registro) {
        if (registro.contains("LUNES")) return "LUNES";

        if (registro.contains("MARTES")) return "MARTES";
        
        if (registro.contains("MIERCOLES")) return "MIERCOLES";
    
        if (registro.contains("JUEVES")) return "JUEVES";

        if (registro.contains("VIERNES")) return "VIERNES";

        if (registro.contains("SABADO")) return "SABADO";

        if (registro.contains("DOMINGO")) return "DOMINGO";

        return null;
    }
}
