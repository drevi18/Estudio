/*Programa que lea un vector numérico de 10 elementos y rote todas sus componentes un 
lugar hacia el principio del vector desplazando la última componente al último lugar. */

public class PRG5_9{
    public static void main(String[] args) {
        int []v= new int[10];
        for (int i = 0; i < v.length; i++) {
            v[i]=i+1;
        }
        Mostrar(v);
        int aux=v[0];
        for (int i = 0; i < v.length-1; i++) {
            v[i] = v[i + 1];
        }
        v[9]=aux;
        Mostrar(v);
    }

    public static void Mostrar(int v[]){
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }
}