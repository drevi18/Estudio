import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);


        String n="azul";
        System.out.println("1");
        String n1=tec.next();
        System.out.println("2");
        String n2=tec.next();
        System.out.println("3");
        String n3=tec.next();


        if (n.equals(n1)) {
            System.out.println("Esta bien");
        }else if(n==n2){
            System.out.println("p2");
        }else if(n==n3){
            System.out.println("p3");
            }


    }
}
