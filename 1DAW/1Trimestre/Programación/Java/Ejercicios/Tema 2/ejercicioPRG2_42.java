import java.util.Scanner;

public class ejercicioPRG2_42{
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        //Algoritmo que determina si dos números enteros positivos son amigos. 
        //(Dos números son amigos si la suma de los divisores del primero, excepto él mismo, es igual al segundo, y viceversa.)

        int n1,n2;
        System.out.println("Introduce un número");
        n1= tec.nextInt();
        System.out.println("Introduce otro número");
        n2= tec.nextInt();
        
        while (n1<0) { 
            System.out.println("Introduce un número");
            n1= tec.nextInt();
            
        }
        
    }
}