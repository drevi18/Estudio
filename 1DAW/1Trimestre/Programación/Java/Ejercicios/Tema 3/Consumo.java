public class Consumo {
    private double km ;
    private double l ;
    private double vmed ;
    private double pgas ;

    public Consumo(){
        this.km=0;
        this.l=0;
        this.vmed=0;
        this.pgas=0;

    }
    public Consumo(double km, double l, double vmed, double pgas){
        this.km=km;
        this.l=l;
        this.vmed=vmed;
        this.pgas=pgas;
    }

    public double setKms (){
        this.km=setKms();
        return this.km;
    }
    public double setLitros(){
        this.l=setLitros();
        return this.l;
    }
    public double setVmed (){
         this.vmed=setVmed();
        return this.vmed;
    }
    public double setPgas(){
        this.pgas=setPgas();
        return this.pgas;
    }
    public int  getTiempo(){
        int resultado;
        resultado=(int)this.km/(int)this.vmed;
        return resultado;
    }

    public double getConsumoMedio(){
        double resultado;
        resultado= l*100/km;
        return resultado;
    }

    public double getConsumoEuros(){
        double resultado;
        resultado= getConsumoMedio()*pgas;
        return resultado;
    }
}
