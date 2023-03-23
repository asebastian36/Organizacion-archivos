package mx.uaem;

/**
 *
 * @author asebastian36
 */

public class Main {

    public static void main(String[] args) {
        //  uso de expresion lambda con una funcion anonima y una clase anonima
        //  Interfaz b = (argumento) -> "Hola mundo";
        
        
        //  creacion de una clase anonima
        Interfaz mc = new Interfaz() {
            @Override
            public String saludo(String parametro) {
              return "Hola mundo";
            }
        };
        
        metodoMain(mc);
        metodoMain( (argumento) -> {
            //...
            return "Hola mundo";
        });
        
        //  recuperar cadena de la clase anonima
        String recupera = mc.saludo("argumento");
    }

    public static void metodoMain(Interfaz miInstancia) {
        System.out.println(miInstancia.saludo("argumento"));
        
    }
}
