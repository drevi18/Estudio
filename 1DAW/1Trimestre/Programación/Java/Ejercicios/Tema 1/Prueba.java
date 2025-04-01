import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Introduce tu año de nacimiento");
    int ma = scanner.nextInt();
    System.out.println("Introduce tu mes de nacimiento");
    int mm = scanner.nextInt();
    System.out.println("Introduce tu dia de nacimiento");
    int md = scanner.nextInt();
    System.out.println("Introduce el año actual");
    int aa = scanner.nextInt();
    System.out.println("Introduce el mes actual");
    int mea = scanner.nextInt();
    System.out.println("Introduce el dia actual");
    int da = scanner.nextInt();



    if (mea == mm && da == md && aa - ma ==20 ) {
        System.out.println("Si"); 
    } else {
        System.out.println("NO");
    }



    scanner.close();
}
}