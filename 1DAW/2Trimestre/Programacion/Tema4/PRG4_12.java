
import java.util.Scanner;

public class PRG4_12 {
        public static void main(String[] args) {
            Scanner tec= new Scanner(System.in);

            System.out.println("Introduce el 1º número");
            int num1= tec.nextInt();
            System.out.println("Introduce el 2º número");
            int num2= tec.nextInt();
            int resultado= mcd(num1, num2);
            System.out.println(resultado);
        }
    
        public static int mcd(int num1, int num2) {
            int resultado;
            
            if (num1%num2 ==0) {
                resultado = num2;
            } else {
                resultado = mcd(num2, num1 % num2);
            }
            return resultado;
    }
}
