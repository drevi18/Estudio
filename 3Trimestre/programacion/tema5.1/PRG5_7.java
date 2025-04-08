
import java.util.Scanner;

// Leer una frase y encontrar la palabra de mayor longitud. 
// El programa debe imprimir la palabra como el número de caracteres de la misma


public class PRG5_7 {
        public static void main(String[] args) {
            Scanner tec= new Scanner(System.in);

            String s1= new String();
            String s2= new String(" ");
            int cont=0;
            int igualar=0;

            System.out.println("Introduce palabras aleatorias, la última palabra tiene que acabar con un espacio");
            s1= tec.nextLine();

            for (int i = 0; i <= s1.length()-1; i++) {
                
                if (s1.charAt(i)==s2.charAt(0)) {
                    
                    if (igualar<cont) {
                        igualar=cont;
                        cont=0;
                    }
                    cont=0;

                }else
                cont++;

            }
            System.out.println("La palabra más larga tiene "+igualar+" carácteres");

        }
}
