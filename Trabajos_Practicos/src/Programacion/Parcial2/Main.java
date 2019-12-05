package Programacion.Parcial2;

import Programacion.Estructuras.NoLineales.Grafo;

public class Main {

    public static void main(String[] args) {

        //EJERCICIO 1
        /*-Un metodo o funcion recursiva (llamado tambien recursividad funcional) es un metodo que se llama a si mismo hasta
        que se cumpla un caso base predefinido en la funcion (utilizando la capacidad del sistema para "apilar" ejecuciones de un
        proceso y dejarlos "en espera", para luego, cuando se llegue al caso base, desapilarlos del ultimo en ser apilado al primero).
        Por su parte "recursividad de datos" se refiere a las estructuras de datos que se definen recursivamente, por ejemplo:
        La clase "Casa" tiene un objeto "Casa" llamado "siguenteCasa" definido en la propia clase "Casa", entonces
        cada objeto de la clase "Casa" tendra un adherido un objeto "siguenteCasa" perteneciente a la misma clase,
        "siguenteCasa" tambien tendra un objeto "siguenteCasa" y sucesivamente.

        La recursividad sirve para definir estructuras de datos que pueden crecer dinamicamente, para ser usado como metodo
        iterativo, para simplificar el codigo (ya que suele ser mas facil de entender y requerir menos lineas de codigo).
        */

        //EJERCICIO 2
        /*
         El TAD "cola" es una estructura de datos que tiene el mismo funcionamiento que tiene una cola de cualquier supermercado.
         Almacena informacion estructurandola como una "cola", osea , si se pretende agregar un dato a la cola y dicha cola esta vacia, se agrega
         ese dato en el primer lugar, si no esta vacia, se lo agrega en el ultimo lugar. Procesa la informacion en ese orden,
         del primer lugar al ultimo lugar, el primero en llegar es el primero en salir.
         Este TAD contiene un nodo que es el puntero hacia el primer nodo de la "cola", que permite al TAD tener un referencia
         a todos los nodos que componen la "cola" (ya que todos los nodos estan conectados entre si).
         Es el inverso del TAD pila.
         Permite operaciones como "encolar()" y "desencolar()".
         Se usan por ejemplo para recorrer un arbol o grafo en anchura.


         El TAD "pila" es el inverso al TAD "cola", ya que su manera de estructurar su contenido es la opuesta al TAD "cola":
         Los ultimos datos en llegar seran "apilados" en el primer lugar, los primeros datos en llegar quedaran en el fondo
         de la "pila". Aplica tambien al momento de procesarlos: el ultimo en llegar sera el primero en ser procesado, mientras que el
         primero sera el ultimo en ser procesado.
         Organiza el contenido de manera similar a la recursividad de funciones.
         Permite operaciones como "apilar()" y "desapilar()".
        */

        //EJERCICIO 3
        /*
        Las tablas hash son estrucucturas de datos que facilitan enormemente la busqueda de la informacion que almacena.
        Funcionan mediante un arreglo de indices, cada indice reprensenta un objeto almacenado.
        La tabla toma un valor u objeto de entrada (para almacenarlo), y pasa su valor o "llave" por una funcion "hash".
        Esta funcion devuelve un valor numerico que, en teoria, es unico para el valor que fue procesado. Este valor
        numerico devuelto por la funcion sera el indice donde estara almacenado el objeto que se pretende guardar.
        EJ: String "Carlos Gomez" --> funcion hash("Carlos Gomez") --> la funcion devuelve, por ejemplo, un 58 --> indices[58] = "Carlos Gomez";
        Para encontrar el objeto "Carlos Gomez" solo seria necesario encontrar su indice, no haria falta recorrer la tabla de manera secuencial.

        En caso de que exista una "colision", osea dos objetos tengan el mismo indice, existen distintas tecnicas. La mas comun
        es que ese indice en vez de almacenar un solo objeto, almacene una lista de objetos.
         */

        //EJERCICIO 4
        /*
          El proceso de backtracking consiste basicamente en avanzar y luego "volver hacia atras" o "volver sobre sus propios pasos".
          Es necesario para el algoritmo de busqueda en profundidad, ya que, por ejemplo en un arbol, este algoritmo recorre y procesa, generalmente,
          todos los nodos hacia la izquierda del nodo que se esta procesando actualmente, el procesamiento de los nodos que estan a la derecha
          queda "en espera". Cuando ya no queden mas nodos a la izquierda, se debe "volver atras" y ejecutar el nodo que esta a la derecha (que habia quedado "en espera")
          y asi sucesivamente para cada nodo que ya fue procesado.
          La propia recursividad de funciones permite el proceso de "backtracking".
         */

        //EJERCICIO 5

        Grafo g = new Grafo();

        String[] vertices = {"A","B","C","D","E","F"};
        String[][] aristas = {{"A","B"},{"A","E"},{"A","F"},{"F","E"},{"F","D"},{"D","C"},{"C","B"},{"E","B"},{"E","C"},{"D","E"}};

        g.construir(vertices,aristas);

        //conectar vertices que tienen mas de una conexion
        g.conectar("A","E");
        g.conectar("F","D");
        g.conectar("C","B");

        //imprime la matriz, con ponderaciones
        g.imprimir();
        //imprime solo la cantidad de conexiones
        System.out.println();
        System.out.println("Matriz para representar la cantidad de conexiones entre vertices:");
        g.imprimirConexiones();

        System.out.println();
        g.conectar("D","E",5);

        System.out.println();
        g.imprimir();

        System.out.println("Nodos adyacentes de un vertice");
        g.getVecinos("A").imprimir();

        System.out.println();
        System.out.println("Desconectar");
        g.desconectar("A","E");
        System.out.println();
        g.imprimir();
        System.out.println();
        g.imprimirConexiones();

    }
}

