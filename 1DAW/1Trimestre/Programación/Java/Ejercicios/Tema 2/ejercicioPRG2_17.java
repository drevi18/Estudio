import java.util.Scanner;

public class ejercicioPRG2_17 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        //Muestra por pantalla la suma de los 50 primeros naturales, empezando desde el 0

        int i,sum=0;
        for(i=0;i<=50;i++){
            sum= sum+i;
        }
        System.out.println("La suma de los primeros 50 números naturales:"+sum);
    }
}
