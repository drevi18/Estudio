
import java.util.Scanner;

public class ejercicioPRG2_11 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        //Acepta fecha en formato numérico y muestra por pantalla el mes en formato alfabético (Enero, Febrero,...).

    System.out.println("Introduce el día:");
        int dia = tec.nextInt();
    System.out.println("Introduce el número del mes:");
        int NumMes = tec.nextInt();
    System.out.println("Introduce el año:");
        int año = tec.nextInt();


        if (NumMes<1&&NumMes>12){
            System.out.println("Introduce un número correcto para el mes");
        }


        String NombreMes= "";

    switch (NumMes) {
        case 1:
           NombreMes ="Enero";
        break;
        case 2:
            NombreMes= "Febrero";
        break;
        case 3:
            NombreMes="Marzo";
        break;
        case 4:
            NombreMes="Abril";
        break;
        case 5:
            NombreMes="Mayo";
        break;
        case 6:
            NombreMes="Junio";
        break;
        case 7:
            NombreMes="Julio";
        break;
        case 8:
            NombreMes="Agosto";
        break;
        case 9:
            NombreMes="Septiembre";
        break;
        case 10:
            NombreMes="Octubre";
        break;
        case 11:
            NombreMes="Noviembre";
        break;
        case 12:
            NombreMes="Diciembre";
        break;


        default:
            System.out.println("Error, introduce un número válido");;
        }      
        
        System.out.println(dia+" de "+ NombreMes+ " del "+ año);

    }
    
}