
import java.util.Scanner;

public class ejercicioPRG2_35 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        
        //Algoritmo que lee como datos de entrada una fecha expresada en día (del 1 al 31), 
        //mes (del 1 al 12) y años (en número) y nos dice la fecha que será el día siguiente. 
        //Se supondrá que febrero tiene siempre 28 días.


        int d,m,a,fech;
        System.out.println("Introduce el día:");
        d= tec.nextInt();
        System.out.println("Introduce el mes:");
        m= tec.nextInt();
        System.out.println("Introduce el año:");
        a= tec.nextInt();

        fech= a*100000000+m*10000+d*100;
    }
}
