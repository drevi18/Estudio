package Dispositivos;

import java.util.Scanner;

public class Testdisp {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        System.out.println("Elige dispositivo");
        System.out.println("[1] Smartphone");
        System.out.println("[2] Televisor");
        int respuesta =tec.nextInt();

        switch (respuesta) {
            case 1:
            System.out.println("Tiene conexión a internet?");
            int internt=tec.nextInt();
            smartphone s1= new smartphone();
            System.out.println("El smartphone esta conectado a internet? "+s1.conexion(internt));
            System.out.println("  ");
            
            s1.encender();
            s1.apagar();
            System.out.println("  ");
            break;
            case 2:
                break;
            default:
                throw new AssertionError();
        }
    }
}
