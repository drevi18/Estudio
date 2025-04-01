
import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        //Haz un programa que con los dos catetos te de la hipotenusa de un triángulo usando el teorema de pitágoras 
        double cat1, cat2;
        System.out.println("Introduce el primer cateto: ");
        cat1= tec.nextDouble();
        System.out.println("Introduce el segundo cateto: ");
        cat2= tec.nextDouble();

        double formhip;
        formhip= Math.sqrt(cat1*cat1+cat2*cat2);
        System.out.println("La hipotenusa del triangulo es: "+formhip); 

    }
}    

