import java.util.Scanner;

public class ejercicioPRG2_20 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        //Calcula la potencia de 2 números aceptados por teclado mediante productos

        int n1,n2,i,sum=1;
        System.out.println("Introduce el primer número");
        n1= tec.nextInt();
        System.out.println("INtroduce el segundo númro ");
        n2= tec.nextInt();

        if (n2 == 0){
            sum = 1;
        }else for (i = 1; i <= n2; i++){
                sum *= n1;
        }
        
        System.out.println("La potencia de "+n1+" y "+n2+" = "+sum);
    }
}
