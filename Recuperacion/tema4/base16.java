
import java.util.Scanner;

public class base16 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce el número en base 10 que quieras cambiar a base 16");
        int n = tec.nextInt();
        System.out.println("Iterativa:");
        FormItera(n);
        System.out.println(" ");
        System.out.println("Recursiva:");
        FormRec(n);

    }

    public static void FormItera(int n){
        if(n < 0){
            System.out.println("No puede ser un número negativo");
        }
        if (n >=0 && n <= 9) {
            System.out.println(n);
        }else{

            while (n > 0) { 
                int residuo = n % 16;
                char digitoHex ='?';
                if (n >=0 && n<=10) {
                    digitoHex = (char) ('0' + n);
                }

                    switch (residuo) {
                    case 10:
                
                        digitoHex = 'A'; 
                    break;
                    case 11:
                
                        digitoHex = 'B'; 
                    break;
                    case 12:
                
                        digitoHex = 'C'; 
                    break;
                    case 13:
                
                        digitoHex = 'D'; 
                    break;
                    case 14:
                
                        digitoHex = 'E'; 
                    break;
                    case 15:
                
                        digitoHex = 'F'; 
                    break;
                    default:
                        System.out.println(" "); 
                }
                n /= 16;
                System.out.print(digitoHex);
                
            }
        }
    }

    public static void FormRec(int n) {
    if (n < 0) {
        System.out.print("no puedes introduci numeros negativos");
    } else if (n >=0 && n <=9) {
        System.out.print(n);
    } else {
        if (n / 16 != 0) {
            FormRec(n / 16);
        }

        int residuo = n % 16;
        char digitoHex = '?';

        switch (residuo) {
            case 10:
        
                digitoHex = 'A'; 
            break;
            case 11:
        
                digitoHex = 'B'; 
            break;
            case 12:
        
                digitoHex = 'C'; 
            break;
            case 13:
        
                digitoHex = 'D'; 
            break;
            case 14:
        
                digitoHex = 'E'; 
            break;
            case 15:
        
                digitoHex = 'F'; 
            break;
            default:
                System.out.println(" "); 
            }
        System.out.print(digitoHex);
    }
}
}
