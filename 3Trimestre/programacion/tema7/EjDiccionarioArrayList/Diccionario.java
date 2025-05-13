package EjDiccionarioArrayList;
import java.util.Scanner;

public class Diccionario {
    
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        ColeccionPalabras coleccion = new ColeccionPalabras();
        int opcion = 1;
        String palabraEsp, palabraIng, palabraFr;
        String fich = "vocab.txt";

        coleccion = ColeccionPalabras.CargFich(fich);
        do {
            System.out.println(" ");
            System.out.println("---------- MENÚ ----------");
            System.out.println("1. Insertar palabra \n2. Buscar en español \n3. Buscar en inglés \n4.Buscar en francés \n5. Borrar en español \n6. Mostrar colección de palabras \n0. Salir");
            opcion = tec.nextInt();
            tec.nextLine();

            switch (opcion) {

                case 1:

                        System.out.println("Introduce la palabra en español: ");
                        palabraEsp = tec.nextLine().toLowerCase();

                        System.out.println("Introduce la palabra en inglés: ");
                        palabraIng = tec.nextLine().toLowerCase();

                        System.out.println("Introduce la palabra en francés: ");
                        palabraFr = tec.nextLine().toLowerCase();

                        coleccion.add(new Palabra(palabraEsp, palabraIng, palabraFr));
                       
                    break;
            
                case 2:

                    do {

                        System.out.println("Introduce la palabra que quieres buscar en español (* para acabar): ");
                        palabraEsp = tec.nextLine().toLowerCase();

                        int posPalabra = coleccion.busquedaDesordenado(palabraEsp, "espanyol");

                        if(posPalabra != -1) {
                            System.out.println(coleccion.getPalabras().get(posPalabra));
                        } else if(palabraEsp.equals("*")) {
                            System.out.println("Búsqueda finalizada");
                        } else {
                            System.out.println("No se ha encontrado la palabra");
                        }

                    } while (!palabraEsp.equals("*"));

                    break;

                case 3:

                do {

                    System.out.println("Introduce la palabra que quieres buscar en inglés (* para acabar): ");
                    palabraIng = tec.nextLine().toLowerCase();

                    int posPalabra = coleccion.busquedaDesordenado(palabraIng, "ingles");

                    if(posPalabra != -1) {
                        System.out.println("Inglés: " + coleccion.getPalabras().get(posPalabra).getIngles() + ". Francés: " + coleccion.getPalabras().get(posPalabra).getFrances() + ". Español: " + coleccion.getPalabras().get(posPalabra).getEspanyol());
                    } else if(palabraIng.equals("*")) {
                        System.out.println("Búsqueda finalizada");
                    } else {
                        System.out.println("No se ha encontrado la palabra");
                    }

                } while (!palabraIng.equals("*"));
                    
                    break;

                case 4:

                do {

                    System.out.println("Introduce la palabra que quieres buscar en francés (* para acabar): ");
                    palabraFr = tec.nextLine().toLowerCase();

                    int posPalabra = coleccion.busquedaDesordenado(palabraFr, "frances");

                    if(posPalabra != -1) {
                        System.out.println("Francés: " + coleccion.getPalabras().get(posPalabra).getFrances() + ". Inglés: " + coleccion.getPalabras().get(posPalabra).getIngles() + ". Español: " + coleccion.getPalabras().get(posPalabra).getEspanyol());
                    } else if(palabraFr.equals("*")) {
                        System.out.println("Búsqueda finalizada");
                    } else {
                        System.out.println("No se ha encontrado la palabra");
                    }

                } while (!palabraFr.equals("*"));


                case 5:

                    System.out.println("Introduce la palabra que quieres borrar: ");
                    palabraEsp = tec.nextLine().toLowerCase();

                    coleccion.borrar(palabraEsp, "espanyol");
                    
                    break;

                case 6:

                    coleccion.mostrar();
            }

        } while (opcion != 0);

        coleccion.GuardFich(fich);
        System.out.println(" ");
        System.out.println("El fichero se ha quedado de esta manera: ");
        coleccion.CargFich(fich);
        
        tec.close();
    }

}
