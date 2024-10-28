
import java.util.Scanner;

public class ejercicioPRG2_21 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        //Calcula el cociente de 2 números enteros aceptados por teclado mediante restas sucesivas.

        System.out.println("Introduce el primer número:");
        int n1= tec.nextInt();
        System.out.println("Introduce el segundo número:");
        int n2= tec.nextInt();
        int div,coc=0;

        while (n1<=n2){
        n1-=n2;
        coc ++;
        }
        System.out.println("El resultado es: "+ coc);   
   }
}
