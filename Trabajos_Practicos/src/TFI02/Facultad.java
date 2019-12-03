package TFI02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Facultad implements Informacion{
    Scanner sc = new Scanner(System.in);
    private String nombre;

    Set<Carrera> coleccionCarreras;
    //private Carrera carrera;


    public Facultad(Set<Carrera>coleccionCarreras){
        this.coleccionCarreras=coleccionCarreras;
    }

    public void agregarCarrera() {
        System.out.println("\nAgregar Carrera");
        System.out.println("Nombre:");
        String nombre = sc.next();
        Carrera carrera = new Carrera(nombre);
        coleccionCarreras.add(carrera);
        System.out.println(carrera.toString()+ " fue agregada");
    }


    public void eliminarCarrera(String nombre) {
        Iterator<Carrera> iterador = coleccionCarreras.iterator();
        System.out.println("Nombre Carrera a eliminar:");
        nombre= sc.next();

        while(iterador.hasNext()) {
            String buscado = iterador.next().getNombre();
            if(buscado.equals(nombre)) {
                iterador.remove();
                System.out.println(nombre +" ELIMINADA");
            }
        }
    }


    @Override
    public int verCantidad() {
        int i = 1;
        Iterator<Carrera> iterador = coleccionCarreras.iterator();
        while (iterador.hasNext()){
            i++;
        }
        return i;
    }

    @Override
    public String listarContenidos() {
        Iterator<Carrera> iterador = coleccionCarreras.iterator();
        while(iterador.hasNext()){
            System.out.println("Carrera: "+iterador.next().toString());
        }
        return null;
    }
}
