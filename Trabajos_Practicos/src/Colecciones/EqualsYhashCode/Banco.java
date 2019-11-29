package Colecciones.EqualsYhashCode;

public class Banco {
    public static void main(String[] args) {

        Cliente cliente01 = new Cliente("Gerardo García", 1, 60000);
        Cliente cliente02 = new Cliente("Lionel Messi", 2, 7565345);
        Cliente cliente03 = new Cliente("Gerardo García", 1, 60000);
        Cliente cliente04 = new Cliente("Cris Morena", 4, 4);

        /*
         * Para poder realizar la comparación es necesario
         * que sobreescribamos el método equals
         */

        cliente01 = cliente03;

        if(cliente01.equals(cliente03)) {
            System.out.println("SON IGUALES");
        } else{
            System.out.println("NO SON IGUALES");
        }

        /*
         * hashCode: código irrepetebile de un objeto. Si dos objetos tienen
         * hashCode distintos, es decir que están almacenados en lugares distintos
         * de la memoria, que son objetos distintos, aunque todos sus campos
         * tuvieran los mismos datos.
         */

        System.out.println(cliente01.getNombre()+": "+cliente01.hashCode());
        System.out.println(cliente03.getNombre()+": "+cliente03.hashCode());

    }

}
