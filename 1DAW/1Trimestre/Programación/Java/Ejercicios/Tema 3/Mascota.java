public class Mascota {
    private String nombre;
    private String raza;
    private int edad;
    private Dueño dueño;

    public Mascota (){
        nombre=" ";
        raza=" ";
        edad=0;
        Dueño d= new Dueño();
        }
    public Mascota (String nombre, String raza, int edad){
        this.nombre=nombre;
        this.raza=raza;
        this.edad=edad;
    }



}
