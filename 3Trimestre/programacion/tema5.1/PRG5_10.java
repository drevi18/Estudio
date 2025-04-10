
import java.util.Scanner;

// Ingresar una frase y modificarla convirtiendo el primer carácter de cada palabra si esta fuera una letra, de minúsculas a mayúsculas.

public class PRG5_10 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        String s1= new String();
        System.out.println("Introduce una frase");

        String resultado= cambiar(s1);
    }

    public static String cambiar(String s1){
        String[] palabras= s1.split("\\s+");
        StringBuilder nueva= new StringBuilder();

        for (int i = 0; i < palabras.length; i++) {
            if(!palabras.isEmpty() && )
        }
            
    }


}

