
import java.util.Scanner;

public class manu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dineros[] = {500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};

        int contadi[] = new int[dineros.length];

        System.out.println("Dime cuanto dinero tienes");

        double di = scanner.nextDouble();

        while (di!=0){

            if (di>=500){
                di -=500;
                contadi[0]++;
                
            }else if (di>=200){
                di -=200;
                contadi[1]++;
                
            }else if (di>100){
                di -= 100;
                contadi[2]++;
            }else if (di>100){
                di -= 100;
                contadi[2]++;
            }else if (di>100){
                di -= 100;
                contadi[2]++;
            }else if (di>100){
                di -= 100;
                contadi[2]++;
            }else if (di>100){
                di -= 100;
                contadi[2]++;
            }else if (di>100){
                di -= 100;
                contadi[2]++;
            }else if (di>100){
                di -= 100;
                contadi[2]++;
            }
            


        }

    }
}
