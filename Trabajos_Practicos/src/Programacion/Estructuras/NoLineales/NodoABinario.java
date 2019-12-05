package Programacion.Estructuras.NoLineales;

public class NodoABinario {

    public String valor;

    public NodoABinario izq;
    public NodoABinario der;

    public NodoABinario(String valor) {
        this.valor = valor;
        this.izq = null;
        this.der = null;
    }

    public NodoABinario getIzq(){
        return this.izq;
    }

    public NodoABinario getDer(){
        return this.der;
    }

    @Override
    public String toString() {
        return this.valor;
    }

}
