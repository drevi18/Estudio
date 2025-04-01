import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[]args){
        Scanner tec= new Scanner(System.in);
        //Escribe un programa en Java que tome tres números enteros 
        //ingresados por el usuario y determine cuál de los tres es el mayor 
        //utilizando operadores ternarios. El programa debe mostrar cuál es el número mayor al final.

    int num1,num2,num3;
    System.out.println("Introduce el primer número entero:");
    num1= tec.nextInt();
    System.out.println("Introduce el segundo número entero:");
    num2= tec.nextInt();
    System.out.println("Introduce el tercer número entero:");
    num3= tec.nextInt();
    
  System.out.println( (num1>=num2&&num2>=num3)? "El número mayor es: "+num1: (num1<num2&&num2>num3)? "El número mayor es: "+num2: "El número mayor es: "+num3 );
  


    }
}
