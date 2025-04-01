
import java.util.Scanner;
/**
 
Autora: Sara Gómez Torres
Descripción:

Fecha: 03/12/2024

Entrada: 

Proceso: 

Salida: 

**/
public class tecCoche {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        System.out.println("Introduce la marca del coche: ");
        String marca= tec.next();
        System.out.println("Introduce el modelo del coche: ");
        String modelo= tec.next();
        
        Coche c= new Coche(marca,modelo);

        System.out.println("El coche es de la marca "+c.getMarca()+" y su modelo es "+c.getModelo());

        System.out.println("----------------------");
        System.out.println("Para saber el consumo de tu coche especifica lo siguiente: ");

        System.out.println(" Kilómetros recorridos por el coche: ");
        double k=tec.nextDouble();

        System.out.println("Litros de combustible consumido: ");
        double l=tec.nextDouble();

        System.out.println("Velocidad media: ");
        double vmed=tec.nextDouble();

        System.out.println("Precio de la gasolina: ");
        double pgas=tec.nextDouble();

        Consumo con= new Consumo(k,l,vmed,pgas);

        System.out.println("El viaje ha durado "+con.getTiempo()+" h, se ha consumido de media "+con.getConsumoMedio()+" l/km y ha costado "+con.getConsumoEuros()+" euros el km");
    }
}
