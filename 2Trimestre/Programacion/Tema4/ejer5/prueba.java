package ejer5;
public class prueba{

    public void primero(){
        System.out.println("Primer método");
    }
    
    public void segundo(){
        System.out.println("Una forma de llamar");
        primero();

        System.out.println("la otra forma de llamar");
        this.primero();

    }
}