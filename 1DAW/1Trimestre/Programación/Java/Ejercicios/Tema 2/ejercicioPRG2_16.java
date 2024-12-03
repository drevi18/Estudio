
import java.util.Scanner;

public class ejercicioPRG2_16 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        //Acepta 10 números enteros y muestra su suma.

        int num,i,sum=0;

        for (i=0;i<10;i++){
            System.out.println("Introduce un número entero:");
            num= tec.nextInt();
            sum= sum+num;
        }

        System.out.println("La suma de los 10 números es:"+sum);
    }
}
