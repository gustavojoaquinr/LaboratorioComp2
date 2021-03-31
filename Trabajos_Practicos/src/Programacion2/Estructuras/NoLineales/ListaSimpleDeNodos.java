package Programacion2.Estructuras.NoLineales;

public class ListaSimpleDeNodos {

    public NodoNArio primero;
    public int tamaño;

    public ListaSimpleDeNodos() {
        this.primero = null;
        this.tamaño = 0;
    }

    public boolean vacia() {
        return this.primero == null;
    }

    public void agregar(String valor) {

        NodoNArio nuevo = new NodoNArio(valor);

        if (vacia()) {
            // agregamos el primer nodo
            this.primero = nuevo;
        } else {
            // se tiene que recorrer la lista hasta llegar al ultimo nodo
            NodoNArio aux = this.primero;

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
            // se tiene que recorrer la lista hasta llegar al ultimo nodo
            NodoNArio aux = primero;
            NodoNArio nodoAnterior = aux;

            while (aux.siguiente != null) {
                nodoAnterior = aux;
                aux = aux.siguiente;
            }

            // Verifico si realmente avanzó en la lista hasta llegar al
            // último nodo que sea distinto del primero.
            // Si estoy en el primero, entonces lo hago null para indicar que la lista esta vacia.
            if (aux == this.primero) {
                this.primero = null;
            } else {
                // Le indico al nodo anterior que no apunte más al nodo a eliminar "aux".
                nodoAnterior.siguiente = null;
            }

            // Decremento el tamaño
            this.tamaño--;
        }
    }

    public void imprimir() {
        if (vacia()) {
            System.out.println("Lista vacia");
        } else {
            NodoNArio aux = this.primero;
            for(int i = 0; i<this.tamaño; i++) {
                System.out.println(aux.valor);
                aux = aux.siguiente;
            }
        }
    }

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
                NodoNArio aux = this.primero.siguiente;
                NodoNArio anterior = this.primero;

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
            NodoNArio aux = this.primero;
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