
import java.util.Scanner;

public class matrices {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int[][] m1= new int[3][3];
        int[][] m2= new int[3][3];
        String[][] m3= new String[3][3];
        String[][] m4= new String[3][3];
        int[][] m5= new int[3][3];
        impM1(m1);

        System.out.println("La fila de en medio con 0");
        mediox(m2);

        System.out.println("Abajo todo +, en medio x y arriba -");
        abajoPlus(m3);

        System.out.println("Matriz traspuesta");
        traspuesta(m1);

        System.out.println("X contorno");
        lados(m4);

        System.out.println("0 en otro lado");
        otrolado(m5);
    }

    public static void impM1(int[][] m1){
        int cont=0;
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1.length; j++) {
                m1[i][j]= cont;
                cont++;
                System.out.print(m1[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void mediox(int[][] m2){
        int cont=1;
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2.length; j++) {
                if (i==j) {
                    m2[i][j]= 0;
                    System.out.print(m2[i][j]+" ");
                }else{
                    m2[i][j]= cont;
                    cont++;
                    System.out.print(m2[i][j]+" ");

                }
            }
            System.out.println();
        }
    }

    public static void abajoPlus(String[][] m3){
        for (int i = 0; i < m3.length; i++) {
            for (int j = 0; j < m3.length; j++) {
                if (i == j) {
                    m3[i][j]= "X";
                }else if (i<j) {
                    m3[i][j]="+";
                }else {
                    m3[i][j]="-";
                }
                System.out.print(m3[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void traspuesta(int[][] m1){
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1.length; j++) {
                System.out.print(m1[j][i]+" ");
            }
            System.out.println();
        }
    }

    public static void lados(String[][] m4){
        for (int i = 0; i < m4.length; i++) {
            for (int j = 0; j < m4.length; j++) {
                if (i == 0) {
                    m4[i][j]="X";
                }else if (i == 2) {
                    m4[i][j]="X";
                }else if (i == 1 && j!=1) {
                    m4[i][j]="X";
                }else{
                    m4[i][j]="0";
                }
                System.out.print(m4[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void otrolado(int[][] m5){
        for (int i = 0; i < m5.length; i++) {
            for (int j = 0; j < m5.length; j++) {
                if (i ==0 && j ==2) {
                    m5[i][j]=0;
                }else  if (i == 1 && j == 1 ) {
                    m5[i][j]=0;
                }else if (i== 2 && j == 0) {
                    m5[i][j]=0;
                    
                }else {
                    m5[i][j]=1;
                }
                System.out.print(m5[i][j]+" ");
            }
            System.out.println();
        }
    }
}
