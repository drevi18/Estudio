
import java.util.Scanner;

public class CalCoc {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        int cont=0;

        System.out.println("Introduce el dividendo ");
        int div = tec.nextInt();
        System.out.println("Introduce el divisor ");
        int sor = tec.nextInt();

        System.out.println("Cociente: "+CalCoc(div, sor)+" Resto: "+CalRes(div, sor));

    }

   public static int CalCoc(int dividendo, int divisor) {
    int resultado;
    if (dividendo < divisor) {
        resultado = 0;
    } else {
        resultado = 1 + CalCoc(dividendo - divisor, divisor);
    }
    return resultado;
}

public static int CalRes(int dividendo, int divisor) {
    int resultado;
    if (dividendo < divisor) {
        resultado = dividendo;
    } else {
        resultado = CalRes(dividendo - divisor, divisor);
    }
    return resultado;
}

}