/*Ejercicio 1:
 * La recursividad es la propiedad que tienen los procedimientos y funciones de llamarse a si mismo para solucionar un problema
 * que permite describir un numero infinito de operaciones mediante un programa recursivo finito sin implementar de
 * forma explicita estructuras repetitivas
 *
 * Se utiliza principalmente para simplificar codigo y cuando se necesita estructuras de datos que son recursivas
 * como los Arboles
 *
 *
 * Ejercicio 2:
 * TAD Pila: Es una estructura de datos lineal donde los elementos pueden añadirse/apilarse (push) o removerse/despilarse (pop)
 * solo por un extremo es llamada LIFO que significa Last In - First Out (Ultimo en entrar, primero en salir)
 *
 * TAD Cola: En una lista lineal de elementos en las que las operaciones insertar o eliminar se realizan en diferentes extremos
 * de la cola. Es llamada FIFO que significa First In - First Out (Primero en entrar, primero en salir)
 *
 * La principal diferencia es que las operaciones de la Pila (push y pop) se realizan en un solo extremo y en la Cola, en cambio
 * en diferentes extremos (enqueue/insertar  y dequeue/eliminar)
 *
 *
 * Ejericio 3:
 * La capacidad de datos de tamano arbitrario o de tamano fijo a cualquier funcion. es una estructura de datos que asocia llaves
 * o claves ocn valores. Se utilizan tranformando la clave con una funcion hash en un hash, un numero que identifica la
 * posicion donde la tabla hash localiza el valor deseado.
 * Para almacenar un elemento se debe convertir su clave a un numero, para recuperar los datos, es necesario conocer la clave del
 * elemento que se aplica la funcion hash. Si dos llaves generan un hash apuntando al mismo indice, se generan colisiones
 *
 * Ejercicio 4:
 * Es necesario el proceso de Backtracking porque el funcionamiento de DFS consiste en ir expandiendo todos y cadad uno de los nodso
 * que va localizando de forma recurrente en una camino concreto. Entonces cuando ya no quedan mas nodos que visitar en un camino
 * regresa el mismo proceso con cada uno de los hermanos del nodo ya procesado.
 *
 * */