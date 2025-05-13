package EjDiccionarioArrayList;

import java.io.Serializable;

public class Palabra implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String espanyol;
    private String ingles;
    private String frances;

    public Palabra() {

    }

    public Palabra(String esp, String ing, String fr) {

        this.espanyol = esp;
        this.ingles = ing;
        this.frances = fr;
    }

    public String getEspanyol() {
        
        return espanyol;
    }

    public void setEspanyol(String espanyol) {
        
        this.espanyol = espanyol;
    }

    public String getIngles() {
        
        return ingles;
    }

    public void setIngles(String ingles) {
        
        this.ingles = ingles;
    }

    public String getFrances() {
        
        return frances;
    }

    public void setFrances(String frances) {
        
        this.frances = frances;
    }

    public String toString() {

        return "Español: " + espanyol + ". Inglés: " + ingles + ". Francés: " + frances;
    }
}
