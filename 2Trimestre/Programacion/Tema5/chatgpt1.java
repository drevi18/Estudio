
import java.util.Scanner;

class Estudiante {
    private String nombre;
    private int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}

public class chatgpt1 {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        Estudiante[] estudiantes = new Estudiante[3];
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            String nombre = tec.nextLine();

            System.out.println("Ingrese la edad de " + nombre + ": ");
            int edad = tec.nextInt();
            tec.nextLine();  // Limpiar buffer del Scanner

            // Guardamos el estudiante en el array
            estudiantes[i] = new Estudiante(nombre, edad);
            estudiantes[i].mostrarInfo();
        }
        
    }
}
