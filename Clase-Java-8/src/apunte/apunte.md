# Escribir archivo en Java

Alternativa `FileOutputStream`

```Java
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream file = new FileOutputStream("");
        BufferedOutputStream buffer = new BufferedOutputStream(file);
        
        buffer.write("Hola este es un mensaje\n".getBytes());
        buffer.flush();
        buffer.write("este es otro mensaje\n".getBytes());
        buffer.flush();
    }
}
```

Alternativa `FileWriter`

```Java
public class Main {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("");
            file.write("Hola");
            file.write("este es otro mensaje");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
```

> Tarea investigar formato JSON
