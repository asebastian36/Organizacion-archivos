# MySQL

Presenta al usuario los datos en forma de tablas (filas y columnas).

Fila: Hacen referencia a cada elemento de la relacion, corresponde a un
registro o tupla.

Columna: Hacen referencia a cada propiedad de los datos que se almacenan
en la relacio. Corresponde a un solo campo o atributo de un registro.

**Tabla A:**

| columna o entidad | columna | columna |
|:---:|:---:|:---:|
| fila 1 |   |   |
| fila 2 |   |   |
| fila 3 |   |   |

## Propiedades

* Cada tabla tiene un nombre distinto.
* Cada atributo de la tabla toma un solo valor.
* Cada atributo tiene un nombre distinto en cada tabla.
* Cada registro debe corresponder con un elemento del mundo real.
* No puede haber dos registros iguales.
* El orden de los atributos no importa.
* El orden de los registros no imorta.

## Tipos de relaciones

Relaciones persistentes

Son tablas que solo pueden ser borradas por los usuarios.

* Bases: Se crean indicando su estructura y sus datos.
* Vistas: Solo almacenan una definicion de consulta.

Relaciones temporales

Son tablas que se eliminan automaticamente por el sistema. Las utiliza
el SGBD como almacen intermedio de datos (resultados de consulta).

Claves de las relaciones

Tienen la facultad de identificar sin ambiguedad y de forma unica a una y,
solo una, de las tuplas de esa relacion.

* Clave candidata: Conjunto de atributos que identifican univocamente cada
registro de la relacion.

* Clave primaria: Clave candidata que se escoge como identificador de los
registros.

* Clave alternativa: Cualquier clave candidata que no sea primaria.

* Clava secundaria, externa o foranea: Son los datos de atributos de una
tabla cuyos valores estan relacionados con atributos de otra tabla.

## Sentencias SQL

DML (Data Manipulation Languaje): permite realizar operaciones CRUD en una
base de datos. Acronimo de Create, Read, Update, Delete.

DDL (Data Definition Language): permite realizar operaciones de creacion y
modificacion a una base de datos. Create, Drop, Alter, Rename, Truncate.

* DCL (Data Control Lenguage).
* TCL (Transactional Control Language).

> Una base datos en excel tambien llamado esquema.

Lenguaje de consulta SQL

Lenguaje de base de datos facil de usar, suficientemente potente para
pedir cualquier subconjunto de filas y columnas de una o mas tablas.

### Tipos de datos

* Cadenas (caracteres):

  * `CHAR`: Cadena de longitud fija (hasta 255 caracteres).
  * `VARCHAR`: Cadena de longitud variable (hasta 65 o 535 caracteres).

* Numeros enteros:

  * `INT` o `INTEGER`: Entero de 4 bytes.
  * `BIGINT`: entero de 8 bytes.

* Numeros decimal:
  * `DECIMAL`.
  * `FLOAT`.
  * `DOUBLE`.

## Creacion de base de datos y tablas DDl

Base de datos:

```sql
create database nombre_db
```

Para eliminar

```sql
drop database nombre_db
```

Para crear tablas:

```sql
create table nombre_tabla (aqui van los nombres de las columnas)
```

Agregar columna:

```sql
alter table nombre_tabla add column nombre_columna tipo_dato
```

Eliminar columna:

```sql
alter table nombre_tabla drop nombre_columna
```

Modificar nombre de columna:

```sql
alter table nombre_tabla change nombre_columna nombre_nuevo
```

Para ver todas las bases de datos en el servidor:

```sql
show databases;
```

Script de practica

```sql
show databases;
create database escuela;
drop database escuela;
```

Para elegir que base da datos utilizar:

```sql
use escuela;
```

Script ejercicio

```sql
use escuela;
create table alumnos (
  id int not null auto_increment,
  nombre varchar(255) not null,
  edad int not null,
  primary key alumnos(id)
);
```

Para ver las tablas que hay en la base de datos

> Se debe elegir primero la base datos.

```sql
show tables;
```

Operaciones CRUD

> La sintaxis no es `key sensitive`.

