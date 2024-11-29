public class Fianzas {
    
    //Realiza una clase Finanzas que convierta dólares a euros y viceversa. Codifica los métodos dolaresToEuros y eurosToDolares. 
    //Prueba que dicha clase funciona correctamente haciendo conversiones entre euros y dólares. La clase tiene que tener

    private double doltoeur ;
    private double eurtodol;
    private double cambio;

    public Fianzas(){
        this.cambio=1.36;
    }
    public double doltoeur(double dolares){
        double eurcam;
        eurcam= dolares*cambio;
        return eurcam;
    }
    public double eurtodol(double euros){
        double dolcam;
        dolcam= euros/cambio;
        return dolcam;
    }
}


