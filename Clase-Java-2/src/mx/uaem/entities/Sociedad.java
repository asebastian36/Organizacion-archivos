package mx.uaem.entities;

/**
 *
 * @author asebastian36
 */

public class Sociedad {
    private String id;
    private String nombre;
    private String pais;
    
    //  investigar el patron de diseno fachada

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Sociedad(String id, String nombre, String pais) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "id=" + id + ", nombre=" + nombre + ", pais=" + pais;
    }
}
