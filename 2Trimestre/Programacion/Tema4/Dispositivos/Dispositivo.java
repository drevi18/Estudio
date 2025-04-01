package Dispositivos;

public abstract class Dispositivo {
    protected  String nombre;
    public static int totaldisp;

    public abstract void encender();
    public abstract void apagar();
}
