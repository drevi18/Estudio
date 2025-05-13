
import java.io.BufferedReader;
import java.io.FileReader;



public class PRG7_1{
    //Cree una clase Cuenta con un método cuentaPalabras() que cuente las palabras existentes en un archivo de datos pasado como parámetro.
    public static void main(String[] args) {
        String arch = "PRG7_1.txt";
        ContarPalabras(arch);
    }

    public static void ContarPalabras(String nomarch){
        int cont =0; 
        try(BufferedReader br = new BufferedReader(new FileReader(nomarch))){
            String lineas;
            while ((lineas = br.readLine())!= null) { 
                lineas = lineas.trim();
                if (!lineas.isEmpty()) {
                    String[] palabras = lineas.split("\\s+");
                    cont += palabras.length;
                }
            }
            System.out.println("En total hay "+cont+" palabras en el archivo");
        }catch (Exception e){

        }
    }
}