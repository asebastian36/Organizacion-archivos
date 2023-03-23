# Expresiones Lambda o funciones anonimas

Son funciones definidas como entidades de primer nivel, esto es, se pueden pasar
como argumento, o tambien llamadas funciones anonimas. Es una funcion abstracta,
una funcion sin nombre.

Es un intento de incluir el paradigma de programacion funcional.

* se necesita crear una interfaz funcional para ejecutar expresiones lambda.
* conocer concepto de inferencia de tipos.

## Sintaxis de expresiones lamda

```java
() -> expresion;
(parametros) -> expresion;
(parametros) -> {bloque de codigo;}
```

## Interfaz funcional

Es una interfaz que tiene uno y solo un metodo abstracto, y que este sea diferente
a los metodos definidos en `java.lang.Object`.

Puede tener metodos y/o funciones por defecto y estaticos sin que esto afecte su
condicion de ser interfaz funcional.

La anotacion `@FunctionalInterface` obliga a la interfaz a ser funcional.

## Clase anonima

Clase temporal sin nombre para crear un solo objeto.

Uno de sus usos es instanciar una interfaz, se crea temporalmente para instanciar la clase.

## Interfaces recargadas

Proveen funciones y/o metodos con una implementacion por defecto.

Metodos/Funciones por defecto: son especificados e implementados por la interfaz. Usan
la palabra reservada `default` antes del tipo de retorno.

Metodos/Funciones estaticas: Usan la palabra reservada `static` antes del tipo de
retorno.
