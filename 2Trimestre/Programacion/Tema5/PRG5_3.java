
import java.util.Scanner;

/*Se dispone de un vector de enteros de 15 elementos, 
de los cuales solo están con datos las 8 primeras posiciones. 
Los datos almacenados en el vector están ordenados de forma creciente. 
Se pide solicitar un número entero al usuario y colocarlo en el lugar que le corresponda del vector, 
para que se mantenga el orden y sin quitar ningún elemento anterior. */

public class PRG5_3 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        
        int []num= new int[15];
        num[0]=1;
        num[1]=2;
        num[2]=3;
        num[3]=4;
        num[4]=5;
        num[5]=6;
        num[6]=7;
        num[7]=8;
        int cont=0,wl=0;
        Mostrar(num);
        
        
        while (wl!=7) { 
            wl++;
            System.out.println("Introduce un número hasta el 15");
            int n1= tec.nextInt();
            Localizar(num, n1,cont);
            Mostrar(num);
        }



    }

    public static void Mostrar(int num[]){
        for (int i = 0; i < num.length; i++) {
            System.out.println("Posición "+i+" número= "+num[i]);
        }
    }

    public static void Localizar (int num[], int n1, int cont){
        int var=-1;
        for (int i = 0; var<0; i++) {
            cont++;
            if(cont>num[i]){
                var++;
                num[i+1]=num[i];
                num[i]=n1;
                System.out.println("Putero");
            }
        }
    }
}
