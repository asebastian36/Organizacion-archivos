package mx.uaem.service;

import java.io.IOException;
import java.util.logging.*;

/**
 *
 * @author Angel Franco
 */

public class Service {
    public static final Logger LOGGER = Logger.getLogger("Service");
    private Handler handler;
    private Formatter format;
    public Service() {
        try {
            this.handler = new FileHandler("C:\\Organizacion-archivos\\Clase-Java-12\\Archivos\\service.log");
            this.format = new SimpleFormatter();
            this.handler.setFormatter(format);
            LOGGER.addHandler(handler);
            LOGGER.setUseParentHandlers(false);
        } catch (IOException ex) {
            LOGGER.severe(ex.toString());
        }
    }
}
