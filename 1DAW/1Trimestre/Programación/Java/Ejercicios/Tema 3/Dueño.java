public class Dueño {
    private String nombre;
    private int edad;

    public Dueño(){
        nombre=" ";
        edad=0;
    }
    public Dueño(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setEdad(){
        this.edad=edad;
    }
}
