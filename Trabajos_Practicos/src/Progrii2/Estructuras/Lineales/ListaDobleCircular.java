package Progrii2.Estructuras.Lineales;

public class ListaDobleCircular {

    private NodoDoble primero;
    private NodoDoble ultimo;
    private int tam;

    public ListaDobleCircular() {
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
            this.primero.anterior = this.ultimo;
            this.ultimo.siguiente = this.primero;
        } else {
            this.primero.anterior = nuevo;
            this.ultimo.siguiente = nuevo;
            nuevo.siguiente = this.primero;
            nuevo.anterior = this.ultimo;
            this.ultimo = nuevo;
        }
        this.tam++;
    }

    public void agregarInicio(String valor) {
        NodoDoble nuevo = new NodoDoble(valor);

        if (vacia()) {
            this.ultimo = nuevo;
            this.primero = nuevo;
            this.primero.anterior = this.ultimo;
            this.ultimo.siguiente = this.primero;


        } else {
            nuevo.anterior = this.ultimo;
            nuevo.siguiente = this.primero;
            this.primero = nuevo;
            this.ultimo.siguiente = this.primero;
        }

        this.tam++;
    }

    public void eliminarIndice(int index) {

        if (vacia()) {
            System.out.println("lista vacia");
        } else if (index == 0) {
            if (this.tam == 1) {
                this.primero = null;
                this.ultimo = null;
                return;
            }
            this.primero.siguiente.anterior = this.ultimo;
            this.ultimo.siguiente = this.primero.siguiente;
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
            System.out.println("Elemento " + index + " ==>>> " + this.primero.toString());
        } else if (index >= this.tam) {
            System.out.println("indice invalido");
        } else if (index == this.tam - 1) {
            System.out.println("Elemento " + index + " ==>>> " + this.ultimo.toString());
        } else {

            int cont = 0;
            NodoDoble aux = this.primero;

            while (cont != index) {
                aux = aux.siguiente;
                cont++;
            }
            System.out.println("Elemento " + index + " ==>>> " + aux.toString());
        }
    }

    public void eliminarUltimo() {
        if (vacia()) {
            System.out.println("Lista vacia");
        } else {

            this.ultimo.anterior.siguiente = this.primero;
            this.primero.anterior = this.ultimo.anterior;
            this.ultimo = this.ultimo.anterior;

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
