
import java.util.Scanner;

public class ejrcicioPRG2_31 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        //En un determinado comercio se realiza un descuento dependiendo del precio de cada producto. 
        //Si el precio es inferior a 6 euros, no se hace descuento; si es mayor o igual a 6 euros y menos que 60 euros, 
        //se hace un 5 por 100 de descuento, y si es mayor o igual a 60 euros, se hace un 10 por 100 de descuento. 
        //Hacer el algoritmo que lee el precio de un producto y nos calcula y escribe su precio final. 


        float prod, desc1=0,desc2=0, pfin=0, DES5=0.05f,DES10=0.10f;
        System.out.println("Introduce el precio del producto");
        prod= tec.nextFloat();

        if (prod<6){
            pfin= prod;
        }else if (prod>=6&&prod<60) {
            desc1=prod*DES5;
            desc1=prod-desc1;
            pfin=desc1;
        }else{
        desc2=prod*DES10;
        desc2=prod-desc2;
        pfin=desc2;
        }
        System.out.println("El precio final del producto es; "+pfin);
    }
}