insertar. `INSERT INTO` agrega uno o varios registros a la tabla.

```sql
INSERT INTO destino (campo1[, campo2[, ...]])
VALUES(valor1 [valor2[, ...]])
```

Ejemplo de `INSERT`:

```sql
use escuela;
insert into alumnos (nombre, edad) values ('Yaneth', 25);
```

> Los corchetes significan que pueden o no estar.

Leer. El comando `SELECT` se utiliza para seleccionar informacion de la
base de datos como un conjunto de registros.

```sql
use escuela;
select * from alumnos;
```

Clausula `WHERE`: especifica que registros de las tablas enumeradas en la
clausula `FROM` se ven afectadas por el comando `SELECT`.

Criterios: una expresion que deben cumplir los registros para que se
incluyan en el resultado de la consulta.

<, >, <=, >=, =, `BETWEEN`, `IN`, `LIKE`, `IS NULL`, `IS NOT NULL`, `AND`,
`OR`.

Ejercicio: Listar todos los registros donde edad sea menor que 23

```sql
select * from alumnos where edad < 23;
```

Ejercicio: Listar todos los registros donde nombre termine con l

```sql
select * from alumnos where nombre like '%l';
```

Actualizar. `UPDATE` se usa para actualizar los registros existentes en
las tablas.

```sql
update alumnos set nombre='Elisa', edad=20 where nombre='Chucho';
```

Borrar. `DELETE` se utiliza para eliminar uno o mas registros (filas) de
una tabla.

> tip usar un `SELECT` con la misma condicion del `DELETE` para prevenir
> fallos.

```sql
delete from alumnos where nombre='Luis';

```

## JDBC

Es una API para conectar y ejecutar operaciones sql a una base de datos
relacional con el lenguaje de programacion Java.

> Java Database Connectivity.

Las interfaces y clases las defines en el paquete `java.sql`.

Un controlador (driver) JDBC implementa las interfaces y metodos del
paquete `java.sql`.

> descargar la dependencia `mysql-conector-java`.

* Definir cadena de conexion a la base de datos.
  * SSL: capa de conexion cifra la conexion con la base de datos.
* Definir el usuario y el password.
* Crear la conexion con un `driver manager`.
* Utilizar el `statement`.

Para consultar: `ResultSet`, `statement.executeQuery()`

Para insertar, actualizar, eliminar: `Integer`, `statement.executeUpdate()`

**Ejemplo de uso de sentencias sql en Java:**

**SELECT:**

```java
package mx.uaem.test;

import java.sql.*;
import java.util.*;
import mx.uaem.domain.Alumno;

/**
 *
 * @author Angel Franco
 */

public class Test {

    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/escuela?useSSL=false";
        String USER = "root";
        String PASSWORD = "L4c1b0rgv4c4#";

        Connection conexion = null;
        try {
            List<Alumno> alumnos = new ArrayList<>();
            Alumno alumno = null;
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement statement = conexion.createStatement();
            ResultSet result = statement.executeQuery("select * from alumnos");
            while (result.next()) {
                Integer id = result.getInt("id");
                String nombre = result.getString("nombre");
                Integer edad = result.getInt("edad");

                alumno = new Alumno(id, nombre, edad);
                alumnos.add(alumno);
            }

            alumnos.forEach(System.out::println);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
```

**INSERT:**

```java
import java.sql.*;
import java.util.*;
import mx.uaem.domain.Alumno;

/**
 *
 * @author Angel Franco
 */

public class Test {

    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/escuela?useSSL=false";
        String USER = "root";
        String PASSWORD = "L4c1b0rgv4c4#";

        Connection conexion = null;
        try {
            List<Alumno> alumnos = new ArrayList<>();
            Alumno alumno = null;
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement statement = conexion.createStatement();
            String nombre = "Alberto";
            int edad = 31;
            String insert = "insert into alumnos (nombre, edad) values ('" + nombre + "', "+ edad +")";
            int entero = statement.executeUpdate(insert);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
```

> por seguridad en lugar de utilizar `Statement`, utilizar `PreparedStatement`.
