
import java.util.Scanner;

public class ejercicioPRG2_12 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        //Acepta la fecha en formato numérico (dd, mm y aaaa) y muestra por pantalla un mensaje si la fecha es o no correcta. 
        //Un año es bisiesto si es divisible entre 4 pero no entre 100, excepto aquellos años que son divisibles entre 400, que sí son

        System.out.println("Introduce el día: dd");
        int dia= tec.nextInt();
        System.out.println("Introduce el mes: mm" );
        int mes= tec.nextInt();
        System.out.println("Introduce el año: aaaa");
        int año= tec.nextInt();

        int bisiesto4= 4;
        int NoBisiesto= 100;
        int excepcion= 400;

        if (dia<1||dia>31){
            System.out.println("Día incorrecto");
        }else 
        System.out.println(dia);
        if (mes<1||mes>12) {
            System.out.println("Mes incorrecto");
        }else 
        System.out.println(mes);
        if(año<0000||año>2024){
            System.out.println("Año incorrecto");
        }else 
        System.out.println(año);

        if (año%bisiesto4==0&&año%excepcion==0){
            System.out.println("Es bisiesto");
        }else if(mes%NoBisiesto!=0){
            System.out.println("No es bisiesto");
        }
    }
}

