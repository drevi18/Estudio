package pez;

public class Pez {
    protected static int numpeces=0;
    protected  String nombre;

    public Pez() {

        this.nombre = "";
        this.numpeces++;
    }

    public Pez(String nom) {

        this.nombre = nom;
        this.numpeces ++;
    }

    public Pez(Pez copiaPez) {

        nombre = "";
        numpeces ++;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumpeces() {
        return this.numpeces;
    }

    public void setNumpeces(int numpeces) {
        this.numpeces = numpeces;
    }

    public Pez clone() {

        Pez pezClon = new Pez();
        pezClon.setNombre(this.nombre);

        return pezClon;
    }

    public boolean equals (Object obj) {

        boolean resultado;

        if (!(obj instanceof Pez)) {
            resultado = false;
        } else if (this.nombre.equals(  ((Pez)obj).getNombre()   )) {
            resultado = true;
        } else {
            resultado = false;
        }

        return resultado;
    }
}
