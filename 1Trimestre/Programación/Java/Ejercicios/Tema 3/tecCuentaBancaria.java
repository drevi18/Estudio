
import java.util.Scanner;

public class tecCuentaBancaria {
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);

        System.out.println("Introduce tu nombre");
        String nombre= tec.next();
        System.out.println("Introduce el saldo inicial de la cuenta:");
        double saldo= tec.nextDouble();

        CuentaBancaria c1= new CuentaBancaria();
        CuentaBancaria c2= new CuentaBancaria(nombre,saldo);

        System.out.println("Introduce la cantidad a ingresar");
        double suma=tec.nextDouble();

        c1.depositar(suma);
        c2.depositar(suma);
        System.out.println("Tu cuenta 1 tiene ahora "+c1.MostrarSaldo()+" euros de saldo");
        System.out.println("Tu cuenta 2 tiene ahora "+c2.MostrarSaldo()+" euros de saldo");
        
        System.out.println(" ");
        System.out.println("---------------------------");
        System.out.println(" ");

        System.out.println("Introduce la cantidad a retirar");
        double resta=tec.nextDouble();
        
        c1.retirar(resta);
        c2.retirar(resta);
        System.out.println("Tu cuenta 1 tiene ahora "+c1.MostrarSaldo()+" euros de saldo");
        System.out.println("Tu cuenta 2 tiene ahora "+c2.MostrarSaldo()+" euros de saldo");
    }
}
