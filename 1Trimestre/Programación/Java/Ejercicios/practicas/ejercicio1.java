import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Hola, estoy aqui para responder tus dudas, por favor indícame como te llamas: ");
        String nombre = tec.nextLine();

        String respuesta;
        
     
        boolean cita2 = true;
        boolean dato2 = true;
        boolean anecdota2 = true;
        
        do { 
            System.out.println("Hola " + nombre + ", por favor hazme una pregunta (CITA/DATO/ANÉCDOTA/*en blanco para acabar): ");
            respuesta = tec.nextLine();
            switch (respuesta) {
                case "CITA" :
                    if (cita2) {
                        System.out.println("Si piensas que los usuarios de tus programas son idiota, sólo los idiotas usarán tus programas");
                    } else {
                        System.out.println("Ley de Alzheimer de la programación: si lees un código que escribiste hace más de dos semanases comomsi lo vieras por primera vez");
                    }
                    cita2 = !cita2; 
                    break;
                case "DATO" :
                    if (dato2) {
                        System.out.println("El código binario es el lenguaje de las máquinas");
                    } else {
                        System.out.println("ordenador = hardware + software");
                    }
                    dato2 = !dato2;
                    break;
                case "ANECDOTA" :
                    if (anecdota2) {
                        System.out.println("Ada Lovelace fue una matemática británica considerada la primera persona que escribió un algoritmo destinado a ser procesado por una máquina.");
                    } else {
                        System.out.println("Alan Turing es considerado uno de los padres de la ciencia de la computación y propursor de la informática moderna");
                    }
                    anecdota2 = !anecdota2; 
                    break;
                default: 
                    System.out.println("Vuelve a decirme qué quieres saber");
            }
        } while (!respuesta.equals(""));

        tec.close();
    }
}

