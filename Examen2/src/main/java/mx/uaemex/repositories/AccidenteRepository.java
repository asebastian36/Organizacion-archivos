package mx.uaemex.repositories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mx.uaemex.entities.AccidenteBicicleta;
import mx.uaemex.utils.ConexionBD;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Angel Franco
 */

public class AccidenteRepository implements IAccidenteRepository{

    private Connection getConnection() throws SQLException {
        return ConexionBD.getInstance();
    }
    
    @Override
    public List<AccidenteBicicleta> listar() {
        List<AccidenteBicicleta> lista = new ArrayList<>();
        try (Statement statement = getConnection().createStatement(); ResultSet result = statement.executeQuery("select * from accidentes_bicicletas")) {
            while (result.next()) {
                lista.add(getAccidente(result));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return lista;
    }

    @Override
    public AccidenteBicicleta buscar(Integer id) {
        try (PreparedStatement statement = getConnection().prepareStatement("select * from accidentes_bicicletas where idaccidentes_bicicletas =?")) {
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            if (result.next()) return getAccidente(result);
            result.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public void agregar(AccidenteBicicleta accidente) {
        try (PreparedStatement statement = getConnection().prepareStatement("insert into accidentes_bicicletas (fecha, dia_semana, distrito, lugar_accidente) values (?, ?, ?, ?)")) {
            statement.setString(1, accidente.getFecha());
            statement.setString(2, accidente.getDiaSemana());
            statement.setString(3, accidente.getDistrito());
            statement.setString(4, accidente.getLugarAccidente());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void eliminar(AccidenteBicicleta accidente) {
        try(PreparedStatement statement = getConnection().prepareStatement("delete from accidentes_bicicletas where idaccidentes_bicicletas=?")) {
            statement.setInt(1, accidente.getId());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<String> leer() {
        List<String> info = new ArrayList<>();
        FileInputStream file;
        Workbook libro = null;
        try {
            file = new FileInputStream("C:\\Organizacion-archivos\\Examen2\\Archivos\\AccidentesBicicletas.xlsx");
            libro = new XSSFWorkbook(file);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Sheet hoja = libro.getSheetAt(0);
        
        for (int i = 0; i < hoja.getLastRowNum(); i++) {
            if (i != 0) {
                Row fila = hoja.getRow(i);
                for (int j = 0; j < fila.getLastCellNum(); j++) {
                    Cell celda = fila.getCell(j);
                    info.add(celda.toString());
                }
            }
        }
        return limpiar(info);
    }
    
    private List<String> limpiar(List<String> lista) {
        List<String> resultado = new ArrayList<>();
        lista.forEach(registro -> {
            String[] registros = registro.split(";");
            for (int i = 0; i < registro.length(); i++) {
                if(i == 0 || i == 2 || i == 3 || i == 4) resultado.add(registros[i]);
            }
        });
        
        return resultado;
    }
    
    private AccidenteBicicleta getAccidente(ResultSet result) throws SQLException {
        return new AccidenteBicicleta(result.getInt("idaccidentes_bicicletas"), result.getString("fecha"), result.getString("dia_semana"), result.getString("distrito"), result.getString("lugar_accidente"));
    }

    @Override
    public List<AccidenteBicicleta> buscar(String dia) {
        List<AccidenteBicicleta> lista = new ArrayList<>();
        try (PreparedStatement statement = getConnection().prepareStatement("select * from accidentes_bicicletas where dia_semana = ?")) {
            statement.setString(1, dia.toUpperCase());
            ResultSet result = statement.executeQuery();
            while (result.next()) lista.add(getAccidente(result));
            result.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }
    
    public void agregarRegistros(List<String> lista) {
        int inicio = 0;
        int fin = 4;
        
        while(fin < lista.size()) {
            List<String> elemento = lista.subList(inicio, fin);
            agregar(new AccidenteBicicleta(elemento.get(0), elemento.get(1), elemento.get(2), elemento.get(3)));
            inicio += 4;
            fin += 4;
        }
    }
}
