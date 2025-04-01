
import java.util.Scanner;

public class tecPeso{
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);

        System.out.println("Introduce el peso y en que medidas está");
        System.err.println("Peso: ");
        double peso= tec.nextDouble();
        System.out.println("Introduce las medidas en Lb para libras, Li para lingotes, Oz para onzas, P para peniques, K para kilos, G para gramos y Q para quintales;");
        String medidas = tec.next();

        Peso p= new Peso(peso,medidas);

    System.out.println("----------------------------  ");
    System.out.println("Introduce a que tipo de medidas quieres convertir tu peso:Lb para libras, Li para lingotes, Oz para onzas, P para peniques, K para kilos, G para gramos y Q para quintales ");
    String conv= tec.next();

    System.out.println("---------------------------- ");
    System.out.println(peso+" "+medidas+" es igual a "+p.getPeso(conv)+" "+conv);
    }
}