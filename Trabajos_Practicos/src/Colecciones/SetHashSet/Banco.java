package Colecciones.SetHashSet;

import java.util.HashSet;
import java.util.Set;

public class Banco {
    public static void main(String[] args) {

        Clientes cliente1 = new Clientes("Juan Perez","0001", 55600);
        Clientes cliente2 = new Clientes("Diego Maradona","0002", 1025680);
        Clientes cliente3 = new Clientes("Charly Garcia", "0003", 650234);
        Clientes cliente4 = new Clientes("Alberto Fernandez","0004", 504689);

        cliente1 = cliente2;
        System.out.println(cliente1.hashCode());
        System.out.println(cliente2.hashCode());
        System.out.println("-------------------");

        /*
         * Preguntarse que es lo que queremos que haga nuestra colección al futuro
         * para poder elegir la clase de colecciones que debemos elegir.
         * En el caso de este egemplo esto es lo que se ha considerado:
         * Repetir clientes -> NO
         * Permitir Borrar -> NO
         * Sólo Lectura -> NO
         * Estas necesidades que se ha establecido nos indica que debemos elegir
         * el tipo de colección Set con la clase HashSet
         */

        Set<Clientes> clientesBanco = new HashSet<Clientes>(); //Creacion de la coleccion

        clientesBanco.add(cliente1); //agregar elemento a la colección
        clientesBanco.add(cliente2);
        clientesBanco.add(cliente3);
        clientesBanco.add(cliente4);

        for (Clientes cliente : clientesBanco) {
            System.out.println(cliente.getNombre()+" "+cliente.getNroCuenta()+" $"+cliente.getSaldo());
            System.out.println(cliente.hashCode());
            System.out.println("");
        }
    }
}
