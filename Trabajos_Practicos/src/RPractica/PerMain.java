package RPractica;

public class PerMain {
    public static void main(String[] args) {
        Persona p1 = new Persona("Joaquin",23);

        p1.mostrarDatos();
        p1.correr();

        Persona p2 = new Persona("40754477");
        p2.correr(100);
    }
}
