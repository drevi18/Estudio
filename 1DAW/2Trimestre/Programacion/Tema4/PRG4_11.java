
import java.util.Scanner;

public class PRG4_11{
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        System.out.println("Introduce n:");
        int n=tec.nextInt();
        System.out.println("Introduce x:");
        double x=tec.nextInt();
        
        double resultado=potencia(n, x);
        System.out.println(resultado);
    }

    public static Double potencia(int n, double x){

        if(n==1){
            return x;
        }
        System.out.println(x);
        return potencia(n-1, x*x);
    }
}