
import java.util.Scanner;

public class TermNumero{
    
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        int menu,numbas;

        System.out.println("Introduce el número: ");
        numbas= tec.nextInt();

        Numero num= new Numero(numbas);
        
        do { 
            System.out.println("Suma= 1");
            System.out.println("Resta= 2");
            System.out.println("Doble= 3");
            System.out.println("Triple= 4");
            System.out.println("Cambiar número= 5");
            System.out.println("Salir= 0");
            menu= tec.nextInt();

            switch (menu) {
                case 1:
                System.out.println("Numero que quieres sumarle a "+numbas+" : ");
                int numsum= tec.nextInt();
                num.getSuma(numsum);
                System.out.println("Suma de "+numbas+" + "+numsum+" = "+num.getSuma(numsum));
                    break;
                
                case 2:
                System.out.println("Numero que quieres restarle a "+numbas+" : ");
                int numrest= tec.nextInt();
                num.getResta(numrest);
                System.out.println("Resta de "+numbas+" - "+numrest+" = "+num.getResta(numrest));
                    break;

                case 3:
                num.getDoble(numbas);
                System.out.println("El doble de "+numbas+" = "+num.getDoble(numbas));                    
                    break;
                
                case 4:
                num.getTriple(numbas);
                System.out.println("El triple de "+numbas+" = "+num.getTriple(numbas));                            
                    break;
                
                case 5:
                System.out.println("Introduce el nuevo número que quieres usar: ");
                int nuevnum= tec.nextInt();
                num.setNumero(nuevnum);
                numbas=nuevnum;
                    break;
                default:
                    System.out.println("Introduce un número válido del menu");
            }
        } while (menu!=0);
            System.out.println("Adiós :)");
            

    }
}