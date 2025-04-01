package chatgpt1;

public class Pajaro extends Animal implements PuedeMoverse {
    private String colorPlumas;

    public Pajaro(){}

    public Pajaro(String plumas){
        this.colorPlumas=plumas;
    }

    public String getPlumas(){
        return colorPlumas;
    }

    @Override
    public String hacerSonido(){
        return "Canto";
    }

    @Override
    public String Alimentarse(){
        return  "Picotea";
    }

    @Override
    public String moverse(){
        return "Vuela";
    }


}
