package Progrii2.Pila;

public class Pila {
    private Nodo ultimo;
    private int tamano;
    String Lista = "";

    public Pila() {
        this.tamano = 0;
        this.ultimo = null;
    }

    public boolean vacia() {
        return this.ultimo == null;
    }

    // push
    public void apilar(int nodo) {

        Nodo nuevo = new Nodo(nodo);

        if (vacia()) {

            this.ultimo = nuevo;

        } else {

            nuevo.siguiente = this.ultimo;
            this.ultimo = nuevo;
        }

        this.tamano++;
    }

    // pop
    public int desapilar() {
        int aux = 0;
        if (vacia()) {
            System.out.println("Pila vacia");
        } else {

            aux = this.ultimo.valor;
            //Nodo1 aux = new Nodo1(this.ultimo.valor);

            this.ultimo = this.ultimo.siguiente;
            this.tamano--;
        }
        return aux;
    }

    public void imprimir() {
        if (vacia()) {
            System.out.println("Pila vacia");
        } else {
            Nodo aux = this.ultimo;
            for(int i = 0; i<this.tamano; i++) {
                System.out.println(aux.valor);
                aux = aux.siguiente;
            }
        }
    }

    public int mostrarUltimo(){
        return ultimo.valor;
    }

    public int tamanoPila(){
        return tamano;
    }

    public void vaciarPila(){
        while (!vacia()){
            desapilar();
        }
    }

}
