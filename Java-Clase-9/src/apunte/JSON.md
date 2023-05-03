# JSON

JavaScriptObjectNotation (Notacion de objetos JavaScript).

Es un formato de datos facil y muy ligero. Esta disponible para varios
lenguajes de programacion.

Nace como necesidad de crear un estandar para el intercambio de datos
entre diferentes sistemas.

## JSON. Literal de matrices

Son elementos que se especifican utilizando corchetes para encerrar
una lista de valores separados por comas.

Los valores pueden ser cadenas de texto, numeros, booleanos y nulos.

## JSON. Literales de objetos

Se usan para almacenar tuplas (clave-valor)l. Para definir un objeto
se usan las llaves, cada tupla separada por coma.

Las tuplas se definen mediante una cadena, un simbolo de dos puntos
y el valor.

La estructura de JSON es muy similar a los objetos JavaScript.

**Ejemplo:**

```JSON
{
  "nombre": "Luis",
  "id": 313,
  "profesor": true,
  "idCursos": ([52, 73, 45]),
  "cursos": {
    "marketing": "Mi primer aplicacion web",
    "programacion": ["Java", "JSON"]
  },
  "vaciones": null
}

```

## Maven Apache

Herramienta que se usa para construir (compilacion) y administrar
cualquier proyecto Java, basandose en el concepto POM (Proyect Object
Model).

El archivo POM define como el artefacto sera construido y el ciclo de
vida.

**Ciclo de vida (principales):**

* Compilacion.
* Test (pruebas unitarias).
* Package (empaquetar).
* Instalar (repositorio local).
* Desplegar.

Un artefacto es el codigo fuente a empaquetar con un identificador, grupo
y una version.

Permite descargar dependencias de un proyecto Java.

Para la estructura de carpetas usa el principio de **convencion sobre
configuracion**.

## JSON en Java

Con la libreria `JSONArray`

> mvnrepository
