package Programacion.Estructuras.Lineales;

public class ListaCircular {

    private Nodo primero;
    private Nodo ultimo;
    public int tamaño;

    public void Lista() {
        this.primero = null;
        this.ultimo = null;
        this.tamaño = 0;
    }

    public boolean vacia() {
        return this.primero == null;
    }

    public void agregar(String valor) {

        Nodo nuevo = new Nodo(valor);

        if (vacia()) {
            // agregamos el primer nodo
            this.primero = nuevo;
            this.ultimo = nuevo;
            this.ultimo.siguiente = this.primero;
        } else {
            // usa los puntores a "primero" y "ultimo"
            this.ultimo.siguiente = nuevo;
            nuevo.siguiente = this.primero;
            ultimo = nuevo;
        }
        this.tamaño++;
    }

    public void eliminarUltimo() {
        if (vacia()) {
            System.out.println("Lista vacia");
        }
        if (this.primero == this.ultimo) {
            this.primero = null;
            this.ultimo = null;
        } else {
            // se recorre la lista hasta llegar al anteultimo
            Nodo aux = primero;

            while (aux.siguiente != this.ultimo) {
                aux = aux.siguiente;
            }
            //aux = anteultimo
            aux.siguiente = this.primero; //anteultimo.siguente = primero
            this.ultimo = aux; //ultimo = anteultimo

            this.tamaño--;
        }
    }

    public void imprimir() {
        if (vacia()) {
            System.out.println("Lista vacia");
        } else {
            Nodo aux = this.primero;
            for (int i = 0; i < this.tamaño; i++) {
                System.out.println(aux.valor);
                aux = aux.siguiente;
            }
        }
    }

    public void busquedaPorIndice(int index) {
        if (vacia()) {
            System.out.println("Lista vacia");
        } else {
            boolean encontrado = false;
            Nodo aux = this.primero;
            int contador = 0;
            while (contador < this.tamaño) {
                if (contador == index) {
                    System.out.println(aux.valor);
                    encontrado = true;
                    break;
                }
                contador++;
                aux = aux.siguiente;
            }
            if (!encontrado) {
                System.out.println("No se encontro");
            }
        }
    }

    public void eliminarIndice(int index) {

        if (vacia()) {
            System.out.println("lista vacia");
        } else if (index == this.tamaño - 1) {
            this.eliminarUltimo();
        } else if (index >= this.tamaño) {
            System.out.println("indice invalido");
        } else if (index == 0) {
            this.primero = this.primero.siguiente;
            this.ultimo.siguiente = this.primero;
            this.tamaño--;
        } else {

            try {
                int cont = 0;
                Nodo aux = this.primero;
                Nodo aux2 = this.primero.siguiente;
                while (cont != index - 1) {
                    aux = aux.siguiente;
                    aux2 = aux2.siguiente;
                    cont++;
                }
                aux.siguiente = aux2.siguiente;
                this.tamaño--;
            } catch (NullPointerException e) {
                System.out.println("Ese indice no existe");
            }
        }
    }
}