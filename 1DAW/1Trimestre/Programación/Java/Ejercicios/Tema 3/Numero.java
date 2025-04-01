public class Numero {
    private int numero;

    //Realiza una clase Número que almacene un número entero y tenga las siguientes características

    public Numero(){
        this.numero=0;
    }

    public Numero(int num){
        this.numero=num;
    }
    
    public int getSuma(int suma){
        int resultadosuma;
        resultadosuma= suma+numero;
        return resultadosuma;
    }
    public int getResta(int resta){
        int resultadoresta;
        resultadoresta= numero-resta;
        return resultadoresta;
    }

    public int getValor(int valor){
        valor=numero;
        return valor;
    }
    public int getDoble(int doble){
        doble=numero+numero;
        return doble;
    }
    public int getTriple(int triple){
        triple=numero+numero+numero;
        return triple;
    }
    public int setNumero(int nuevo){
        nuevo=numero;
        return nuevo;
    }


}
