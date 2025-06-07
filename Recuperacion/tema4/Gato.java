public class Gato extends animal {
    private String raza;
    private int anyos;
    
    public Gato(){
        this.raza = " ";
    }

    public Gato(String nombre, String raza, int anyos){
        super(nombre);
        this.raza =raza;
        this.anyos = anyos;

    }
    
    @Override
    public void HacerSonido() {
        System.out.println("Mow");
    }

    public void ImpGat(){
        System.out.println(this.raza+" "+" "+this.anyos);
    }



}
