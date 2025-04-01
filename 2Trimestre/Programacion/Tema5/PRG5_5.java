
import java.util.Scanner;

/*Realiza un programa que lee 20 números reales y saca por pantalla aquellos que sean mayores que la media. */
public class PRG5_5 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        int cont=0,i;
        double suma=0,aux, media;
        double []v=new double[20];
        
        System.out.println("Introduce los números reales ");
        for (i = 0; i < v.length; i++) {
            v[i]=tec.nextDouble(); 
            cont++;       
        }

        for ( i = 0; i < v.length; i++) {
            suma += v[i];
        }
        media=suma/cont;
        System.out.println("Suma "+suma+ "media "+media);
        Mostrar(v,media);
    }

    public static void Mostrar (double v[], double media){
        for (int i = 0; i <v.length; i++) {
            if(v[i]>media){
            System.out.println(v[i]);
            }
        }
    }
}
