
public class tecpersona {
    public static void main(String[] args) {
        persona p1 = new persona();
        persona p2 = new persona("Juan", 25);
        persona p3 = new persona("María", 30);

        
        p1.imprimirInformacion();
        p2.imprimirInformacion();
        p3.imprimirInformacion();
}
}