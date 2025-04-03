import java.util.Scanner;

public class PRG5_2 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        String s1 = new String();
        String s2 = new String("aeiou");

        System.out.println("Escribe una frase");
        s1 = tec.nextLine();
        int cont = 0;

        for (int i = 0; i < s1.length(); i++) {
            char com1 = s1.charAt(i);

            if (!s2.contains(String.valueOf(com1).toLowerCase()) && Character.isLetter(com1)) {
                cont++;
            }
        }

        System.out.println("En total la frase " + s1 + "contiene " + cont + " consonantes");
    }
}