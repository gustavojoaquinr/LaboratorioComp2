package Programacion2.Estructuras.NoLineales;

public class NodoGrafo {

    public String valor;
    public NodoGrafo siguiente;
    public ListaVertices adyacentes;

    public NodoGrafo(String valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    // toString() retorna el valor del nodo.
    @Override
    public String toString() {
        return this.valor;
    }
}
