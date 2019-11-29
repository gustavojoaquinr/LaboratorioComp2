package TFI02;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Carrera> coleccionCarreras = new HashSet<Carrera>();
        Facultad fac = new Facultad(coleccionCarreras);

        fac.agregarCarrera();
        fac.eliminarCarrera("medicina");

        Set<Materia> coleccionMaterias = new HashSet<Materia>();
        Carrera car = new Carrera(coleccionMaterias);

        car.agregarMateria();
        car.eliminarMateria("quimica");
        car.buscarMateria();

        Set<Estudiante> coleccionEstudiantes = new HashSet<Estudiante>();
        Materia mar = new Materia(coleccionEstudiantes);

        mar.agregarEstudiante();
        mar.eliminaEstudiante("joaquin");


    }
}
