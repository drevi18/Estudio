
import java.util.Scanner;

public class chatgpt7 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

    //Calcula las rices de la ecaucaión de 2 grado

    float a,b,c;
    System.out.println("Introduce el primer número:");
    a= tec.nextFloat();
    System.out.println("Introduce el segundo número:");
    b= tec.nextFloat();
    System.out.println("Introduce el tercer número:");
    c= tec.nextFloat();

    double formula= Math.sqrt((b*b)-4*a*c);
    System.out.println("Raiz cuadrada: "+formula);


    }
}
