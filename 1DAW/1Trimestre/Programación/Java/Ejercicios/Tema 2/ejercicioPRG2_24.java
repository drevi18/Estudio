import java.util.Scanner;

public class ejercicioPRG2_24 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        //Acepta un número entero (validando que no sea negativo) y muestra cuantos dígitos tiene.

        System.out.println("Introduce un número entero postivo ");
        int num= tec.nextInt();

        while(num<0){
            System.out.println("Introduce un número válido ");
            num= tec.nextInt();
        }

        int cont=0;
    while (num > 0) {
        num = num / 10; 
        cont = cont + 1;
        }
        System.out.println("Tiene "+cont+" dígitos");
    }
}
