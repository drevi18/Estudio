
import java.util.Scanner;

public class ejercicioPRG2_6 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        //Algoritmo que recibe como datos de entrada una hora expresada en horas,
        // minutos y segundos que nos calcula y escribe la hora, minutos y segundos que serán, transcurrido un segundo.
        
        System.out.println("Introduce las horas");
        int hor=tec.nextInt();
        System.out.println("Introduce los minutos");
        int min=tec.nextInt();
        System.out.println("Introduce los segundos");
        int seg=tec.nextInt();

        if (seg==59) {
            seg=0;
            min++;
        }else if(min==59){
            min=0;
            hor++;
        }else if(hor==23){
            hor=0;
        }
        System.out.println("Tiempo + 1s= "+hor+"h"+min+"min"+seg+"s");
    }
}
