import java.util.Scanner;

public class chatgpt5 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

    //Escribe un programa que calcule el volumen de una pirámide rectangular. 
    //El programa debe pedir la longitud de la base, la anchura de la base y la altura de la pirámide. Usa la fórmula 

    double lonbase, anchbase, altpiramide;
    System.out.println("Da la longitud de la base de la piramide:");
    lonbase=tec.nextDouble();
    System.out.println("Da la anchura de la base de la piramide:");
    anchbase=tec.nextDouble();
    System.out.println("Da la altura de la piramide:");
    altpiramide=tec.nextDouble();

    double volumen= 1.0/3.0*(lonbase*anchbase)*altpiramide;
    System.out.println("Volumen pirmide: "+ volumen);

    }
}
