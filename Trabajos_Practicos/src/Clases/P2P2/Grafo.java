package Clases.P2P2;

public class Grafo {
    private String[] vertices;
    private String[][] aristas;
    private int[][] matriz;
    private int[][] matrizConexion;

    public void construir(String[] vertices, String[][] aristas) {

        this.vertices = vertices;
        this.aristas = aristas;
        matrizConexion = new int[aristas.length][aristas.length];

        matriz = new int[vertices.length][vertices.length];
        for (int i = 0; i < vertices.length; i++) {
            for (int j = 0; j < vertices.length; j++) {
                matriz[i][j] = 0;
            }
        }

        for (int i = 0; i < aristas.length; i++) {

            String vertice1 = aristas[i][0];
            String vertice2 = aristas[i][1];

            int iVertice1 = buscarVertice(vertice1);
            int iVertice2 = buscarVertice(vertice2);

            matriz[iVertice1][iVertice2] = 1;
            matriz[iVertice2][iVertice1] = 1;

            matrizConexion[iVertice1][iVertice2] = 1;
            matrizConexion[iVertice2][iVertice1] = 1;

        }
    }

    public void conectar(String vertice1, String vertice2) {
        int iVertice1 = buscarVertice(vertice1);
        int iVertice2 = buscarVertice(vertice2);

        matriz[iVertice1][iVertice2] = 1;
        matriz[iVertice2][iVertice1] = 1;

        //controlar que no sobrepase el limite de 2 conexiones por vertice
        if (matrizConexion[iVertice1][iVertice2] < 2 && matrizConexion[iVertice2][iVertice1] < 2) {
            matrizConexion[iVertice1][iVertice2]++;
            matrizConexion[iVertice2][iVertice1]++;
        }
    }

    // Con Ponderacion
    public void conectar(String vertice1, String vertice2, int ponderacion) {
        int iVertice1 = buscarVertice(vertice1);
        int iVertice2 = buscarVertice(vertice2);

        matriz[iVertice1][iVertice2] = ponderacion;
        matriz[iVertice2][iVertice1] = ponderacion;

        if (matrizConexion[iVertice1][iVertice2] < 2 && matrizConexion[iVertice2][iVertice1] < 2) {
            matrizConexion[iVertice1][iVertice2]++;
            matrizConexion[iVertice2][iVertice1]++;
        }
    }

    public void desconectar(String vertice1, String vertice2){
        //proceso inverso
        int iVertice1 = buscarVertice(vertice1);
        int iVertice2 = buscarVertice(vertice2);

        //si tiene 2 conexiones, se resta una pero igual mantiene su conectividad
        if (matrizConexion[iVertice1][iVertice2] == 2 && matrizConexion[iVertice2][iVertice1] == 2) {
            matrizConexion[iVertice1][iVertice2]--;
            matrizConexion[iVertice2][iVertice1]--;
            matriz[iVertice1][iVertice2] = 1;
            matriz[iVertice2][iVertice1] = 1;
        }else {
            matrizConexion[iVertice1][iVertice2] = 0;
            matrizConexion[iVertice2][iVertice1] = 0;
            matriz[iVertice1][iVertice2] = 0;
            matriz[iVertice2][iVertice1] = 0;
        }
    }

    public void agregarVertice(String vertice) {

        String[] nuevosVertices = new String[this.vertices.length + 1];

        for (int i = 0; i < nuevosVertices.length - 1; i++) {
            nuevosVertices[i] = this.vertices[i];
        }
        nuevosVertices[nuevosVertices.length - 1] = vertice;

        this.vertices = nuevosVertices;

        int[][] nuevaMatriz = new int[matriz.length + 1][matriz.length + 1];

        //cargar matriz de nuevo

        for (int i = 0; i < nuevaMatriz.length - 1; i++) {
            for (int j = 0; j < nuevaMatriz.length - 1; j++) {
                nuevaMatriz[i][j] = this.matriz[i][j];
            }
        }
        nuevaMatriz[nuevaMatriz.length - 1][nuevaMatriz.length - 1] = 0;

        this.matriz = nuevaMatriz;

    }

    public void imprimir() {
        for (int i = 0; i < vertices.length; i++) {
            for (int j = 0; j < vertices.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void imprimirConexiones() {
        for (int i = 0; i < vertices.length; i++) {
            // columnas
            for (int j = 0; j < vertices.length; j++) {
                System.out.print(matrizConexion[i][j] + " ");
            }
            System.out.println();
        }
    }

   //
    private boolean[] estaVisitado;

    // Buscar
    public void DFS(String buscado) {
        estaVisitado = new boolean[vertices.length];
        int encontrado = 0;

        for (int i = 0; i < vertices.length; i++) {
            estaVisitado[buscarVertice(vertices[i])] = false;
        }

        for (int i = 0; i < vertices.length; i++) {
            if (!estaVisitado[buscarVertice(vertices[i])]) {
                encontrado = DFSVisitar(vertices[i], buscado);
                if (encontrado == buscarVertice(buscado)) {
                    break;
                }
            }
        }

        if (encontrado != -1) {
            System.out.println("Encontrado en posicion: " + encontrado);
        } else {
            System.out.println("No se lo encontro");
        }


    }

    private int DFSVisitar(String vertice, String buscado) {
        if (vertice.equals(buscado)) {
            return buscarVertice(vertice);
        } else {
            estaVisitado[buscarVertice(vertice)] = true;
            String[] arrayVecinos = obtenerVecinos(getVecinos(vertice));

            for (String vecino : arrayVecinos) {
                if (!estaVisitado[buscarVertice(vecino)]) {
                    return DFSVisitar(vecino, buscado);
                }
            }
        }

        return -1;
    }

    private String[] obtenerVecinos(ListaSimple vecinos) {

        Nodo aux = vecinos.primero;
        String vec[] = new String[vecinos.tamaño];

        for (int i = 0; i < vecinos.tamaño; i++) {
            vec[i] = aux.valor;
            aux = aux.siguiente;
        }

        return vec;

    }


    //vecinos
    public ListaSimple getVecinos(String vertice) {

        ListaSimple listaVecinos = new ListaSimple();
        int iVertice = buscarVertice(vertice); //obtengo la posicion en la matriz del argumento vertice

        for (int i = 0; i < vertices.length; i++) {
            int valor = matriz[iVertice][i]; //fijarse si el valor es mayor a 0 (osea, es un vecino).
            if (valor > 0) {
                String vecino = vertices[i]; //valor del vertice
                listaVecinos.agregar(vecino);
            }
        }
        return listaVecinos;
    }

    private int buscarVertice(String vertice) {
        for (int i = 0; i < this.vertices.length; i++) {
            if (this.vertices[i].equals(vertice)) {
                return i;
            }
        }

        return -1;
    }

    public void buscar(String vertice){

    }

    public void insertar(String vertice) {

    }

    public void recorrer(String vertice1, String vertice2) {

    }

    public void eliminar(String vertice) {

    }

}
