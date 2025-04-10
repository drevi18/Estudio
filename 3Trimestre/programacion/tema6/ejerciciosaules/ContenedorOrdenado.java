package tema6.ejerciciosaules;

import java.util.Vector;

public class ContenedorOrdenado<T extends EsComprable<T>> {
    private Vector<T> datos;

    /** Construye un Contenedor de datos por defecto de 10 elementos */
    public ContenedorOrdenado() {
        datos = new Vector<>();
    }

    /**
     * Construye un Contenedor de datos con parámetros de entrada:
     * Capacidad int
     * 
     * @return
     */
    public ContenedorOrdenado(int cap) {
        datos = new Vector<>(cap);
    }

    /**
     * Nos indica si el contenedor esta o no lleno
     * 
     * @return boolean
     */
    private boolean contenedorLleno() {
        if (datos.size() == datos.capacity())
            return true;
        else
            return false;
    }

    /**
     * Añade un dato ordenado que le pasamos como parámetro al contenedor
     * 
     * @param dato
     * @return booleano: Si se puede añadir o no el dato al contenedor
     */
    public boolean anyadeDatoOrdenado(T dato) {
        boolean ok = false; 

        int i = 0;
        while (i < datos.size() && (dato.esMayorQue(datos.elementAt(i)))) {
            i++;
        }
        datos.add(i, dato);
        ok = true;
        return ok;
    }

    /**
     * Método para obtener el dato que está en una determinada posición
     * 
     * @param pos posición del elemento que queremos obtener
     * @return el elemento que está en esa posición
     */
    public T getDatoPos(int pos) {
        T res;

        res = datos.elementAt(pos);

        return res;
    }

    /**
     * Método para obtener el dato que está en una determinada posición
     * 
     * @param pos posición del elemento que queremos obtener
     * @return el elemento que está en esa posición
     */
    public T obtenerDatoPos(int pos) {
        T res;

        res = datos.elementAt(pos);
        return res;
    }

    /**
     * Método para eliminar un dato del contenedor
     * 
     * @param dato que queremos eliminar del contenedor
     */
    public void eliminarDato(T dato) {
        datos.removeElement(dato);
    }

    /**
     * Método que devuelve el número de datos actuales existentes en el contenedor
     * 
     * @return número de datos del contenedor
     */
    public int numElementos() {
        return datos.size();
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Contenedor [datos=" + datos + "]";
    }

    /**
     * Método para buscar un dato en el contenedor
     * 
     * @param dato a buscar
     * @return booleano indicando si el dato se encuentra o no en el contenedor.
     */
    public boolean buscarDato(T dato) {
        boolean esta = false;

        int i = 0;
        while ((i < datos.size()) && (!dato.equals(datos.elementAt(i))))
            i++;

        // Elemento está en el vector
        if (i < datos.size())
            esta = true;
        return esta;
    }

    /**
     * Método para buscar un dato en el contenedor
     * 
     * @param dato a buscar
     * @return entero indicando si la posición del dato en el contenedor, -1 si no
     *         está
     */
    public int buscarDatoPos(T dato) {
        int pos = -1;

        int i = 0;
        while ((i < datos.size()) && (!dato.equals(datos.elementAt(i))))
            i++;

        // Elemento está en el vector
        if (i < datos.size())
            pos = i;

        return pos;
    }
}
