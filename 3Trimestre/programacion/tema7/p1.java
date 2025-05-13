import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class p1 {
    public static void main(String[] args) {
        try {
            // Escribir en el archivo
            BufferedWriter bw = new BufferedWriter(new FileWriter("prueba1.txt"));
            bw.write("Hola mundo");
            bw.newLine();
            bw.write("Otra linea");
            bw.close();
        } catch (IOException e) {
            System.out.println("Error escribiendo el archivo: " + e.getMessage());
        }

        // Leer el archivo
        leerarch("prueba1.txt");
    }

    public static void leerarch(String nomarch) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(nomarch));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println("Leyendo: " + linea);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error leyendo el archivo: " + e.getMessage());
        }
    }
}
