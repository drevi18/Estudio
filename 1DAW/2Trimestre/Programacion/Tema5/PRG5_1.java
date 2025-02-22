
import java.util.Random;
import java.util.Scanner;

public class PRG5_1 {

    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        Random random= new Random();
        
        System.out.println("Introduce un número del 1 al 10 que sea el menor");
        int num= tec.nextInt();
        System.out.println("Introduce otro número diferente que sea mayor al anterior");
        int num2= tec.nextInt();

        int [] numeros = new int [10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(10);
            if(numeros[i]>=num&&numeros[i]<=num2){
                System.out.println(numeros[i]);
            }
        }
    }
}