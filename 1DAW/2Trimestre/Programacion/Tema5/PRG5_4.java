/*Escribe un programa que lee secuencias de 50 números almacenándolos en un vector Numeros y los imprime en orden inverso. */

public class PRG5_4 {
    public static void main(String[] args) {
        int []v= new int[50];
        for (int i = 0; i < v.length; i++) {
            v[i]=i+1;
        }
        Mostrar(v);
    }

    public static void Mostrar(int v[]){
        for (int i = 49; i < v.length; i--) {
            System.out.println(v[i]);
        }
    }
}
