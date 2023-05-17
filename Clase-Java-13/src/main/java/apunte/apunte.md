# Limpieza de datos

Es el proceso de analizar, corregir y eliminar datos incoherentes, incompletos,
duplicados, incorrectos. Todo esto de un conjunto de datos de alguna fuente
de informacion.

El objetivo de la limpieza de datos es asegurar que los datos sean coherentes y
precisos para su posterior analisis.

## Expresiones regulares

Son patrones de busqueda que intentan hacer coincidir en algun texto o dato de
entrada.

Un patron consta de uno o mas caracteres.

Se usan para buscar, editar o manipular texto o datos.

## En Java

Clase `Pattern`: Se usa para definir un patron (expresion regular).

Clase `Matcher`: Realiza las operaciones de coincidencia de una secuencia
de caracteres.

**Ejemplo:**

```java
package mx.uaem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Angel Franco
 */

public class Main {
    public static void main(String[] args) {
        //  cadena a validar
        String cadena = "a";
        
        //  definir la expresion regular
        Pattern pattern = Pattern.compile("a");
        
        //  evaluamos la expresion regular con la cadena
        Matcher matcher = pattern.matcher(cadena);
        
        //  obtener la respuesta
        boolean validacion = matcher.matches();
        System.out.println("validacion = " + validacion);
    }
}
```

### Cuantificadores

* `?` --> puede existir 0, 1 veces.
* `+` --> 1 o mas veces.
* `*` --> 0, 1 o mas veces.
* `[]` --> `OR`.
* `()` --> `AND`.

> Van del lado derecho de la expresion regular.

**Ejemplos:**

```Java
//  la a puede estar una vez o no estar
Pattern pattern = Pattern.compile("a?");

//  puede estar una o mas veces
Pattern pattern = Pattern.compile("a+");

//  puede estar, no estar o estar mas de una vez
Pattern pattern = Pattern.compile("a*");

//  para verificar que todo este en minusculas
Patter patten = Pattern.compile("[abcdefghijklmnñopkrstuvwxyz]+");
```

**Rango:** con `-`

**Ejemplos:**

```Java
//  para minusculas
Patter patten = Pattern.compile("[a-z]+");

//  para numeros
Patter patten = Pattern.compile("[0-9]+");

//  para numeros decimales o no decimales
Pattern pattern = Pattern.compile("[0-9]+(\\.[0-9]+)?");

//  para numeros decimales o no decimales positivos o negativos
Pattern pattern = Pattern.compile("-?[0-9](\\.[0-9]+)?");
```
