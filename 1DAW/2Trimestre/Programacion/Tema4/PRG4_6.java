import java.util.Scanner;

public class PRG4_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, resultado;
        
        do {
            System.out.println("Introduce el valor de a:");
            a = scanner.nextInt();

            System.out.println("Introduce el valor de b:");
            b = scanner.nextInt();
        } while (a < b);

        resultado = calcularCombinaciones(a, b);
        
        System.out.println("El número de combinaciones posibles es: " + resultado);
    }

    public static int calcularCombinaciones(int a, int b) {
        return calcularFactorial(a) / (calcularFactorial(b) * calcularFactorial(a - b));
    }

    public static int calcularFactorial(int a) {
        int resultado = 1;

        for (int i = 1; i <= a; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }
}


