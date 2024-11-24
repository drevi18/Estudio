import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        //Volumen de un cilindro
        double rad, alt;
        System.out.println("Introduce el radio del circulo: ");
        rad = tec.nextDouble();
        System.out.println("Introduce la alura: ");
        alt = tec.nextDouble();

        double form= Math.PI*(rad*rad)*alt;
        System.out.println("El volumen del cilindro es:"+form);
        

    }
}
