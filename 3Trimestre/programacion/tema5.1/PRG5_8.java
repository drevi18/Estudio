
import java.util.Scanner;

//Ingresar una cadena de caracteres y obtener otra con todos los caracteres de las posiciones impares de la cadena.

public class PRG5_8 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        String s1=new String();
        StringBuilder s2 = new StringBuilder();


        System.out.println("Escribe una frase");
        s1= tec.nextLine();

        for (int i = 0; i < s1.length(); i++) {
            if (i%2!=0) {
                s2.append(s1.charAt(i));
            }
        }
        
        System.out.println(s2);
    }
    
}
