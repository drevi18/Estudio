public class Perro extends animal {
     private String raza;
    private int anyos;
    
    public Perro(){
        this.raza = " ";
    }

    public Perro(String nombre, String raza, int anyos){
        super(nombre);
        this.raza =raza;
        this.anyos = anyos;

    }
    
    @Override
    public void HacerSonido() {
        System.out.println("Wof");
    }

    public void ImpPerr(){
        System.out.println(this.raza+" "+" "+this.anyos);
    }

}
