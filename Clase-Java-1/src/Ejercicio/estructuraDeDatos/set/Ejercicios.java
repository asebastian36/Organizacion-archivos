package Ejercicio.estructuraDeDatos.set;


import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author Angel Franco
 */

public class Ejercicios {
    public static void main(String[] args) {
        /*
            crear un set para agregar 10 numeros aleatorios,
            imprimir el set.
        */
        
        Set<Integer> numeros = new LinkedHashSet<>();
        
        for (int i = 0; i < 10; i++) {
            Integer numero = new Random().nextInt();
            numeros.add(numero);
        }
        
        /*
            Agregar un valor al final del set, imprimir el set.
        */
        
        numeros.add(1000);
        numeros.forEach(System.out::println);
        
        /*
            Obtener el numero de elementos del set.
        */
        
        //  System.out.println(numeros.size());
        
        /*
            Convertir el set a una lista, imprimir la lista.
        */
        
        List<Integer> lista = numeros.stream().toList();
        //  lista.forEach(System.out::println);
        
        /*
            Crear un segundo set y comparar con el primer set, imprimir
            si son iguales o no.
        */
        
        Set<Integer> numeros1 = new LinkedHashSet<>();
        for (int i = 0; i < 10; i++) {
            numeros1.add(new Random().nextInt());
        }
        numeros1.add(1000);
        
        numeros1.forEach(System.out::println);
        
        System.out.println(numeros.containsAll(numeros1));
        
        /*
            imprimir los elementos que sean iguales en los dos set.
        */
        
        numeros.stream().filter(numeros1::contains);
    }
}
