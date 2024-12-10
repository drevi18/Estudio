
import java.util.Scanner;

public class tecProducto {
    public static void main(String[] args) {
     Scanner tec= new Scanner(System.in);
     

    Producto p=null;
    int menu;
     

     do { 
         System.out.println("¿Que quieres hacer?");
         System.out.println("");
         System.out.println("[1] Introducir solamente el nombre del producto");
         System.out.println("[2] Introducir todos los datos del producto");
         System.out.println("[3] Resetear el nombre");
         System.out.println("[4] Resetear el precio");
         System.out.println("[5] Resetear el stock");
         System.out.println("[6] Imprimir el nombre");
         System.out.println("[7] Imprimir el precio");
         System.out.println("[8] Imprimir el stock");
         System.out.println("[9] Imprimir toda la información");
         System.out.println("[10] Añadir cantidad al stock");
         System.out.println("[11] Quitar cantidad al stock");
         System.out.println("[0] Salir ");

         menu= tec.nextInt();

         switch (menu) {
             case 1 :
                System.out.println("Introduce el nombre del producto: ");
                String nombre=tec.next();
                p= new Producto(nombre);
             break;

             case 2 :
                System.out.println("Introduce el nombre del producto");
                nombre=tec.next();
                System.out.println("Introduce el precio del producto");
                double precio=tec.nextDouble();
                System.out.println("Introduce el stock del producto");
                int stock=tec.nextInt();
                p= new Producto(nombre,precio,stock);
             break;

             case 3 :
                System.out.println("Introduce el nuevo nombre del producto: ");
                nombre=tec.next();
                p.setNombre(nombre);
             break;

             case 4 :
                System.out.println("Introduce el nuevo precio del producto: ");
                precio=tec.nextDouble();
                p.setPrecio(precio);
             break;

             case 5 :
                System.out.println("Introduce el nuevo stock del producto: ");
                stock= tec.nextInt();
                p.setStock(stock);
             break;

             case 6 :
             System.out.println(p.getNombre());
             break;

             case 7 :
             System.out.println(p.getPrecio());
             break;

             case 8 :
             System.out.println(p.getStock());
             break;

             case 9 :
             System.out.println(p.toString());
             break;

             case 10 :
                System.out.println("Cuanta cantidad deseas añadir: ");
                int cantsum=tec.nextInt();
                p.actualizarStock(1, cantsum);
             break;

             case 11 :
                System.out.println("Cuanta cantidad deseas retirar: ");
                int cantrest=tec.nextInt();
                p.actualizarStock(2, cantrest);
             break;
                                 
         }
     } while (menu!=0);
        System.out.println("mátame :)");



    }
}
