package mx.uaem;

import mx.uaem.services.SociedadServiceImpl;

/**
 *
 * @author asebastian36
 */

public class main {

    public static void main(String[] args) {
        SociedadServiceImpl servicio = new SociedadServiceImpl();
        servicio.obtenMayus().forEach(System.out::println);
    }
}
