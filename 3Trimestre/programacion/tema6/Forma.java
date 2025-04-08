package tema6;

public abstract class Forma {
    
    
    public abstract  String toString();

    public String identidad(){
        return this.getClass().getSimpleName();
    }
    
    public static void main(String[] args) {
        
        Forma[] formas = new Forma[3];

        formas[0] = new Cuadrado();
        formas[1] = new Circulo();
        formas[2] = new Triangulo();

        for (Forma f: formas) {
            System.out.println(f.identidad() + " " + f.toString());

    }
}

}
