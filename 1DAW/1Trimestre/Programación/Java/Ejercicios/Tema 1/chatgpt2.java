
import java.util.Scanner;

public class chatgpt2 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

    //Escribe un programa que calcule el índice de masa corporal (IMC) de una persona. 
    //El usuario debe introducir su peso en kilogramos y su altura en metros. Usa la fórmula IMC=peso/alt^2 (resultado con decimales)

    float pes, altur;
    System.out.println("Introduce tu peso en kg:");
    pes= tec.nextFloat();
    System.out.println("Introduce tu altura en metros:");
    altur= tec.nextFloat();

    float imc= pes/(altur*altur);
    System.out.println("IMC: "+imc);




    }
}
