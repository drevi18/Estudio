package tema6;

public class Prueba{ 
    protected String nombre; 
    protected int ID; 
    public String getIdent(){return nombre;} 
    public int getIdent(){return ID;} 

    // No compila por que la variable getIdent está duplicada,
    // aunque sea de diferente tipo y devuelva diferentes cosas, 
    // no deberian llevar el mismo nombre ya que a la hora de usarlas
    // no se diferenciarian  
}