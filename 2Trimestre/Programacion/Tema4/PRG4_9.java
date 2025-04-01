import java.util.Scanner;

public class PRG4_9 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Introduce el número");
        int num = tec.nextInt();

        System.out.println("Fibonacci del número: "+num+" es: "+numero(num));
        
    }

    public static int numero(int num) {
        int result;
        if (num == 0) {
            result = 0; 
        } else if (num == 1) {
            result = 1; 
        } else {
            result = numero(num - 1) + numero(num - 2);
        }

         return result;
    }
}
