package mx.uaemex;

import java.io.*;
import java.nio.file.*;
import java.util.List;
import org.json.*;

/**
 *
 * @author Angel Franco
 */

public class Json {

    public static void creaJsonArray() {
        String json = "[12, 45,3, true]";
        JSONArray array = new JSONArray(json);
        array.forEach(System.out::println);
        
        JSONObject obj = new JSONObject();
        obj.put("llave", "valor");
        obj.put("otra llave", "otro valor");
        obj.put("otro json object", new JSONObject().put("champios del barca", 5));
        System.out.println(obj.toString());
        
        
    }

    public static void escribirJson() {
        try (FileWriter fw = new FileWriter("C:\\Organizacion-archivos\\Clase-Java-10\\Archivo\\prueba.json", true)) {
            JSONArray jsonArray = new JSONArray();
            jsonArray.put(120);
            jsonArray.put(200);
            jsonArray.put(true);
            jsonArray.write(fw);
            fw.flush();

            List<String> archivo = Files.readAllLines(Paths.get("C:\\Organizacion-archivos\\Clase-Java-10\\Archivo\\prueba.json"));
            archivo.forEach(System.out::println);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void leerJson() {
        try(FileReader file = new FileReader("C:\\Organizacion-archivos\\Clase-Java-10\\Archivo\\prueba.json")) {
            JSONTokener jsonTokener = new JSONTokener(file);
            Object obj = jsonTokener.nextValue();
            
            if(obj instanceof JSONArray) {
                JSONArray json = (JSONArray) obj;
                for (int i = 0; i < json.length(); i++) {
                    JSONObject registro = json.getJSONObject(i);
                    System.out.println(registro.getString("name") + " " + registro.getInt("age"));
                }

            } else if(obj instanceof JSONObject) {
                JSONObject json = (JSONObject) obj;
                System.out.println(json.toString());
            }
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
}
