package tema6;

import java.util.Scanner;

public class PRG6_1 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        System.out.println("Intoduce el sueldo del empleado:");
        double sueld= tec.nextDouble();

        Empleado e1= new Empleado("pepe",20,sueld);
        Encargado en= new Encargado("pepa",25,sueld);

        e1.getSalario();
        en.getSalario();
    }
}
