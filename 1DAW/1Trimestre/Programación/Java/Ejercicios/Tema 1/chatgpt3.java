
import java.util.Scanner;

public class chatgpt3 {
    public static void main(String[] args) {
    Scanner tec= new Scanner(System.in);
    
    //Escribe un programa que convierta una cantidad de segundos introducida por el usuario a 
    //horas, minutos y segundos. El programa debe pedir la cantidad de segundos y luego hacer la conversión.

    float seg;
    System.out.println("Introduce el tiempo en segundos");
    seg= tec.nextFloat();

    float conversegmin= seg/60;
    float converminhor= conversegmin/60;
    
    System.out.println("Minutos: "+conversegmin+" Horas: "+converminhor);


    }
}
