package Clases.P2P2;

public class Main {
    public static void main(String[] args) {

        Grafo grafo = new Grafo();

        String[] vertices = {"A","B","C","D","E","F"};
        String[][] aristas = {{"A","B"},{"A","E"},{"A","F"},{"F","E"},{"F","D"},{"D","C"},{"C","B"},{"E","B"},{"E","C"},{"D","E"}};
        /*String[][] aristas =
                {
                        {"A", "B"},{"A", "F"},{"A", "E"},{"E", "A"},{"B", "E"},{"B","C"},{"C", "B"}, {"C", "E"},
                        {"C", "D"}, {"D", "E"}, {"D", "F"}, {"F", "D"}, //{"E", "F"}
                };

         */

        grafo.construir(vertices,aristas);
        //conectar vertices que tienen mas de una conexion
        grafo.conectar("A","E");
        grafo.conectar("F","D");
        grafo.conectar("C","B");

        //imprime la matriz, con ponderaciones
        System.out.println("Matriz:");
        grafo.imprimir();

        System.out.println("\nMatriz con cantidad de conexiones entre vertices:");
        grafo.imprimirConexiones();
        System.out.println();

        grafo.conectar("D","E",5);
        grafo.imprimir();

        System.out.println("\nNodos adyacentes de un vertice");
        grafo.getVecinos("A").imprimir();

        //ListaSimple vecinos = g1.vecinos("E");
        //System.out.println("\n");
        //vecinos.imprimir();

        System.out.println("\nDesconectar");
        grafo.desconectar("A","E");
        grafo.imprimir();
        System.out.println();
        grafo.imprimirConexiones();

    }

