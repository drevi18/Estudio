package Dispositivos;

public class  smartphone extends Dispositivo implements Conectividad  {
    private boolean conectado;
    @Override
    public void encender() {
        System.out.println("Smartphone encendido");
    }

    @Override
    public void apagar() {
        System.out.println("Smartphone apagado");

    }

    
    public boolean  conexion (int respuesta) {
        switch (respuesta) {
            case 1:
            System.out.println("Smartphone conectado a la wifi");
             conectado=true;
            break;
            case 2:
            System.out.println("Smartphone no conectado a la wifi");
             conectado=false;
            break;
        }
        return conectado;
    }




    @Override
    public void conectarWifi() {
    }

    @Override
    public void desconectarWifi() {
    }
    
}
