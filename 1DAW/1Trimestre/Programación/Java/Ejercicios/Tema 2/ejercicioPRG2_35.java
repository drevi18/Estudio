
import java.util.Scanner;

public class ejercicioPRG2_35 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        
        //Algoritmo que lee como datos de entrada una fecha expresada en día (del 1 al 31), 
        //mes (del 1 al 12) y años (en número) y nos dice la fecha que será el día siguiente. 
        //Se supondrá que febrero tiene siempre 28 días.


        int d,m,a,fech,sum;
        System.out.println("Introduce el día:");
        d= tec.nextInt();

        while (d<0 || d>31){
            System.out.println("Introduce el día:");
            d= tec.nextInt();
        }
        
        System.out.println("Introduce el mes:");
        m= tec.nextInt();
        while (m<0||m>12){
        System.out.println("Introduce el mes:");
        m= tec.nextInt();
        }

        System.out.println("Introduce el año:");
        a= tec.nextInt();
        while (a<0||a>2024){
            System.out.println("Introduce el año:");
            a= tec.nextInt();
        }

        d=d+1;
        if (d>31) {
            m=m+1;
            d=0;
        }
         if (m>12){
                a=a+1;
                m=0;
        }
        System.out.println(d+"/"+m+"/"+a);
        
    }
}
