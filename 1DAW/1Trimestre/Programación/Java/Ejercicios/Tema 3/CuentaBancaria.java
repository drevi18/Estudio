// Crea una clase CuentaBancaria que tenga dos constructores. 
// Uno sin parámetros y otro que reciba el nombre del titular y el saldo inicial de la cuenta. 
// Ambos constructores deben inicializar los atributos correspondientes.

public class CuentaBancaria{

    private String nombre;
    private double saldo;

    public CuentaBancaria(){
        nombre= " ";
        saldo= 0;
    }

    public CuentaBancaria(String nombre, double saldo){
        this.nombre= nombre;
        this.saldo=saldo;
    }
    public void depositar(double cantidad){
            saldo+=cantidad;
    }

    public void retirar(double cantidad){
        double resta=0;
        if (cantidad>saldo){
            System.out.println("No puedes retirar todo el saldo");
        }else { 
            
            saldo-=cantidad;
        }
    }

    public double MostrarSaldo(){
        return saldo;
    }

}