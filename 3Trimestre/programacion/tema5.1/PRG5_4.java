

public class PRG5_4 {
    public static void main(String[] args) {
        String cadena = "monja monja monja";
        String subcadena = "mon";
        
        int conteo = 0;
        
        for (int i = 0; i <= cadena.length() - subcadena.length(); i++) {
            String parte = cadena.substring(i, i + subcadena.length());
            if (parte.equals(subcadena)) {
                conteo++;
            }
        }

        System.out.println("La subcadena '" + subcadena + "' aparece " + conteo + " veces.");
        
    }
}
