
import java.awt.AlphaComposite;
import java.util.Scanner;

public class ejercicioPRG2_4{
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        //Algoritmo que lee una calificación numérica entre 0 y 10 y la transforma en calificación alfabética, escribiendo el resultado.

        float num;
        System.out.println("Introduce la calificación");
        num= tec.nextFloat();

        if(num>=0&&num<=4.5){
            System.out.println("Suspenso");
        }else if(num>=4.6&&num<=5.99){
            System.out.println("Suficiente");
        }else if(num>=6&&num<=6.99){
            System.out.println("Bien");
        }else if(num>=7&&num<=8.99){
            System.out.println("Notable");
        }else if(num>=9&&num<=10){
            System.out.println("Sobresaliente");
        }
      
    }
}