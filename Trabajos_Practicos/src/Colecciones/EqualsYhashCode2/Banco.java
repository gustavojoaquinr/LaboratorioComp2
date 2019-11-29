package Colecciones.EqualsYhashCode2;

import java.util.HashSet;
import java.util.Set;

public class Banco {
    public static void main(String[] args) {

        Clientess cliente01 = new Clientess("Hugo Moyano", 1, 60000);
        Clientess cliente02 = new Clientess("Hugo Moyano", 1, 60000);


        Set<Clientess> clientesBanco = new HashSet<Clientess>();    //creación de la colección

        clientesBanco.add(cliente01);
        clientesBanco.add(cliente02);

        for (Clientess clientes : clientesBanco) {
            System.out.println(clientes.getNombre() + ": " + clientes.hashCode());
        }
    }
}
