import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[]args){
        Scanner tec= new Scanner(System.in);
        //descomponer números 
    int num,mil,cent,dec,unid;
    System.out.println("Introduce un número entero de 4 cifras:");
        num=tec.nextInt();

    mil=num/1000;
    cent= num/100%10;
    dec= num/10%10;
    unid= num%10;
    System.out.println("Milesimas: "+mil+" Centesimas: "+cent+" decimas "+dec+" unidad "+unid);


    }
}
