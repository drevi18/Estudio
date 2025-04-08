package tema6;

public class Empleado  {
    protected String nombre;
    protected int edad;
    protected double sueldo;

    public Empleado(){
        nombre=" ";
        edad=0;
        sueldo=0.0;
    }

    public Empleado(String nombre, int edad, double sueldo){
        this.nombre=nombre;
        this.edad=edad;
        this.sueldo=sueldo;
    }

    public void getSalario(){
        System.out.println("Salario empleado: "+sueldo);
    }
}
