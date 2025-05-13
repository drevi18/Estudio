import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class toquetear {
    public static void main(String[] args) {
        String archesc = "toquetear.txt";
        String archlec = "escribtoq.txt";

        try {
            //creo un archivo donde voy a escribir y se pueda leer
            BufferedWriter bw = new BufferedWriter(new FileWriter(archlec));
            bw.write("Hola estoy probando a hacer lo mismo pero creando yo el arch");
            bw.newLine();
            bw.write("bomba");
            
            BufferedReader br = new BufferedReader(new FileReader(archlec));
            bw.close();


            //creo el nuevo arch donde voy a escribir lo del otro arch
            BufferedWriter bw2 = new BufferedWriter(new FileWriter(archesc));

            String linea;
            int contpal;

                while ((linea = br.readLine())!= null) { 
                    String[] palabras = linea.trim().split("\\s+");
                    if(linea.trim().isEmpty()){
                        contpal = +0;
                    }else
                        contpal = palabras.length;

                bw2.write(String.valueOf(contpal));
                bw2.newLine();

                }

            bw2.close();
            br.close();

        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
