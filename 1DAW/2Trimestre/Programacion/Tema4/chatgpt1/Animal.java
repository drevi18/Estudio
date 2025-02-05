package chatgpt1;

public abstract class Animal {
    protected String nombre;
    protected int edad;

    public Animal(){}

    public Animal(String nom, int ed){
        this.nombre=nom;
        this.edad=ed;
    }

    public String getNombre(){
        return nombre;
    }

    public abstract String hacerSonido();

    public abstract String Alimentarse();
}
