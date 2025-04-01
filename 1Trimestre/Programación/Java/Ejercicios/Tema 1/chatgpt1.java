
import java.util.Scanner;


public class chatgpt1 {
    public static void main(String[] args) {
        
        //Escribe un programa que convierta una cantidad de euros a dólares y libras esterlinas. El programa pedirá 
        //la cantidad en euros y las tasas de conversión para ambas monedas. Realiza el cálculo y muestra el resultado con dos decimales.

        Scanner tec= new Scanner(System.in);

        float eur,lib,dol;
        System.out.println("Introduce los euros:");
        eur= tec.nextFloat();
        System.out.println("Introduce la tasa de conversión a dólares:");
        dol= tec.nextFloat();
        System.out.println("Introduce la tasa de conversión a libras:");
        lib= tec.nextFloat();

        float ead= eur/dol;
        float eal= eur/lib;
        System.out.println("Dolares: "+dol+" Libras: "+lib); 

        tec.close();

    }
}
