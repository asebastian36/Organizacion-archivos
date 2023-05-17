# Bitacoras (log)

**Archivos de registro**

Facilitan informacion de un sistema informatico para los procesos de diagnostico, depuracion,
monitoreo, o analisis a traves de herramientas.

Por ejemplo, comportamientos inesperados, accesos de usuarios, estado del sistema, informacion
de conectividad a bases de datos, etc.

En otras palabras, nos detallan el comportamiento de un sistema informatico.

## Clase Logger (estandar)

Guardar los mensajes de interes. Se encuentra en el paquete `java.util,logging` creacion: se
asocia al nombre de un componente (nombre calificado).

> El nombre calificado es el nombre de la clase.


```java
public static final Logger LOGGER = Logger.getLogger("Componente");
```

```java
LOGGER.info("Hola mundo");
LOGGER.log(Level.INFO, "Hola mundo");
```

Informacion: Metodo que genera mensajes, los mensajes se guardan en un objeto LogRecord.

La clase Level maneja 7 niveles de importancia:
`SEVERE, WARNING, INFO, CONFIG, FINE, FINER, FINEST`

* **SEVERE**: Indican una falla grave, fallas que impiden la ejecucion normal del sistema.

* **WARNING**: Indican un problema potencial, deben describir eventos de interes para los
administradores del sistema.

* **INFO**: Indican mensajes informativos de interes para los administradores del sistema.

## Persistencia de los mensajes

**Handler (publicador)**

Se encarga de guardar los mensajes (persistir el mensaje).

Medios para guardar : ConsoleHandler, FileHandler, SocketHandler.

```java
//  es recomendable pasar la ruta, no solo el nombre
Handler fileHandler = new FileHandler("archivo.log");
LOGGER.addHandler(fileHandler);
```

**Ejemplo de uso:**

```java
Handler fileHandler = new FileHandler("C:\\Organizacion-archivos\\Clase-Java-12\\Archivos\\archivo.log");
LOGGER.addHandler(fileHandler);
LOGGER.log(Level.INFO, "Hola mundo");
fileHandler.flush();
```

##Cambiar el formato del publicador

```java
Formatter f = new SimpleFormatter();
Formatter f = XMLFormatter();
```
