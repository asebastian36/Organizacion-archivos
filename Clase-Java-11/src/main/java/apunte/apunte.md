# Apache POI

Fila

```Java
wb.getSheetAt(index); // hoja
sheet.getRow(index); // fila
row.getCell(index); //  celda
cell.getStringCellValue(); // cadena
```

Leer Excel

```java
Workbook wb = new XSSFWorkBook(FileInputStream);
Workbook wb = new HSSFWorkBook(FileInputStream);
```
