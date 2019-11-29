package Colecciones.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class BuscarYeliminar {
    public static void main(String[] args) {

        LinkedList<String> provincias = new LinkedList<String>();

        provincias.add("Chaco");
        provincias.add("Corrientes");
        provincias.add("Misiones");
        provincias.add("Buenos Aires");

        System.out.println(provincias);

        ListIterator<String> itProvincias = provincias.listIterator();

        System.out.println("¿Qué provincia quiere eliminar?");
        Scanner sc = new Scanner(System.in);
        String provinciaEliminar = sc.nextLine();

        while (itProvincias.hasNext()) {
            if(itProvincias.next().equals(provinciaEliminar)) { //Otra opcion: en vez de provinciaElimnar poner "Chaco" por ejemplo
                itProvincias.remove();
            }
        }

        System.out.println(provincias);

    }
}
