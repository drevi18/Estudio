package chatgpt1;

public class Mamifero extends Animal implements PuedeMoverse {
    private String tipoDePelo;

    public Mamifero(){}

    public Mamifero(String pelo){
        this.tipoDePelo=pelo;
    }

    @Override
    public String hacerSonido() {
        return "Sonido";
    }

    @Override
    public String Alimentarse() {
        return "Se alimenta";
    }

    @Override
    public String moverse() {
        return "Se mueve";
    }
    
}
