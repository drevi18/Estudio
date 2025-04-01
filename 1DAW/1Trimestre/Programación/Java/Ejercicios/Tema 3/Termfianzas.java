
import java.util.Scanner;

public class Termfianzas {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        System.out.println("Introduce los dolares que quieras pasar a euros");
        double dol= tec.nextDouble();
        System.out.println("Introduce los euros que quieras pasar a dolares");
        double eur=tec.nextDouble();
        
        Fianzas f= new Fianzas();
        f.eurtodol(eur);
        f.doltoeur(dol);

        System.out.println(eur+" euros son "+f.eurtodol(eur)+" dolares");
        System.out.println(dol+" dolares son "+f.doltoeur(dol)+" euros");
    }
}
