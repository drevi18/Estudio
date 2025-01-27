package ejer6;

public class Combinaciones {
    protected int n;
    protected int m;

    public Combinaciones(){
        n=0;
        m=0;
    }
    public Combinaciones(int n,int m){
        this.n=n;
        this.m=m;
    }

    public int getcombin(){
        int resultado=0; 
        if (m>n){
            return resultado;
            do { 
                m=m*(m-1);
                m=resultado;
            } while (m<100);
        } 
        System.out.println("m es menor que n");   
    } 
}
