import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class PRG7_2 {
    public static void main(String[] args) {
        String fichentr = "fichentr.txt";
        String fichpal  = "fichpal.txt";
        String fichnuev = "fichnuev.txt";
        cambiaPalabra(fichentr, fichpal, fichnuev);
    }

    public static void cambiaPalabra(String fichentr, String fichpal, String fichnuev) {
        ArrayList<String[]> reemplazos = new ArrayList<String[]>(); // ArrayList para almacenar parejas (palabra a reemplazar, palabra de reemplazo)

        // Primero, cargamos todas las parejas de palabras que necesitamos cambiar
        try (BufferedReader br2 = new BufferedReader(new FileReader(fichpal))) {
            String lineas2;
            while ((lineas2 = br2.readLine()) != null) {
                lineas2 = lineas2.trim();
                String[] pal2 = lineas2.split("\\s+"); // Separamos las palabras

                if (pal2.length == 2) {  // Nos aseguramos de que sea una pareja válida (palabra a reemplazar y palabra de reemplazo)
                    reemplazos.add(pal2);  // Almacenamos la pareja en el ArrayList
                }
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo de palabras: " + e.getMessage());
        }

        // Ahora, procesamos el archivo de entrada para reemplazar las palabras
        try (BufferedReader br1 = new BufferedReader(new FileReader(fichentr));
             BufferedWriter bw = new BufferedWriter(new FileWriter(fichnuev))) {

            String lineas1;
            // Leemos cada línea del archivo de entrada
            while ((lineas1 = br1.readLine()) != null) {
                lineas1 = lineas1.trim();
                String[] pal1 = lineas1.split("\\s+");

                // Para cada palabra en la línea leemos el ArrayList de reemplazos
                for (int i = 0; i < pal1.length; i++) {
                    String palabra = pal1[i];
                    boolean reemplazada = false;

                    // Recorremos TODAS las parejas de palabras a reemplazar
                    for (String[] par : reemplazos) {
                        if (palabra.equals(par[0])) { // Si encontramos la palabra a reemplazar
                            bw.write(par[1]);         // Escribimos la palabra de reemplazo
                            reemplazada = true;
                            break; // No necesitamos más reemplazos para esta palabra
                        }
                    }

                    // Si no se ha reemplazado, escribimos la palabra original
                    if (!reemplazada) {
                        bw.write(palabra);
                    }

                    bw.write(" "); // Añadimos un espacio entre las palabras
                }

                bw.newLine();  // Después de procesar la línea, agregamos un salto de línea
            }
        } catch (Exception e) {
            System.out.println("Error al procesar el archivo de entrada: " + e.getMessage());
        }
    }
}
