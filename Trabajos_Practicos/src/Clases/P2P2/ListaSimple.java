package Clases.P2P2;

public class ListaSimple {
    public Nodo primero;
    public int tamaño;

    public ListaSimple() {
        this.primero = null;
        this.tamaño = 0;
    }

    public boolean vacia() {
        return this.primero == null;
    }

    public void agregar(String valor) {
        Nodo nuevo = new Nodo(valor);

        if (vacia()) {
            this.primero = nuevo;
        } else {
            Nodo aux = this.primero;

            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
        this.tamaño++;
    }

    public void eliminarUltimo() {
        if (vacia()) {
            System.out.println("Lista vacia");
        } else {
            Nodo aux = primero;
            Nodo nodoAnterior = aux;

            while (aux.siguiente != null) {
                nodoAnterior = aux;
                aux = aux.siguiente;
            }

            if (aux == this.primero) {
                this.primero = null;
            } else {
                nodoAnterior.siguiente = null;
            }
            this.tamaño--;
        }
    }

    public void imprimir() {
        if (vacia()) {
            System.out.println("Lista vacia");
        } else {
            Nodo aux = this.primero;
            for(int i = 0; i<this.tamaño; i++) {
                System.out.println(aux.valor);
                aux = aux.siguiente;
            }
        }
    }

    //

    public void eliminarIndice(int index) {

        if (vacia()) {
            System.out.println("lista vacia");
        } else if (index == 0) {
            this.primero = this.primero.siguiente;
            this.tamaño--;
        } else if (index >= this.tamaño) {
            System.out.println("indice invalido");
        } else if (index == this.tamaño - 1) {
            this.eliminarUltimo();
        } else {

            try {
                int cont = 0;
                Nodo aux = this.primero.siguiente;
                Nodo anterior = this.primero;

                while (cont != index - 1) {
                    anterior = anterior.siguiente;
                    aux = aux.siguiente;
                    cont++;
                }

                anterior.siguiente = aux.siguiente;

                this.tamaño--;
            } catch (NullPointerException e) {
                System.out.println("Ese indice no existe");
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
            while (aux != null) {
                if (contador == index) {
                    System.out.println(aux.valor);
                    encontrado = true;
                    break;
                }
                contador++;
                aux = aux.siguiente;
            }
            if (!encontrado) {
                System.out.println("No se encontro o el indice es invalido");
            }
        }
    }
}
