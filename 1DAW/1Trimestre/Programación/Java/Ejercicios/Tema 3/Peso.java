public class Peso {
    //Crea la clase Peso, la cual tendrá las siguientes características

    private double peso, result;
    private String medida;
    final private double LIBRAS = 0.4535, LINGOTES = 14.59, ONZAS = 0.0283, PENIQUES = 0.0015, GRAMOS = 1000, 
    QUINTALES = 43.3;

    public Peso(){
        peso=0;
        medida="kg";
    }
    public Peso(double pes, String med){

        switch (med) {
            case "Lb":
                this.peso = pes * LIBRAS;
                break;
            case "Li":
                this.peso= pes * LINGOTES;
                break;
            case "Oz":
                this.peso = pes * ONZAS;
                break;
            case "P":
                this.peso = pes * PENIQUES;
                break;
            case "G":
                this.peso = pes / GRAMOS;
                break;
            case "Q":
                this.peso= pes * QUINTALES;
                break;
        }
    }

    public double getLibras(){
        return this.peso/ LIBRAS;
    }
    public double getLingotes(){
        return this.peso / LINGOTES;
    }
    
    public double getPeso(String medidas){
        switch (medidas) {
            case "Lb":
                result = getLibras();
                break;
            case "Li":
                result = getLingotes();
                break;
            case "Oz":
                result = this.peso/ 0.0283;
                break;
            case "P":
                result = this.peso/ 0.0015;
                break;
            case "K":
                result = this.peso;
                break;
            case "G":
                result = this.peso * 1000;
                break;
            case "Q":
                result = this.peso/ 43.3;
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }
}
