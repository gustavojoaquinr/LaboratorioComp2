package TFI02;

public class Estudiante extends Persona{
    private String nombre;

    public Estudiante(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return this.nombre+" ";
    }

    @Override
    public void modificarDatos(Estudiante estudiante) {

    }
}
