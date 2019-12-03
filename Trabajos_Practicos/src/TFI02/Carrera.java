package TFI02;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Carrera implements Informacion{
    Scanner sc = new Scanner(System.in);
    private String nombre;
    Set<Materia> coleccionMaterias;


    public Carrera(String nombre){
        this.setNombre(nombre);
    }

    public Carrera(Set<Materia>coleccionMaterias){
        this.coleccionMaterias=coleccionMaterias;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return "Carrera(" + "Nombre:'" + nombre + ", Materias: " + coleccionMaterias + ")";
    }


    public void agregarMateria() {
        System.out.println("\nAgregar Materia");
        System.out.println("Nombre:");
        String nombre = sc.next();
        Materia materia = new Materia(nombre);
        coleccionMaterias.add(materia);
        System.out.println(materia.toString()+ " fue agregada");
    }

    public void eliminarMateria(String nombre) {
        Iterator<Materia> iterador = coleccionMaterias.iterator();
        System.out.println("Nombre Materia a eliminar:");
        nombre = sc.next();

        while(iterador.hasNext()) {
            String buscado = iterador.next().getNombre();
            if(buscado.equals(nombre)) {
                iterador.remove();
                System.out.println(nombre +" ELIMINADA");
            }
        }

    }

    public void buscarMateria() {
        System.out.println("Nombre de Materia a buscar: ");
        String nombre = sc.next();

        for (Materia materia : coleccionMaterias) {
            if(materia.getNombre().equals(nombre)) {
                System.out.println(materia.toString() + " fue encontrada");
            } else {
                System.out.println("materia no encontrada");
                eliminarMateria(nombre);
            }
        }

    }

    @Override
    public int verCantidad() {
        int i = 1;
        Iterator<Materia> iterador = coleccionMaterias.iterator();
        while (iterador.hasNext()){
            i++;
        }
        return i;
    }

    @Override
    public String listarContenidos() {
        Iterator<Materia> iterador = coleccionMaterias.iterator();
        while(iterador.hasNext()){
            System.out.println("Materia: "+iterador.next().toString());
        }
        return null;
    }

}
