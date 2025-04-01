
import java.util.Scanner;

public class PRG4_10 {
    public static void main (String[]args){
        Scanner tec=new Scanner(System.in);

        System.out.println("Introduce el número que convertir: ");
        int num=tec.nextInt();
        System.out.println("Introduce la base para transformar: ");
        int bas=tec.nextInt();

        int resultado=calculo(num, bas);
        System.out.println(resultado);
    }

    public static int calculo(int num, int bas){
        if(num/bas==0){
            return num;
        }
        System.out.println(num%bas);
        return calculo(num/bas,bas);
    }
}
