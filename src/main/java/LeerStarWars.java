import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class LeerStarWars {
    public static void main(String[] args) {
        // Ruta del archivo JSON (puede ser relativa o absoluta)
        String rutaArchivo = "star-wars.json";

        // try-with-resources para cerrar automáticamente el archivo
        try (FileReader reader = new FileReader(rutaArchivo)) {

            // 1. Crear el objeto Gson
            Gson gson = new Gson();

            // 2. Definir el tipo de dato que vamos a leer (Lista de Personaje)
            Type listaPersonajesType = new TypeToken<List<personaje>>() {}.getType();

            // 3. Convertir el JSON a una lista de objetos Personaje
            List<personaje> personajes = gson.fromJson(reader, listaPersonajesType);

            // 4. Mostrar los personajes leídos
            System.out.println("Personajes de Star Wars:");
            for (personaje p : personajes) {
                System.out.println(p); // Usa el toString() de la clase Personaje
            }

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error al procesar el JSON: " + e.getMessage());
        }
    }
}
