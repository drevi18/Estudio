import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[]args){
        Scanner tec= new Scanner(System.in);

        //Un programa que pase de radaianes a grados sexagesimales
        double rad;
        System.out.println("Introduce el ángulo en radianes:");
        rad= tec.nextDouble();

        double form= rad *(180/Math.PI);
        System.out.println("Grados: "+form);




    }

}
