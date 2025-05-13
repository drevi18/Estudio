import java.io.*;
import java.util.Scanner;

public class fusfich {

    static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {
        String f1 = "file1.txt";
        String f2 = "file2.txt";
        String f3 = "file3.txt";

        crearFichero1(f1);
        crearFichero2(f1, f2);
        fusionFicheros(f1, f2, f3);
        mostrar(f1);
        mostrar(f2);
        mostrar(f3);
    }

    public static void crearFichero1(String nombre) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombre))) {
            System.out.println("Introduce un número inicial:");
            int n1 = tec.nextInt();
            bw.write(String.valueOf(n1));
            bw.newLine();

            int n2 = n1;
            System.out.println("Introduce números mayores o iguales (0 para terminar):");

            do {
                n2 = tec.nextInt();
                if (n2 == 0) break;

                if (n2 < n1) {
                    System.out.println("El número debe ser mayor o igual que el anterior.");
                } else {
                    bw.write(String.valueOf(n2));
                    bw.newLine();
                    n1 = n2;
                }
            } while (true);
        } catch (IOException e) {
            System.out.println("Error escribiendo en " + nombre + ": " + e.getMessage());
        }
    }

    public static void crearFichero2(String f1, String f2) {
        try (BufferedReader br = new BufferedReader(new FileReader(f1));
             BufferedWriter bw = new BufferedWriter(new FileWriter(f2))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                int num = Integer.parseInt(linea.trim());
                bw.write(String.valueOf(num + 1));
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error creando " + f2 + ": " + e.getMessage());
        }
    }

    public static void fusionFicheros(String f1, String f2, String f3) {
        try (BufferedReader br1 = new BufferedReader(new FileReader(f1));
             BufferedReader br2 = new BufferedReader(new FileReader(f2));
             BufferedWriter bw = new BufferedWriter(new FileWriter(f3))) {

            String linea;
            while ((linea = br1.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }
            while ((linea = br2.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error creando " + f3 + ": " + e.getMessage());
        }
    }

    public static void mostrar(String nombre) {
        System.out.println("Contenido del fichero: " + nombre);
        try (BufferedReader br = new BufferedReader(new FileReader(nombre))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            System.out.println("-----------------------------");
        } catch (IOException e) {
            System.out.println("Error leyendo " + nombre + ": " + e.getMessage());
        }
    }
}
