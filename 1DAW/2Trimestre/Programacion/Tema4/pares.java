import java.util.Scanner;

public class pares {
    public static void main(String[]args){
        Scanner tec= new Scanner(System.in);

        System.out.println("Introduce el número inicial:");
        int in= tec.nextInt();
        System.out.println("Introduce el número final:");
        int fn= tec.nextInt();

        int resultado=pares(in, fn);
        System.out.println("Los numeros pares entre el "+in+" y el "+fn+" son: "+resultado);
    }

    public static int pares(int in,int fn){
       if (in > fn) {
            return  0;
        }
        if (in % 2 == 0) {
            System.out.println(in);
        }
         return pares(in + 1, fn);
    }
}
