/*Escribe un programa que lee una secuencia de calificaciones(números enteros entre 0 y 10). 
La secuencia termina cuando se introduce un número menor que 0 o mayor que 10. 
Se obtiene e imprime una lista de frecuencias (número de repeticiones) de cada una de las notas. */

import java.util.Scanner;

public class PRG5_7 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        int not= 0;
        int[] v = new int [10];

        System.out.println("Introduce las notas, para salir pon un número <0 || >10 ");
        
        while (not >= 0 && not <= 10) {
            not = tec.nextInt();
            if (not >= 0 && not <= 10) {
                v[not] ++;
            }
        }

        System.out.println("Frecuencia notas: ");

        for (int i = 0; i < v.length; i++) {
            if(v[i] > 0) {
                System.out.println("La nota " + i + " = " + v[i] + " veces");
            }
        }

        tec.close();
    }
}
