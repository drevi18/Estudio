public class Producto {

    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre){
        this.nombre=nombre;
        precio=0;
        stock=0;
    }
    public Producto(String nombre, double precio, int stock){
        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;

    }


    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void  setPrecio(double precio){
        this.precio=precio;
    }
    public void setStock(int stock){
        this.stock=stock;
    }

    public String getNombre(){
        
        return nombre;
    }
    public double getPrecio(){
        return precio;
    } 
    public int getStock(){
        return stock;

    }

    public String toString(){
        return "Producto: "+nombre+" , Precio: "+precio+", Stock: "+stock;
    }

    public int actualizarStock(int hacer,int cantidad){
        int resultado=0;
        switch (hacer) {
            case 1:
            if (cantidad>stock) {
                System.out.println("No se puede retirar tanta cantidad");
            }else {
                resultado=stock-cantidad;
            }
                break;
            case 2:
            resultado= stock+cantidad;
        }
        return resultado;
    }

    public boolean esMasCaroQue (double precio){
        boolean resultado;
        if(this.precio>precio){
            resultado=true;
        }else {
            resultado=false;
        }
        return resultado;
    }

}
