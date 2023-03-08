package Ejercicio.estructuraDeDatos;

import java.util.*;

/**
 *
 * @author asebastian36
 */

public class Ejercicios {

    public static void main(String[] args) {
        /**
         * Crear una lista para agregar cinco colores, imprime la lista.
         */
        
        List<String> colores = new ArrayList<>();
        
        colores.add("Gris");
        colores.add("Negro");
        colores.add("Azul");
        colores.add("Morado");
        colores.add("Rojo");
        
//        colores.forEach(color -> {
//            System.out.println("color = " + color);
//        });
        
        /*
            Inserta tres colores mas al inicio de la lista, imprime la lista.
        */
        
        colores.add(0, "Verde");
        colores.add(0, "Rosa");
        colores.add(0, "Blanco");
        
//        colores.forEach(color -> {
//            System.out.println("color = " + color);
//        });
        
        
        /*
            Obten el color del indice 6 de la lista, imprime el color.
        */
        
        String color6 = colores.get(5);
        //  System.out.println("color6 = " + color6);
        
        /*
            Actualiza un color de la lista, imprime la lista.
        */
        
        colores.set(1, "Cafe");
        
//        colores.forEach(color -> {
//            System.out.println(color);
//        });

        /**
         *  Elimina el 5to color de la lista, imprime la lista
         */
        
        colores.remove(5);
        
        
    }

}
