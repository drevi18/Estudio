
import java.util.Scanner;

// Ingresar una cadena de caracteres formadas por números y letras, en ese orden y obtenga otra cadena 
// donde aparezca cada letra tantas veces como lo indique el numero que lo precede. Ejemplo: 
// Si la cadena es 2w4r5f debemos obtener la siguiente cadena: wwrrrrfffff

public class PRG5_5 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        String s1= new String();
        String s2= new String();

        System.out.println("Introduce una cadena compuesta por numeros y letras, en ese oorden, por ejemplo: 2w4r5f");
        s1= tec.nextLine();

        for (int i = 0; i < s1.length(); i++) {
            char comp = s1.charAt(i); 
            
            if (Character.isDigit(comp)) {
                int numero = comp - '0';                
                i++;
                char letra = s1.charAt(i); 
                for (int j = 0; j < numero; j++) {
                    s2 += letra;
                }
            }
        }

        System.out.println("La nueva cadena es "+s2);

    }
}
