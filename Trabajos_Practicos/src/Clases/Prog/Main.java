package Clases.Prog;

import javax.print.Doc;
import java.lang.annotation.Documented;

public class Main {

    public static void main(String[] args) {
        // write your code here

        // Creamos objetos de cada clase
        // particular, pero a su vez, reutilizamos
        // las propiedades definidas en la clase pabre: Persona

        Docente d01 = new Docente();
        d01.setApellido("perez");
        d01.setNroTel("362-44444444");
        d01.setDni(123);
        ImprimirLegago(d01);

        Alumno a01 = new Alumno();
        a01.setApellido("gomez");
        a01.setAnioIngreso(2018);
        a01.setDni(555);
        ImprimirLegago(a01);

        NoDocente nod01 = new NoDocente();
        nod01.setApellido("garcia");
        nod01.setCargo("jefe de depto.");
        nod01.setDni(999);
        ImprimirLegago(nod01);

        Director director = new Director();
        director.setDni(4545);
        ImprimirLegago(director);

        // --- Casting ---

        // Implementamos distintos tipos de casting: UpCasting y DownCasting
        Persona p01;

        director = (Director) d01;

        Persona d02 = new Docente();
        Docente director2 = new Director();
        director2 = (Director)d02;

        Object d03 = new Director();
        Director director3 = (Director) d03;

        // Comprobamos que con interfaces tambien
        // se puede implementar el UpCasting
        IElemento e = new Auto();
        IElemento e2 = new Alumno();

        // Implementamos un Arreglo de variables
        // que cumplan o implementen la interfaz IElemento.
        // Los objectos de este arreglo son todos de distintas
        // clases, pero tiene en comun, los metodos de la interfaz.
        IElemento[] arr = new IElemento[5];

        arr[0] = new Docente();
        arr[1] = new Alumno();
        arr[2] = new Director();
        arr[3] = new NoDocente();
        arr[4] = new Auto();

        for (int i = 0; i < 5; i++) {

            // Al tener un metodo que espera como parámetros
            // objetos que implementen la interfaz, podemos
            // construir código que es reutilizable, sin la
            // necesidad de tener un método "Imprimir" por cada
            // clase particular.
            ImprimirNombreCompleto(arr[i]);
        }

        // Herencia de Interfaces permite
        // crear objetos que utilicen solo
        // los métodos que necesitan.
        Hombre h = new Hombre();
        ImprimirGenero(h);
        ImprimirNombreCompleto(h);
    }

    // Este método recibe como parámetro objetos
    // que implementen la interfaz
    private static void ImprimirGenero(IHumano h){
        System.out.println(h.getGenero());
    }

    // Este método recibe como parámetro objetos
    // que implementen la interfaz, asi también
    // como objetos que implementen interfaces que
    // heredan de la interfaz IElemento.
    private static void ImprimirNombreCompleto(IElemento o){
        System.out.println(o.nombreCompleto());
    }

    private static void ImprimirLegago(Persona d){
         System.out.println(d.getLegajo());
    }

    private static void ImprimirLegago(Object d){
        System.out.println(d.toString());
    }


    private static void ImprimirLegago(Docente d){
        System.out.println(d.getLegajo());
    }

    private static void ImprimirLegago(Alumno d){
        System.out.println(d.getLegajo());
    }

    private static void ImprimirLegago(NoDocente d){
        System.out.println(d.getLegajo());
    }

}