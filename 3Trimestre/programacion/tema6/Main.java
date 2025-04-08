package tema6;

import java.util.ArrayList;

class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
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


public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Perro("Rex"));
        animales.add(new Gato("Mishi"));
        animales.add(new Perro("Bobby"));
        animales.add(new Gato("Garfield"));

        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }
}

