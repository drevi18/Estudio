
import java.util.Scanner;

public class ejercicioPRG2_22 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);


        //Algoritmo que lee un número entero y positivo N y escribe los N primeros términos de la sucesión de Fibonacci. 
        //La sucesión se caracteriza porque cada término es igual a la suma de sus dos anteriores, a0=1; a1=1; an=an-1 + an-2

        System.out.println("Introduce un número entero y positivo");
        int num= tec.nextInt();

        while (num<0) {
            System.out.println("Introduce un número válido"); 
            num = tec.nextInt();
        }

        int i, a0=1, a1=1, an;
        for ( i = 1; i <= num; i++){
            an = a0 + a1;  
            System.out.println(an);  
            a0 = a1;
            a1 = an;
        }


    }
}
