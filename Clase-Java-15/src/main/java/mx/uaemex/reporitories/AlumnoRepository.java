package mx.uaemex.reporitories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mx.uaemex.entities.Alumno;
import mx.uaemex.utils.ConexionDB;

/**
 *
 * @author Angel Franco
 */
public class AlumnoRepository implements IAlumnoRepository {

    //  CRUD de la tabla alumno
    private Connection getConnection() throws SQLException {
        return ConexionDB.getInstance();
    }

    @Override
    public List<Alumno> listar() {
        List<Alumno> lista = new ArrayList<>();
        try (Statement statement = getConnection().createStatement(); ResultSet result = statement.executeQuery("select * from alumnos")) {
            while (result.next()) {
                lista.add(getAlumno(result));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return lista;
    }

    private Alumno getAlumno(ResultSet result) throws SQLException {
        return new Alumno(result.getInt("id"), result.getString("nombre"), result.getInt("edad"));
    }

    @Override
    public Alumno buscar(Integer id) {
        try (PreparedStatement statement = getConnection().prepareStatement("select * from alumnos where id = ?")) {
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            if (result.next()) return getAlumno(result);
            result.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public void agregar(Alumno alumno) {
        try (PreparedStatement statement = getConnection().prepareStatement("insert into alumnos (nombre, edad) values (?, ?)")) {
            statement.setString(1, alumno.nombre());
            statement.setInt(2, alumno.edad());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void actualizar(Alumno alumno) {
        try(PreparedStatement statement = getConnection().prepareStatement("update alumnos set nombre=?, edad=? where id=?")) {
            statement.setString(1, alumno.nombre());
            statement.setInt(2, alumno.edad());
            statement.setInt(3, alumno.id());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void eliminar(Alumno alumno) {
        try(PreparedStatement statement = getConnection().prepareStatement("delete from alumnos where id=?")) {
            statement.setInt(1, alumno.id());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
