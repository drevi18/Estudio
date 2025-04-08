// Enunciado:
// Realice una función que dada una fecha de nacimiento de una persona indique cuántos años tiene.

import java.time.LocalDate;
import java.time.Period;

public class CalculadoraEdad {

    public static int calcularEdad(LocalDate fechaNacimiento) {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        return periodo.getYears();
    }

    public static void main(String[] args) {
        LocalDate fechaNacimiento = LocalDate.of(1990, 5, 15); // Ejemplo de fecha de nacimiento
        int edad = calcularEdad(fechaNacimiento);
        System.out.println("La edad es: " + edad + " años");
    }
}
