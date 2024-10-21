
import java.util.Scanner;

public class ejercicioPRG2_8 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        //Acepta un número entero por teclado, y muestra un mensaje indicando si el número es positivo, negativo o nulo.

        System.out.println("Introduce un número entero");
        int num= tec.nextInt();

        if (num<0){
            System.out.println("Negativo");
        }else if (num==0){
            System.out.println("Nulo");
        }else if(num>=1){
            System.out.println("Positivo");
        }
    }
}
