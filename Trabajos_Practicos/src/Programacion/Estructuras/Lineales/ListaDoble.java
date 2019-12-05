package Programacion.Estructuras.Lineales;

public class ListaDoble {

    private NodoDoble primero;
    private NodoDoble ultimo;
    private int tam;

    public ListaDoble() {
        this.primero = null;
        this.ultimo = null;
        this.tam = 0;
    }

    public boolean vacia() {
        return this.primero == null;
    }

    public void agregar(String valor) {

        NodoDoble nuevo = new NodoDoble(valor);

        if (vacia()) {
            this.primero = nuevo;
            this.ultimo = nuevo;
        } else {

            // se tiene que recorrer la lista hasta llegar al ultimo nodo
            NodoDoble aux = primero;

            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }

            // asigna primero y ultimo
            aux.siguiente = nuevo;
            nuevo.anterior = aux;
            this.ultimo = nuevo;
        }
        this.tam++;
    }

    public void agregarInicio(String valor) {
        NodoDoble nuevo = new NodoDoble(valor);

        if (vacia()) {
            this.primero = nuevo;
            this.primero.anterior = nuevo;
            this.ultimo = nuevo;
            this.primero.siguiente = this.ultimo;
            this.ultimo.siguiente = null;
        } else {
            nuevo.siguiente = this.primero;
            this.primero.anterior = nuevo;
            this.primero = nuevo;
        }

        this.tam++;
    }

    public void eliminarIndice(int index) {

        if (vacia()) {
            System.out.println("lista vacia");
        } else if (index == 0) {
            this.primero = this.primero.siguiente;
            this.tam--;
        } else if (index >= this.tam) {
            System.out.println("indice invalido");
        } else if (index == this.tam - 1) {
            this.eliminarUltimo();
        } else {

            try {
                int cont = 0;
                NodoDoble aux = this.primero;

                while (cont != index) {
                    aux = aux.siguiente;
                    cont++;
                }
                aux.siguiente.anterior = aux.anterior;
                aux.anterior.siguiente = aux.siguiente;
                this.tam--;
            } catch (NullPointerException e) {
                System.out.println("Ese indice no existe");
            }
        }
    }

    public void buscarIndice(int index) {

        if (vacia()) {
            System.out.println("lista vacia");
        } else if (index == 0) {
            System.out.println("Elemento "+index+" ==>>> "+this.primero.toString());
        } else if (index >= this.tam) {
            System.out.println("indice invalido");
        } else if (index == this.tam - 1) {
            System.out.println("Elemento "+index+" ==>>> "+this.ultimo.toString());
        } else {

            int cont = 0;
            NodoDoble aux = this.primero;

            while (cont != index) {
                aux = aux.siguiente;
                cont++;
            }
            System.out.println("Elemento "+index+" ==>>> "+aux.toString());
        }
    }

    public void eliminarUltimo() {
        if (vacia()) {
            System.out.println("Lista vacia");
        } else {
            // se tiene que recorrer la lista hasta llegar al ultimo nodo
            NodoDoble aux = primero;
            NodoDoble nodoAnterior = aux;

            while (aux.siguiente != null) {
                nodoAnterior = aux;
                aux = aux.siguiente;
            }

            // Verifico si realmente avanzó en la lista hasta llegar al
            // último nodo que sea distinto del primero.
            // Si estoy en el primero, entonces hago primero y ultimo null para indicar que la lista esta vacia.
            if (aux == this.primero) {
                this.primero = null;
                this.ultimo = null;
            } else {
                this.ultimo = nodoAnterior;
                nodoAnterior.siguiente = null;
                aux.anterior = null;
            }

            this.tam--;
        }
    }

    public void imprimir() {
        if (vacia()) {
            System.out.println("Lista vacia");
        } else {

            NodoDoble aux = primero;

            for (int i = 0; i < this.tam; i++) {
                System.out.println(aux.valor);
                aux = aux.siguiente;
            }
        }
    }

    public void imprimirInverso() {
        if (vacia()) {
            System.out.println("Lista vacia");
        } else {

            NodoDoble aux = ultimo;

            for (int i = 0; i < this.tam; i++) {
                System.out.println(aux.valor);
                aux = aux.anterior;
            }
        }
    }
}