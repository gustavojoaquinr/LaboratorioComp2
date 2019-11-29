package TFI02;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Materia implements Informacion{
    Scanner sc = new Scanner(System.in);

    Set<Estudiante> coleccionEstudiantes;

    private String nombre;
    private Profesor titular;

    public Materia(String nombre) {
        this.nombre = nombre;
    }

    public Materia(Set<Estudiante>coleccionEstudiantes){
        this.coleccionEstudiantes=coleccionEstudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getTitular() {
        return titular;
    }

    public void setTitular(Profesor titular) {
        this.titular = titular;
    }

    public String toString() {
        return this.nombre+" ";
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Materia materia = (Materia) obj;
        return materia.getNombre().equals(this.getNombre());

    }

    public void agregarEstudiante() {
        System.out.println("Nombre Estudiante:");
        String nombre = sc.next();
        System.out.println("Apellido Estudiante:");
        String apellido = sc.next();
        System.out.println("Legajo:");
        int legajo = sc.nextInt();
        Estudiante estudiante = new Estudiante(nombre,apellido,legajo);
        coleccionEstudiantes.add(estudiante);
        System.out.println(estudiante.toString()+ " fue agregado");
    }

    public void eliminaEstudiante(String nombre) {
        Iterator<Estudiante> iterador = coleccionEstudiantes.iterator();
        System.out.println("Nombre Estudiante a eliminar:");
        nombre = sc.next();

        while(iterador.hasNext()) {
            String buscado = iterador.next().getNombre();
            if(buscado.equals(nombre)) {
                iterador.remove();
                System.out.println(nombre +" ELIMINADO");
            }
        }

    }

    @Override
    public int verCantidad() {
        Iterator<Estudiante> iterador = coleccionEstudiantes.iterator();
        int i = 0;
        while (iterador.hasNext()){
            i++;
        }
        return i;
    }

    @Override
    public String listarContenidos() {
        Iterator<Estudiante> iterador = coleccionEstudiantes.iterator();
        while (iterador.hasNext()){
            System.out.println("Estudiante");
            System.out.println("Nombre: "+ iterador.next().getNombre());
            System.out.println("Apellido: "+ iterador.next().getApellido());
            System.out.println("NLegajo:  "+ iterador.next().getLegajo());
        }

        return "";
    }
}
