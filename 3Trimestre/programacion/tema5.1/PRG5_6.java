
import java.util.Scanner;

// Ingresar una cadena y determinar cuantas palabras se encuentran en la cadena. Cada palabra se separa por medio de un espacio en blanco.


public class PRG5_6 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        String s1= new String();
        String s2= new String(" ");
        System.out.println("Introduce una frase");
        s1= tec.nextLine();

        int cont=1;
        
        for (int i = 0; i < s1.length(); i++) {
            
            if (s1.charAt(i)==s2.charAt(0)) {
                cont++; 
            }
        }


        System.out.println("En total hay "+cont+" palabras");


    }
}
