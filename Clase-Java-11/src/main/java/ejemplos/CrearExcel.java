package ejemplos;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;

/**
 *
 * @author Angel Franco
 */

public class CrearExcel {
     public static void main(String[] args) throws Exception {
        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet();
        
        int filaCreada = sheet.createRow(0).createCell(0).getStringCellValue().length();
        System.out.println("Fila creada: " + filaCreada);
    }
}