    /*
        Ejercicio 1 :
        Un metodo o funcion recursiva (llamado tambien recursividad funcional) es un metodo que se llama a si mismo hasta
        que se cumpla un caso base predefinido en la funcion (utilizando la capacidad del sistema para "apilar" ejecuciones de un
        proceso y dejarlos "en espera", para luego, cuando se llegue al caso base, desapilarlos del ultimo en ser apilado al primero).
        Mientras que, recursividad de datos se refiere a las estructuras de datos que se definen recursivamente, por ejemplo:
        La clase "Casa" tiene un objeto "Casa" llamado "siguenteCasa" definido en la propia clase "Casa", entonces
        cada objeto de la clase "Casa" tendra un adherido un objeto "siguenteCasa" perteneciente a la misma clase,
        "siguenteCasa" tambien tendra un objeto "siguenteCasa" y sucesivamente.

        La recursividad sirve para definir estructuras de datos que pueden crecer dinamicamente, para ser usado como metodo
        iterativo, para simplificar el codigo (ya que suele ser mas facil de entender y requerir menos lineas de codigo).
        Se utiliza principalmente para simplificar codigo y cuando se necesita estructuras de datos que son recursivas
        como los Arboles

        /La recursividad es especialmente apropiada cuando el problema a resolver (por ejemplo calculo del factorial de un número)
        o la estructura de datos a procesar (por ejemplo los árboles) tienen una clara definición recursiva.
        No se debe utilizar la recursión cuando la iteración ofrece una solución obvia.
        Cuando el problema se pueda definir mejor de una forma recursiva que iterativa lo resolveremos utilizando recursividad.

        //La recursividad es la propiedad que tienen los procedimientos y funciones de llamarse a si mismo para solucionar un problema
        que permite describir un numero infinito de operaciones mediante un programa recursivo finito sin implementar de
        forma explicita estructuras repetitivas

        Ejercicio 2:
        TAD Pila: Es una estructura de datos lineal donde los elementos pueden añadirse/apilar (push) o removerse/despilar(pop)
        solo por un extremo. Es llamada LIFO que significa Last In - First Out (Ultimo en entrar, primero en salir)
        Los ultimos datos en llegar seran "apilados" en el primer lugar, los primeros datos quedaran en el fondo
        de la "pila". Aplica tambien al momento de procesarlos: el ultimo en llegar sera el primero en ser procesado, mientras que el
        primero sera el ultimo en ser procesado.
        Organiza el contenido de manera similar a la recursividad de funciones.
        Permite operaciones como "apilar" y "desapilar".

        TAD Cola: es una estructura de datos lineal en las que las operaciones insertar o eliminar se realizan en diferentes extremos
        de la cola. Es el inverso al TAD "pila", ya que su manera de estructurar su contenido es la opuesta.
        Almacena informacion estructurandola como una "cola", es decir , si se pretende agregar un dato a la cola vacia,
        se agrega en el primer lugar, si no esta vacia, se lo agrega en el ultimo lugar.
        Procesa la informacion en ese orden, del primer lugar al ultimo lugar, es llamada FIFO (First In - First Out) el primero en entrar
        es el primero en salir. Es el inverso al TAD "pila"
        Este TAD contiene un nodo que es el puntero hacia el primer nodo de la "cola", que permite al TAD tener un referencia
        a todos los nodos que componen la "cola" (ya que todos los nodos estan conectados entre si).
        Permite operaciones como "encolar" y "desencolar".
        Se usan por ejemplo para recorrer un arbol o grafo en anchura.

        La principal diferencia es que las operaciones de la Pila (push y pop) se realizan en un solo extremo y en la Cola, en cambio
        en diferentes extremos (enqueue/insertar  y dequeue/eliminar)

        Ejercicio 3:
        Las tablas hash son estrucucturas de datos que facilitan enormemente la busqueda de la informacion que almacena.
        Funcionan mediante un arreglo de indices, cada indice reprensenta un objeto almacenado.
        La tabla toma un valor u objeto de entrada (para almacenarlo), y pasa su valor o "llave" por una funcion "hash".
        Esta funcion devuelve un valor numerico que, en teoria, es unico para el valor que fue procesado. Este valor
        numerico devuelto por la funcion sera el indice donde estara almacenado el objeto que se pretende guardar.
        EJ: String "Carlos Gomez" --> funcion hash("Carlos Gomez") --> la funcion devuelve, por ejemplo, un 58 --> indices[58] = "Carlos Gomez";
        Para encontrar el objeto "Carlos Gomez" solo seria necesario encontrar su indice, no haria falta recorrer la tabla de manera secuencial.

        En caso de que exista una "colision", osea dos objetos tengan el mismo indice, existen distintas tecnicas. La mas comun
        es que ese indice en vez de almacenar un solo objeto, almacene una lista de objetos.

        //Para almacenar un elemento se debe convertir su clave a un numero, para recuperar los datos, es necesario conocer la clave del
        elemento que se aplica la funcion hash. Si dos llaves generan un hash apuntando al mismo indice, se generan colisiones

        Ejercicio 4:
        El proceso de backtracking consiste basicamente en avanzar y luego "volver hacia atras" o "volver sobre sus propios pasos".
        Es necesario para el algoritmo de busqueda en profundidad, ya que, por ejemplo en un arbol, este algoritmo recorre y procesa, generalmente,
        todos los nodos hacia la izquierda del nodo que se esta procesando actualmente, el procesamiento de los nodos que estan a la derecha
        queda "en espera". Cuando ya no queden mas nodos a la izquierda, se debe "volver atras" y ejecutar el nodo que esta a la derecha (que habia quedado "en espera")
        y asi sucesivamente para cada nodo que ya fue procesado.
        La propia recursividad de funciones permite el proceso de "backtracking".

        //Es necesario el proceso de Backtracking porque el funcionamiento de DFS consiste en ir expandiendo todos y cadad uno de los nodso
        que va localizando de forma recurrente en una camino concreto. Entonces cuando ya no quedan mas nodos que visitar en un camino
         regresa el mismo proceso con cada uno de los hermanos del nodo ya procesado.

         */

}


