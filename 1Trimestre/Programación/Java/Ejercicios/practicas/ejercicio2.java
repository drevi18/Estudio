import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Introduce el tamaño de la matriz (n): ");
        int n = tec.nextInt();

        while (n <= 0) {
            System.out.print("El tamaño debe ser mayor que 0. Inténtalo de nuevo: ");
            n = tec.nextInt();
        }

        System.out.print("Introduce la fila para la X (1 a " + n + "): ");
        int x = tec.nextInt();
        System.out.print("Introduce la columna para la X (1 a " + n + "): ");
        int y = tec.nextInt();

        while (x < 1 || x > n || y < 1 || y > n) {
            System.out.println("Posición no válida. Asegúrate de que las filas y columnas estén entre 1 y " + n);
            System.out.print("Introduce la fila para la X (1 a " + n + "): ");
            x = tec.nextInt();
            System.out.print("Introduce la columna para la X (1 a " + n + "): ");
            y = tec.nextInt();
        }

        for (int i = 1; i <= n; i++) { 
            for (int j = 1; j <= n; j++) { 
                if (i == x && j == y) { 
                    System.out.print("X"); 
                } else {
                    System.out.print("0");
                }
            }
        }
    }
}
