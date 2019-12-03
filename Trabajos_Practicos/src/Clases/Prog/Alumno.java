package Clases.Prog;

public class Alumno extends Persona {

    private int anioIngreso;

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public String getLegajo() {
        return "002" + getDni();
    }

    public String nombreCompleto(){
        return "alumno";
    }
}
