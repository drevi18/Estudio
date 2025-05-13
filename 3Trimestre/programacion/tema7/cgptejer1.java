
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class cgptejer1 {
    public static void main(String[] args) {
        
        String leer = "cgpt1.txt";
        String escribir = "scgpt1.txt";

        try {
            //creeamos el lector
            BufferedReader br = new BufferedReader(new FileReader(leer));
            //ahora creamos el  escritor
            BufferedWriter bw = new BufferedWriter(new  FileWriter(escribir));

            //Creamos las lineas
            String lineas; 

            //ahora hacemos un bucle para leer linea por linea
            while ((lineas = br.readLine()) != null) { 
                //vamos a dividir las palabras por espacios 
                String[] palabras = lineas.trim().split("\\s+");
                int numPalabras;
                // verificamos si la linea esta vacía y si no lo esta cuenta las palabras que hay en esta
                    if (lineas.trim().isEmpty()) {
                        numPalabras = 0;
                    } else {
                        numPalabras = palabras.length;
                    }


            //ahora vamos a escribir el resultado en el arch de salida

            bw.write(String.valueOf(numPalabras));
            bw.newLine();

        }

            br.close();
            bw.close();
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
