import java.util.Scanner;

public class ejercicioPRG2_32 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        //Algoritmo que lee tres números distintos y nos dice cuál de ellos es el menor.


        float num, men=0,alm=0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce un número");
            num= tec.nextFloat();
            alm=num;
            if (num<=alm) {
                men=num;
            }

        }
        System.out.println("El número menor es:"+men);
    }
}
