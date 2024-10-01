
import java.util.Scanner;

public class chatgpt6 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

    //Escribe un programa que convierta una velocidad introducida en 
    //kilómetros por hora (km/h) a metros por segundo (m/s). Usa la fórmula 

    float velocidadkm, velocidadms;
    System.out.println("Introduce la velocidad en k/h:");
    velocidadkm= tec.nextFloat();

    velocidadms= velocidadkm/3.6f;
    System.out.println(velocidadms+"m/s");

    }
}
