
public class persona {
    private String nombre;
    private int edad;

    public persona() {
        nombre= "desconocido";
        edad= 0;
    }
    public persona(String nombre, int edad){
        this.nombre= nombre;
        this.edad= edad;

    }

    public void imprimirInformacion(){
        System.out.println("Nombre= "+nombre+" edad= "+edad);
    }
}
