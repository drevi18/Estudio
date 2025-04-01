
import java.util.Scanner;

public class ejercicioPRG2_29{
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        //Acepta la temperatura de 10 días, 5 por día, indicando cuantos días la temperatura media fue < 0.

        int i,dia=0,temp,med=0;
        while (dia<10){
            dia++;
            System.out.println("Día "+dia);
            for(i=1; i<=5;i++){
                System.out.println("Introduce la temperatura");
                temp= tec.nextInt();

                if (temp<0){
                    med++;
                }
            }
        } 
        System.out.println("Los días que la temperatura ha sido <0 han sido: "+med);
    }
}