
import java.util.Scanner;

public class cont {
    public static void main (String [] args){
        Scanner tec = new Scanner(System.in);
        int num;
        boolean atras = false;

        

        System.out.print("Dame numero inicial: ");
        num = tec.nextInt();
        int comp = num;
        if (num < 0) {
            System.out.println("Escribeme un número positivo");
        }else {

            System.out.println("Contador descendente: ");
            contador (num, comp, atras); 
        
        }
 


}


    public static void contador(int num, int comp, boolean atras){
        
        if (atras == false) {
            
            if (num == 0) {
                num = 0;
                System.out.println(num);
                atras = true;
            }else{
                System.out.println(num);
                contador(num -1,comp,atras);
            }
        }
            if (atras == true) {
                
                System.out.println("Contandor ascendente");
                System.out.println(num +" numero");
                num =-num;
                if (num == comp) {
                    System.out.println(num);
                }else{
                    System.out.println(num);
                    contador(num +1,comp,atras);
                }
            }
        

        
    }
}
