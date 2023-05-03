# Java NIO (write)

Interfaz `Path`

Clase `Files`

**Ejemplo:**

```Java
package mx.uaem;

import java.io.IOException;
import java.nio.file.*;

/**
 *
 * @author Angel Franco
 */

public class Main {
    public static void main(String[] args) throws IOException {
        //  para escribir con write con un Path
        Path path = Paths.get("C:\\Organizacion-archivos\\Java-Clase-9\\Archivos\\hola.txt");
        Files.write(path, "Hola".getBytes());
    }
}
```

Mejora en el ejemplo para que se pueda sobreescribir:

```Java
package mx.uaem;

import java.io.IOException;
import java.nio.file.*;

/**
 *
 * @author Angel Franco
 */

public class Main {
    public static void main(String[] args) throws IOException {
        //  para escribir con write con un Path
        Path path = Paths.get("C:\\Organizacion-archivos\\Java-Clase-9\\Archivos\\hola.txt");
        Files.write(path, "Hola,".getBytes());
        Files.write(path, " Soy un mensaje UwU.".getBytes(), StandardOpenOption.APPEND);
        Files.write(path, "\nHasta la proxima...".getBytes(), StandardOpenOption.APPEND);
    }
}
```

Pasando una lista para escribir en un archivo:

```Java
package mx.uaem;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

/**
 *
 * @author Angel Franco
 */

public class Main {
    public static void main(String[] args) throws IOException {
        //  para escribir con write con un Path
        Path path = Paths.get("C:\\Organizacion-archivos\\Java-Clase-9\\Archivos\\hola.txt");
        List<String> lista = new LinkedList<>();
        lista.add("Hola desde Java");
        lista.add("con una lista que puede ser un iterable");
        lista.add("puedo pasar una lista porque las listas heredan de");
        lista.add("collection y collection hereda de iterable");
        
        Files.write(path, lista);
    }
}
```

Para pasar directamente un `String`:

```Java
package mx.uaem;

import java.io.IOException;
import java.nio.file.*;

/**
 *
 * @author Angel Franco
 */

public class Main {
    public static void main(String[] args) throws IOException {
        //  para escribir con write con un Path
        Path path = Paths.get("C:\\Organizacion-archivos\\Java-Clase-9\\Archivos\\hola.txt");
        Files.writeString(path, "Hola");
    }
}
```
