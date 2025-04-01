package chatgpt1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        System.out.println("Introduce que quieres modificar un pajaro[1] o un mamifero[2] :");
        int n1= tec.nextInt();

        switch (n1) {
            case 1:
                System.out.println("Dime de que color tiene las plumas: ");
                String color=tec.next();

                Pajaro p1= new Pajaro(color);
                System.err.println(" ");
                System.err.println("El pájaro de plumas color "+p1.getPlumas()+" hace este sonido "+p1.hacerSonido()+" Se alimenta asi "+p1.Alimentarse()+" y se mueve así "+p1.moverse());

                break;
            case 2:
                break;
            default:
            System.out.println("Introduce una selección válida");
        }
    }
}
