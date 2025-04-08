package tema6.ejerciciosaules;

import java.util.Comparator;
import java.util.TreeSet;

class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}

class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau guau!");
    }
}

class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Miau miau!");
    }
}

class ContenedorOrdenado<T extends Animal> {
    private TreeSet<T> elementos;

    public ContenedorOrdenado() {
        elementos = new TreeSet<>(Comparator.comparing(Animal::getNombre));
    }

    public void agregar(T obj) {
        elementos.add(obj);
    }

    public void mostrarElementos() {
        for (T obj : elementos) {
            obj.hacerSonido();
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        ContenedorOrdenado<Animal> animales = new ContenedorOrdenado<>();

        animales.agregar(new Perro("Rex"));
        animales.agregar(new Gato("Mishi"));
        animales.agregar(new Perro("Bobby"));
        animales.agregar(new Gato("Garfield"));

        animales.mostrarElementos();
    }
}

