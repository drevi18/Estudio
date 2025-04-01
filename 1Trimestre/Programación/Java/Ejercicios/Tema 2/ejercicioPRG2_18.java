
import java.util.Scanner;

public class ejercicioPRG2_18 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        //Multiplica 2 números enteros aceptados por teclado, mediante sumas sucesivas.

        System.out.println("Introduce un número entero:");
        int num1= tec.nextInt();
        System.out.println("Introduce otro número entero:");
        int num2= tec.nextInt();
        int i,suma=0;
        for(i=0;i<num2;i++){
            suma +=num1;
        }
        System.out.println("La multiplicación de "+num1+" * "+num2+" = "+suma);
    }
}
