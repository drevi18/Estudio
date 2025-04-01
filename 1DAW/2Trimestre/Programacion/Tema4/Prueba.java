public class Prueba {
    //Cree una clase prueba que tenga dos métodos (primero y segundo). 
    //El método segundo llamará al método primero dos veces, de forma normal y tilizando this. 
    //Verifica que ambas llamadas son equivalentes.

    public void primero() {
        System.out.println("Primer método");
    }

    public void segundo() {
        System.out.println("Segundo método");

        primero();

        this.primero();
    }
        
}

