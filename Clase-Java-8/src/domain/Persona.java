package domain;

/**
 *
 * @author Angel Franco
 */

public class Persona {
    private String id;
    private String nombre;
    private String tipo;
    private Double importe;
    
    public Persona() {
    
    }
    
    public Persona(String id, String nombre, String tipo, Double importe) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.importe = importe;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", importe=" + importe;
    }
    
    
}
