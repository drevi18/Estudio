import java.util.Scanner;

public class ejercicioPRG2_28{
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        //Acepta una serie de notas (finalizando con una negativa) y calcula la media
        
        int nota=0,cont=0,media=0, suma=0;
    
        do { 
            System.out.println("Introduce una nota");
            nota= tec.nextInt();
            cont++;
            suma= nota + suma;
            if(nota<0){
                cont= cont-1;
                suma= suma-nota;
            }
        } while (nota>=0);    

        media= suma/cont;

        System.out.println("La media es: "+media);
    }
}