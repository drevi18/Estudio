import java.io.*;
public class chuletas {
    // 📘 CHULETA FINAL - EXCEPCIONES Y FICHEROS EN JAVA

    public static void main(String[] args) {

        // ------------------------------
        // ⚠️ EXCEPCIONES
        // ------------------------------

        try {
            int a = 10;
            int b = 0;
            int resultado = a / b; // Esto lanza ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre 0.");
        } finally {
            System.out.println("Bloque finally: se ejecuta siempre.");
        }

        // Lanzar excepción manual
        int edad = -5;
        if (edad < 0) {
            throw new IllegalArgumentException("Edad no puede ser negativa");
        }

        // ------------------------------
        // 📝 FICHEROS - ESCRIBIR TEXTO
        // ------------------------------

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("salida.txt"))) {
            bw.write("Línea 1");
            bw.newLine();
            bw.write("Línea 2");
        } catch (IOException e) {
            System.out.println("Error escribiendo archivo: " + e.getMessage());
        }

        // ------------------------------
        // 📖 FICHEROS - LEER TEXTO
        // ------------------------------

        try (BufferedReader br = new BufferedReader(new FileReader("salida.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println("Leyendo: " + linea);
            }
        } catch (IOException e) {
            System.out.println("Error leyendo archivo: " + e.getMessage());
        }

        // ------------------------------
        // 🧨 CREAR EXCEPCIÓN PERSONALIZADA
        // ------------------------------
        try {
            verificarEdad(15); // Lanza excepción
        } catch (EdadNoValidaException e) {
            System.out.println("Error personalizado: " + e.getMessage());
        }
    }

    // Función que lanza excepción propia
    public static void verificarEdad(int edad) throws EdadNoValidaException {
        if (edad < 18) {
            throw new EdadNoValidaException("Debes ser mayor de edad");
        }
    }
}

// Clase de excepción propia
class EdadNoValidaException extends Exception {
    public EdadNoValidaException(String mensaje) {
        super(mensaje);
    }
}

