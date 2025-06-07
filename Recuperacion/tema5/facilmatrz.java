
public class facilmatrz {
    public static void main(String[] args) {
        int[][] matrz= new int[2][3];
        int cont =0;

        for (int i = 0; i < matrz.length; i++)   {
          for (int j = 0; j < matrz[i].length; j++) {
                matrz[i][j] = cont;
                cont++;
            }
        }
        mostrar(matrz);
    }

    public static void mostrar(int[][] matrz ){
        for (int i = 0; i < matrz.length; i++)   {
            for (int j = 0; j < matrz[i].length; j++) {
                System.out.print(matrz[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
