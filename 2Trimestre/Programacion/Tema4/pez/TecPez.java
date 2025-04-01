package pez;

public class TecPez {

    public static void main(String[] args) {

        Pez p1 = new Pez();
        Pez p2 = new Pez();

        p1.setNombre("Alfredo");
        p2.setNombre("Nemo");

        if (p1.equals(p2)){
            System.out.println("Se llaman igual");
        } else{
            System.out.println("Tienen diferentes nombres");
        }

        p1= p2.clone();

        p1.setNombre("Nemo");
        System.out.println("Vamos a cambiarle el nombre al primer pez");

        if (p1.equals(p2)){
            System.out.println("Se llaman igual");
        } else{
            System.out.println("Tienen diferentes nombres");
        }

        System.out.println("Vamos a contar cuantos peces hay, en total tenemos "+p2.getNumpeces()+" peces");

        Pez pc=p2;
        System.out.println("Nombre del pez copia "+pc.getNombre());
    }    
}