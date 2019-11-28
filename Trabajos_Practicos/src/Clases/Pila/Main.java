package Clases.Pila;

public class Main {
    public static void main(String[] args) {

        Pila pila = new Pila();

        pila.apilar(4);
        pila.apilar(5);
        pila.apilar(6);
        pila.imprimir();
        pila.desapilar();
        System.out.println("\nDesapilar:");
        pila.imprimir();
        pila.desapilar();
        System.out.println("\nDesapilar:");
        pila.imprimir();

    }
}
