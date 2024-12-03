import java.util.Scanner;

public class ejercicioPRG2_32 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        float num, men = 0;

        System.out.println("Introduce un número:");
        men = tec.nextFloat();

        for (int i = 1; i < 3; i++) {
            System.out.println("Introduce otro número:");
            num = tec.nextFloat();
            if (num < men) { 
                men = num;
            }
        }

        System.out.println("El número menor es: " + men);
    }
}
