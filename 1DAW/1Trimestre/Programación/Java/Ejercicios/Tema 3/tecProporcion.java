
import java.util.Scanner;

public class tecProporcion {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        System.out.println("Introduce los materiales que disponemos en el almacen en kg: ");
        System.out.println("Papas: ");
        double papas= tec.nextDouble();
        System.out.println("Chocos: ");
        double chocos= tec.nextDouble();

        Proporcion p= new Proporcion(papas,chocos);

        System.out.println("Nos da para atender a "+p.getPersonas());
    }
}
