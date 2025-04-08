package tema6;

public class PRG6_8 {
    public static void main(String[] args) {
        
        Anyo a1 = new Anyo(1998, 5, 12);

        System.out.println("pepe tiene: "+a1.getEdad(2025, 4, 8));
    }


    static class Anyo{
       private int anyo; 
       private  int mes;
       private  int dia;

       public Anyo(int anyo, int mes, int dia){
        this.anyo=anyo;
        this.mes=mes;
        this.dia= dia;
       }

       public int getEdad(int actan, int actmes, int actdia){
            int edad = actan - anyo;
        
            if (actmes < mes || (actmes == mes && actdia < dia)) {
                edad -= 1; 
            }
        
            return edad;
        }
        
        }
}
