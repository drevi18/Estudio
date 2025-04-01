   import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        // Crear un escáner para leer los datos del usuario
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que ingrese una cantidad de segundos
        System.out.print("Ingresa la cantidad de segundos: ");
        int segundosTotales = sc.nextInt();

        // Calcular las horas, minutos y segundos
        int horas = segundosTotales / 3600;            // 1 hora = 3600 segundos
        int minutos = (segundosTotales % 3600) / 60;   // Los minutos restantes
        int segundos = segundosTotales % 60;           // Los segundos restantes

        // Mostrar el resultado
        System.out.println(horas + " horas, " + minutos + " minutos, " + segundos + " segundos.");
    }
}


