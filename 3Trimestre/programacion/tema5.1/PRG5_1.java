
import java.util.Scanner;

// Contar el número de vocales que se encuentran en una cadena

public class PRG5_1{
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        
        String s1= new String();
        String s2= new String("AEIOU");

        System.out.println("Introduce una palabra ");
        s1 = tec.nextLine();
        

        int cont=0;

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                char comp1, comp2;
                comp1= s1.charAt(i);
                comp2= s2.charAt(j);
                if (comp1==comp2) {
                    cont++;
                } 
            }
        }

        System.out.println("En total en la frase "+s1+" hay "+cont+" vocales ");

    
    }
}