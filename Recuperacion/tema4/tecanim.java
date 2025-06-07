
import java.util.Scanner;

public class tecanim {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Como se llama tu mascota");
        String nom= tec.nextLine();
        System.out.println("[1] Gato");
        System.out.println("[2] Perro");
        int op = tec.nextInt();
        

        String raza;
        int anyos;

        switch (op) {
            case 1:
                System.out.println("Que raza es?");
                tec.nextLine();
                raza = tec.nextLine();
                System.out.println("Cuántos años tiene?");
                anyos = tec.nextInt();

                Gato gat = new Gato(nom, raza, anyos);
                gat.HacerSonido();
                gat.ImpGat();
                break;
            case 2:
            System.out.println("Que raza es?");
                tec.nextLine();
                raza = tec.nextLine();
                System.out.println("Cuántos años tiene?");
                anyos = tec.nextInt();

                Perro perr = new Perro(nom, raza, anyos);
                perr.HacerSonido();
                perr.ImpPerr();
                
                break;
            default:
                throw new AssertionError();
        }

    }
}
