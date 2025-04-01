public class Coche {
    private String marca;
    private String modelo;


    public Coche(){
        this.marca= "???";
        this.modelo= "???";
    }
    public Coche(String marca, String modelo){
        this.marca= marca;
        this.modelo= modelo;
    }

    public String getMarca (){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
}
