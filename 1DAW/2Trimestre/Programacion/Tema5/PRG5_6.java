
import java.util.Scanner;

/*Programa que lea un número positivo de 10 cifras y compruebe si es capicua utilizando un vector de números enteros
 de 10 componentes. Valida la entrada. */
public class PRG5_6 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        int []v= new int[10];
        int i,aux=0;
        System.out.println("Introduce un número entero de 10 cifras");
        int num=tec.nextInt();

        for ( i = 0; i < v.length; i++) {
            v[i]=num%10;
            num/=10;
        }

            for ( i = 0; i < v.length; i++) {
                if(v[i]==v[v.length - 1 - i]){
                    aux++;
                }
            }
            if(aux==v.length){
                System.out.println("Es capicua");
            }else{
    
                System.out.println("No es capicua");
            }
        }

}
