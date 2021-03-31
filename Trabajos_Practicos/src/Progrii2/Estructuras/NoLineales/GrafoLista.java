package Progrii2.Estructuras.NoLineales;

public class GrafoLista {

    private ListaVertices vertices;

    public void agregar(String vertice) {
        vertices.agregar(vertice);
    }


    public void conectar (String vertice1, String vertice2) {

        //buscar el vertice1 y el vertice2 en la lista de vertices
        NodoGrafo v1 = buscarVertice(vertice1);
        NodoGrafo v2 = buscarVertice(vertice2);

        //Insertar vertice1 en la lista de adyacentes de vertice2 y viceversa

        v1.adyacentes.agregar(vertice2);
        v2.adyacentes.agregar(vertice1);

    }

    private NodoGrafo buscarVertice (String vertice) {

        NodoGrafo nodo = vertices.primero;
        NodoGrafo aux = new NodoGrafo("");

        while (nodo != null) {
            if (nodo.valor.equals(vertice)){
                aux = nodo;
                break;
            }
            nodo = nodo.siguiente;
        }

        return aux;
    }


}
