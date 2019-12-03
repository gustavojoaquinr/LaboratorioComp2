package TFI02;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private int legajo;
    public abstract void modificarDatos(Estudiante estudiante);

    public Persona(String nombre, String apellido, int legajo) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setLegajo(legajo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "Persona(" + "Nombre: " + nombre + ", Apellido: '" + apellido + ", Nro Legajo:" + legajo + ")";
    }

    public void modificarDatos(String nombre, String apellido, int legajo){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setLegajo(legajo);
    }

}
