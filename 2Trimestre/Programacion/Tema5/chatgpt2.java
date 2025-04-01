
import java.util.Scanner;

class Libro{
    private String titulo;
    private String autor;
    private int aniopub;


    public Libro( ){
        titulo=" ";
        autor=" ";
        aniopub=0;
    }
    public Libro( String titulo, String autor, int aniopub){
        this.titulo=titulo;
        this.autor=autor;
        this.aniopub=aniopub;
    }

    public void Mostrar(){
        System.out.println("Nombre: "+autor+" obra: "+titulo+" año: "+aniopub);
    }
}

public class chatgpt2 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
         Libro [] l= new Libro[2];

         for (int i = 0; i < l.length; i++) {
             System.out.println("Introduce la obra ");
             String ob= tec.nextLine();
             System.out.println("Introduce el autor ");
             String aut= tec.nextLine();
             System.out.println("Introduce el año de publicación ");
             int anio= tec.nextInt();
             tec.nextLine();

            l[i]= new Libro(ob,aut,anio);
         }

         for (int i = 0; i < l.length; i++) {
             l[i].Mostrar();
         }
    }
}
