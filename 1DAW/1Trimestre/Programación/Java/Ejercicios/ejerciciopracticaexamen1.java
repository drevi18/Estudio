import java.util.Scanner;
import javax.swing.text.Position;
public class ejerciciopracticaexamen1 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        //haz un programa que le pida al usuario una letra, y te muestre la siguiente letra del abecedario
    char letra;
    System.out.println("Introduce una letra: ");
    letra =tec.next().charAt(0);   
    
   char letra2= letra++;
    System.out.println("La siguiente letra de "+letra2+" es "+letra);

    }
}

