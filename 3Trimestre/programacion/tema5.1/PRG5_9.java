import java.util.Scanner;

// Hacer un programa que al recibir como dato una cadena de caracteres que represente una fecha 
// en formato (dd/mm/aaaa), genere otra cadena con la misma fecha pero con formato (dd de nombre del mes de aaaa). 
// Por ejemplo si se ingresa la cadena: 20/11/2006 la otra cadena será: 20 de Noviembre de 2006

public class PRG5_9 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio","julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

        System.out.println("Escribe una fecha en el siguiente formato dd/mm/aaaa");
        String fecha = tec.nextLine();

        String dia = fecha.substring(0, 2);
        String mesStr = fecha.substring(3, 5);
        String anio = fecha.substring(6);

        int mes = Integer.parseInt(mesStr);

        if (mes >= 1 && mes <= 12) {
            String resultado = dia + " de " + capitalizar(meses[mes - 1]) + " de " + anio;
            System.out.println("Fecha convertida: " + resultado);
        } else {
            System.out.println("Mes inválido.");
        }
    }

    public static String capitalizar(String mes) {
        return mes.substring(0, 1).toUpperCase() + mes.substring(1);
    }
}
