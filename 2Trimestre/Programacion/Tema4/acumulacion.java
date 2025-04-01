
import java.util.Scanner;

public class acumulacion {
    public static void main(String[]args){
      Scanner tec= new Scanner(System.in);
      
      System.out.println("Introduce el número inicial: ");
      int in=tec.nextInt();
      System.out.println("Introduce el número final: ");
      int fn=tec.nextInt();


      contador(in, fn);
      System.out.println();
    }

    public static int contador(int in, int fn){

        if (in>fn) {
            return 0;
        }
        System.out.println(in);
        return contador(in + 1, fn);
    }
}
