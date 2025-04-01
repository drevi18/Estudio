
import java.util.Scanner;

public class ejercicioPRG2_30 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        //Acepta un número entero y comprueba si es primo o no.

        System.out.println("Introduce un número entero");
        int num= tec.nextInt();

        if (num%2==0){
            System.out.println("Es primo");
            
        }else 
        System.out.println("No es primo ");

    }
}
