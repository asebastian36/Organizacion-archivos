package mx.uaemex.entities;

/**
 *
 * @author Angel Franco
 */

//  atributos en los parentesis
public record Alumno(Integer id, String nombre, Integer edad) {
    //  genero equals, toString, hashcode y setters en automatico
    //  y se puede sobre sobreescribir.
    
    @Override
    public String toString() {
       return "id = " + this.id + ", nombre = " + this.nombre + ", edad = " + this.edad;
    }
}
