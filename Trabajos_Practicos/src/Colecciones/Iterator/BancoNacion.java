package Colecciones.Iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BancoNacion {
    public static void main(String[] args) {

        ClientesBN cliente01 = new ClientesBN("Gerardo García", 1, 60000);
        ClientesBN cliente02 = new ClientesBN("Ricardo Molinari", 3, 41234123);
        ClientesBN cliente03 = new ClientesBN("Alicia Dublerdor", 1, 124343);
        ClientesBN cliente04 = new ClientesBN("Rita Sabarese", 5, 12314412);

        Set<ClientesBN> clientesBanco = new HashSet<ClientesBN>(); // creación de la colección

        clientesBanco.add(cliente01);
        clientesBanco.add(cliente02);
        clientesBanco.add(cliente03);
        clientesBanco.add(cliente04);

        /*
         * Utilizamos la interface Iterator para crear nuestro iterador. el objeto
         * iterador debe recibir para su creación la colección seguida del método
         * iterator
         */

        Iterator<ClientesBN> iterador = clientesBanco.iterator();

        // ELIMINAR UN ELEMENTO DE LA COLECCIÓN
        while (iterador.hasNext()) {
            String elementoEliminar = iterador.next().getNombre();

            if (elementoEliminar.equals("Gerardo García"))
                iterador.remove();
        }

        //RECORRER LA COLECCIÓN
        for (ClientesBN clientes : clientesBanco) {
            System.out.println(clientes.toString());
        }

    }
}
