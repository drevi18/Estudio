package tema6;

public class Huevo {
    
    public void hazHuevo(){
        System.out.println("Huevo hecho");
        Clara c1= new Clara();
        Yema y1= new Yema();

        c1.hazClara();
        y1.hazYema();
    }

    static class Clara{

        public void hazClara(){
            System.out.println("Clara de huevo");
        }
    }

    static class Yema{

        public void hazYema(){
            System.out.println("Yema de huevo");
        }
    }

    public static void main(String[] args) {
        
        Huevo h1=new Huevo();
        h1.hazHuevo();
    }
}
