# Streams en Java

Permite procesar datos de modo declarativo (al estilo SQL) y aprovechar arquitecturas
de nucleos multiples.

Los streams son estructuras de datos cuyos elementos se computan cuando se recibe una
**operacion terminal**. No almacenan elementos, estos se calculan cuando se recibe la
solicitud.

Los streams admiten operaciones concatenadas, esto es, una stream puede devolver otra
stream.

Las operaciones de streams que pueden concatenarse entre si se llaman **operaciones
intermedias**. Las operacione que cierran un proceso de streams se llaman operaciones
terminales.

Las operaciones intermedias son llamadas tambien perezosas.

Operaciones: filtrado, mapeo, busqueda, reduccion.

## Metodos referenciados

Nos permiten hacer referencia a metodos y constructores mediante una interfaz funcional.
La sintaxis para hacer referencia a metodos y constructores es ls siguiente:

`Class::nombreMetododo`

Existen cuatro tipos:

* Metodo estatico.
  * Referencia de metodos y funciones estaticos de una clase.
  Ejemplo: `Math::max = Math.max(xy)`

* Metodos de instancia.
  * Referencia de metodos y funciones de instancia (de un objeto).
  Ejemplo: `System.out::println = System.out.println(x)`

* Metodos de clase de una instancia de un tipo de clase.
  * Referencia de metodos y funciones de un objeto proporcionado por el contexto.
  Ejemplo: `String::length = str.length()`

* Constructores.
  * Referencia a un constructor.
  Ejemplo: `ArrayList::new = new ArrayList()`
