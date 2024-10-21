
import java.util.Scanner;

public class ejercicioPRG2_9 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        //Acepta un número entero por teclado, y muestra por pantalla su valor absoluto.

        System.out.println("Introduce un número entero");
        int num= tec.nextInt();

        if (num<0){
            System.out.println("Valor absoluto= "+-(num));
        }else if(num>=0){
        System.out.println("Valor absoluto= "+num);
        }
    }
}
