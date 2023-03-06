# Flujos de entrada y salida (i/o)

Un flujo representa diferentes tipos de destino pueden ser archivos, programas, servidores, etc.

Los flujos admiten diferentes tipos de datos, como bytes, chars, tipos primitivos. Otros manipulan
y transforman los datos de manera util.

Un flujo es una seuencia de datos.

## Flujos de bytes (8 bits)

Todas las clases de flujo de bytes extienden de las clases abstractas `InputStream` y `OutputStream`.

Flujo de bytes de E/S de archivos:

* `FileInputStream`
* `FileOutputStream`

> Estudiar la clase `String`

El metodo `read()` tiene sobre carga, una que retorna la longitud del texto en bytes. Y la otra version hace un rebanado.
`readAllBytes()` retorna los bytes en un arreglo.

Ejemplos:

```java
package mx.uaem;

import java.io.*;

/**
 *
 * @author asebastian36
 */

public class main {
    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("/home/asebastian36/Organizacion-archivos/Clase-Java-2/Archivos/archivo.txt")) {
            BufferedInputStream buffer = new BufferedInputStream(is);
             int caracter = buffer.read();
            
            //  como limite el -1 porque es el codigo ASCII cuando esta vacio
            while(caracter != -1) {
                System.out.print((char) caracter);
                caracter = buffer.read();
            }
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
```

```java
try {
    InputStream is = new FileInputStream("/home/asebastian36/Organizacion-archivos/Clase-Java-2/Archivos/archivo.txt");
    byte [] contenido = is.readAllBytes();

        for(int letra : contenido) {
            System.out.print((char) letra);
        }
    is.close();
} catch (FileNotFoundException ex) {
    throw new RuntimeException(ex);
} catch (IOException ex) {
    throw new RuntimeException(ex);
}
```

Un `BufferedInputStream` mejora la entrada y la escritura, recibe un `InputStream`, depende de la memoria RAM del servidor.

## Flujo de caracteres (character streams)

La entrada y salida realizadas con flujos de Character se traducen automaticamente hacia el juego
de caracteres local (unicode).

Todas las clases de flujo de caracteres extienden de las clases abstractas `Reader` y `Writer`.

Flujos de caracteres E/S de archivos:

* `FileReader`
* `FileWriter`

Ejercicio0:

```java
package ejercicio;

import java.io.*;

/**
 *
 * @author asebastian36
 */

public class Ejercicio0 {
    public static void main(String[] args) {
        try (Reader r = new FileReader("/home/asebastian36/Organizacion-archivos/Clase-Java-2/Archivos/archivo.txt")) {
            String cadena = "";
            while(r.ready()) {
                cadena = cadena + (char) r.read();
            }
            
            System.out.println(cadena);
            
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        
    }
}
```

## BufferedReader

Lee linea por linea el archivo.

Ejemplo:

```java
package mx.uaem;

import java.io.*;

/**
 *
 * @author asebastian36
 */

public class main {
    //  pasar el texto del archivo a una cadena y mandarla a salida estandar
    public static void main(String[] args) {
        try (Reader r = new FileReader("/home/asebastian36/Organizacion-archivos/Clase-Java-2/Archivos/archivo.txt");
                BufferedReader buffer = new BufferedReader(r)) {
            while(buffer.ready()) {
                System.out.print((char) buffer.read());
            }
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        
    }
}
```
