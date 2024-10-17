
import java.util.Scanner;

public class ejercicioPRG2_7 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        //Acepta un carácter inicial de una calificación (I, s, B, N, S) y 
        //muestra el mensaje alfabético de la nota correspondiente (Insuficiente, suficiente, Bien, ...). 

        System.out.println("Introduce la nota");
        float nota= tec.nextFloat();

        if (nota>=0&&nota<=4.5){
            System.out.println("Insuficiente");
        }else if (nota>=4.6&&nota<=5.99){
            System.out.println("Suficiente");
        }else if (nota>=6&&nota<=6.99) {
            System.out.println("Bien");
        }else if(nota>=7&&nota<=8.99){
            System.out.println("Notable");
        }else if(nota>=9&&nota<=10){
            System.out.println("Sobresaliente");
        }
   }
}
