
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class PRG7_3 {
    public static void main(String[] args) {
        String fichnum = "fichnum.txt";
        String fichord = "fichord.txt";
        Ordenar(fichnum, fichord);
        
    }

    public static void Ordenar(String fichnum, String fichord){
        ArrayList<Integer> numguard = new ArrayList();
        try(BufferedReader br = new BufferedReader(new FileReader(fichnum)) ; BufferedWriter bw = new BufferedWriter(new FileWriter(fichord))) {
            String lineas;
            while ((lineas = br.readLine()) != null) { 
                int num = Integer.parseInt(lineas);
                numguard.add(num);
            }
            for (int i = 0; i < numguard.size(); i++) {
                for (int j = 0; j < numguard.size()-1; j++) {
                    if (numguard.get(j) > numguard.get(j + 1)) {
                        int aux = numguard.get(j);
                            numguard.set(j, numguard.get(j + 1));
                            numguard.set(j + 1, aux);
                    }
                }  
            }

            for(int num : numguard){
                bw.write(num + "");  
                bw.newLine();
            }
            
        } catch (Exception e) {
        }
    }
}
