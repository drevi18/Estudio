package tema6;

public class Encargado extends Empleado {

    public Encargado(String nombre, int edad, double sueldo) {
        super(nombre, edad, sueldo);
    }

    @Override
    public void getSalario() {
        double sueldoConExtra = sueldo * 1.10; // 10% más
        System.out.println("Sueldo encargado: " + sueldoConExtra);
    }
}