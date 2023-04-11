# Clase RandomAccessFile

Las instancias de esta clase admiten la lectura y escritura de un archivo con acceso aleatorio.

```text
Constructor
      RandomAccessFile(File file, String mode)
      RandomAccesFile(String name, String mode)

      mode:"r" lectura.
              "rw" lectura y escritura.
```

## Metodos y funciones

* **lenght()** retorna la longitud del archivo (chars, \n, \r).
* **getFilePointer()** retorna posicion del puntero.
* **seek(long)** posiciona el puntero del archivo a una posicion.
* **readLine()** retorna un valor de tipo String. Lee una linea y avanza el puntero.
* **write(byte[] b)** escribe un valor en fichero, donde se encuentre el apuntador.

## Escribir archivo en Java

```text
Clase FileOutPutStream
    Constructor
        new FileOutputStream("archivo")
        new FileOutputStream("archivo", boolean)
        new FileOutputStream(File)
        new FileOutputStream(File, boolean)
    write
        Escribe.
    close
        Cierra flujo.
```
