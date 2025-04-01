
import java.util.Scanner;

public class ejercicioPRG2_25 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        //Acepta 10 enteros y muestra el par mayor y el impar menor.

        int cont=0,par=0,imp=0;
        while (cont<=10){
            System.out.println("Introduce un número entero");
            int num= tec.nextInt();

            if(num%2==0){
                par= num+2;
                imp= num-1;
            }
            if (num%2!=0){
                par=num+1;
                imp=num-2;
            }

                System.out.println("El par mayor de "+num+" es "+par+" y el impar menor es "+imp);
        }
    }

}

