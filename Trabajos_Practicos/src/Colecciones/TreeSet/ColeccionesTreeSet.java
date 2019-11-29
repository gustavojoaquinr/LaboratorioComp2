package Colecciones.TreeSet;

import java.util.TreeSet;

public class ColeccionesTreeSet {
    public static void main(String[] args) {

        TreeSet<String> ordenaGente = new TreeSet<String>();

        ordenaGente.add("Lucas");
        ordenaGente.add("Zilva");
        ordenaGente.add("Javier");
        ordenaGente.add("Albert");
        ordenaGente.add("Analia");

        /* El listado se mostrará en orden
         * alfabetico puesto que este tipo de listas
         * posee un método que permite esta operacion.
         */

        for (String gente : ordenaGente) {
            System.out.println(gente);
        }

       /* TreeSet<String> provincias = new TreeSet<String>();

        provincias.add("Misiones");
        provincias.add("Chaco");
        provincias.add("Corrientes");
        provincias.add("Buenos Aires");


        System.out.println(provincias);

        */

    }
}
