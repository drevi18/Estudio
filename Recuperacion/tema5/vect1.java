
import java.util.Scanner;



public class vect1 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int[] vec = new int[5];
        int cont=0;

        System.out.println("Introduce 5 números, introduce solo 1 negativo");
        do { 
            int num = tec.nextInt();
            vec[cont]=num;
            cont++;
            
        } while (cont < vec.length);
        
        Buscar(vec);

    }

    public static void Buscar(int[] vec){
        boolean terminar = false;
        int cont=0;
        do { 
            if (vec[cont] < 0) {
                System.out.println("Encontrado el número "+vec[cont]+" en la posición "+(cont+1));
                terminar = true;
            }
            cont++;
        } while (terminar == false);
        
    }
}
