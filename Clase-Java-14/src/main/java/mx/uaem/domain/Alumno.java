package mx.uaem.domain;

/**
 *
 * @author Angel Franco
 */

public class Alumno {
    private int id;
    private String nombre;
    private int edad;

    public Alumno(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Alumno() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "id=" + id + ", nombre=" + nombre + ", edad=" + edad;
    }
}
