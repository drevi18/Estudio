
import java.util.ArrayList;
import java.util.Scanner;

/*Escribe un programa que lee una secuencia de calificaciones(números enteros entre 0 y 10). 
La secuencia termina cuando se introduce un número menor que 0 o mayor que 10. 
Se obtiene e imprime una lista de frecuencias (número de repeticiones) de cada una de las notas. */

public class pruebaAL {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        ArrayList<Integer> v = new ArrayList<>();
        boolean check= false;

        System.out.println("Introduce las notas de los alumnos, para salir escribe un numero < 0 || >10"); 
        while (check==false) {
            int not= tec.nextInt();
            v.add(not);
            Mostrar(v);
            if (not<0||not>10) {
                check=true;
            }
        }
    }

    public static void Mostrar ( ArrayList<Integer> v){
        for (int i = 0; i <v.size(); i++) {
            System.out.println("notas: "+v);
        }
    }

    publi
}
