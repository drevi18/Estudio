import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        // Crear el escáner para leer los datos del usuario
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario los dos números
        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        // Mostrar los valores antes del intercambio
        System.out.println("Antes del intercambio:");
        System.out.println("num1 = " + num1 + ", num2 = " + num2);

        // Intercambiar los valores sin usar una tercera variable
        num1 = num1 + num2;  // Sumar ambos números y guardar el resultado en num1
        num2 = num1 - num2;  // Restar el valor original de num2 a la suma para obtener el valor original de num1
        num1 = num1 - num2;  // Restar el valor original de num1 a la suma para obtener el valor original de num2

        // Mostrar los valores después del intercambio
        System.out.println("Después del intercambio:");
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
    }
}

