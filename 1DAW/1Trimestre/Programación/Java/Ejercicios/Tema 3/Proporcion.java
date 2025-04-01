public class Proporcion {
    private double papas;
    private double chocos;
    private double PAPAS=1.0, CHOCOS=1/2,PERSONAS=3, PRODUCTO=1.5;
    
    public Proporcion(){
        this.papas=0;
        this.chocos=0;
    }
    public Proporcion(double papas, double chocos){
        this.papas=papas;
        this.chocos=chocos;
    }

    public double getPersonas(){
        double resultado, suma;
        suma=chocos+papas;
        resultado=suma*PERSONAS/PRODUCTO;
        return resultado;
    }
    
}

