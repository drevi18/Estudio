package EjDiccionarioArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class ColeccionPalabras implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private ArrayList<Palabra> palabras;
    private boolean modif = false;

    public ColeccionPalabras() {

        palabras = new ArrayList <Palabra>();
    }

    public int busquedaDesordenado (String palabraBus, String idioma) {

        int i = 0, pos = -1;

        while (i < palabras.size() && pos == -1) {
        
            if ((idioma.equals("espanyol") && palabraBus.equals(palabras.get(i).getEspanyol())) || (idioma.equals("ingles") && palabraBus.equals(palabras.get(i).getIngles())) || (idioma.equals("frances") && palabraBus.equals(palabras.get(i).getFrances()))) {
                pos = i;
            } else {
                i ++;
            }
        }
        return pos;
    }

    public void borrar (String palabra, String idioma) {
 
        int pos = busquedaDesordenado(palabra, idioma);

        palabras.get(pos).setEspanyol("");
        modif = true;
    }

    public ArrayList<Palabra> getPalabras() {

        return palabras;
    }

    public void add(Palabra p) {

        palabras.add(p);
        modif = true;
    }

    public void mostrar() {

        for(int i = 0; i < palabras.size(); i++) {
            System.out.println(palabras.get(i).toString());
            System.out.println("------------------------------------------------");
        }
    }

    public void GuardFich(String nomFich) {
        if(modif == true){
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream (nomFich))) {
                oos.writeObject(this);
                System.out.println("Colección guardada en fichero.");
            } catch (IOException e) {
                System.out.println("Error al guardar el fichero: " + e.getMessage());
            }
        }
    }

    public static ColeccionPalabras CargFich(String nombreFichero) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreFichero))) {
            Object obj = ois.readObject();
            if (obj instanceof ColeccionPalabras) {
                System.out.println("Colección cargada correctamente.");
                return (ColeccionPalabras) obj;
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No se pudo cargar la colección. Se creará una nueva.");
        }
        return new ColeccionPalabras();
    }

}
