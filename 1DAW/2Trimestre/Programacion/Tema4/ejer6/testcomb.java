package ejer6;

import java.util.Scanner;

public class testcomb {
    public static void main(String[] args) {
    Scanner tec= new Scanner(System.in);
        
    System.out.println("Introduce el núm n");
    int n= tec.nextInt();
    System.out.println("Introduce el núm m");
    int m= tec.nextInt();

    Combinaciones c1= new Combinaciones(n,m);
    System.out.println(c1.getcombin());
    }
}
