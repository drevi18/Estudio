
import java.util.Scanner;

public class ejercicioPRG2_5 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        //Algoritmo que lee tres números cualesquiera y nos indica todas sus relaciones de igualdad

        System.out.println("Introduce el primer número");
        float n1= tec.nextFloat();
        System.out.println("Introduce el segundo número");
        float n2= tec.nextFloat();
        System.out.println("Introduce el tercer número");
        float n3= tec.nextFloat();

        if(n1==n2&&n2==n3){
            System.out.println("Los tres son iguales");
        }else if(n1==n2&&n2!=n3){
            System.out.println(n1+" es igual que "+n2+" y diferente que "+n3);
        }else if(n1==n3&&n3!=n2){
            System.out.println(n1+" es igual que "+n3+" y diferente que "+n2);
        }else if(n1!=n2&&n2==n3){
            System.out.println(n2+" es igual que "+n3+" y diferente que "+n1);
        }else if(n1!=n2&&n2!=n3){
            System.out.println("Ninguno es igual");
    }
}
}