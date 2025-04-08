
package tema6;

public class Prueba {

    public static void main(String[] args) {
        boolean continuar = true;
        int dato;
        ContenedorOrdenado<IntegerAdaptado> miContenedor = new ContenedorOrdenado<>();
        miContenedor.anyadeDatoOrdenado(new IntegerAdaptado(5));

        int pos;
        while (continuar) {
            int opcion = Utils.mostrarMenu("Menu", "Anyadir dato", "Eliminar dato", "Obtener dato en posicion n",
                    "Buscar dato en el contenedor", "Num datos del contenedor", "Mostrar contenedor", "Salir");
            switch (opcion) {
                case 1: /* Anyadir dato */
                    dato = Utils.preguntarInt("Dato a anyadir", 1, Integer.MAX_VALUE);
                    miContenedor.anyadeDatoOrdenado(new IntegerAdaptado(dato));
                    break;

                case 2: // Eliminar dato
                    dato = Utils.preguntarInt("Elemento a eliminar", 1, Integer.MAX_VALUE);
                    miContenedor.eliminarDato(new IntegerAdaptado(dato));
                    break;

                case 3: // Obtener dato en posicion n
                    pos = Utils.preguntarInt("Introduce posicion", 0, miContenedor.numElementos() - 1);
                    IntegerAdaptado obtenido = miContenedor.obtenerDatoPos(pos);
                    System.out.println("En la posicion " + pos + " está el dato: " + obtenido.getValor());
                    break;

                case 4: // Buscar dato
                    dato = Utils.preguntarInt("Elemento a buscar", 1, Integer.MAX_VALUE);
                    boolean ok = miContenedor.buscarDato(new IntegerAdaptado(dato));
                    if (ok)
                        System.out.println("Elemento " + dato + " está en el contenedor");
                    else
                        System.out.println("Elemento " + dato + " no está en el contenedor");
                    break;

                case 5: // Número de datos en el contenedor
                    System.out.println("En el contenedor hay " + miContenedor.numElementos() + " datos");
                    break;

                case 6: // Mostrar contenedor
                    System.out.println("Elementos en el contenedor:");
                    System.out.println(miContenedor);
                    break;

                case 7: // Salir
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}