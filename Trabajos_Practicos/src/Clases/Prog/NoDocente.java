package Clases.Prog;

public class NoDocente extends Persona {

    private String cargo;
    private double Sueldo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double sueldo) {
        Sueldo = sueldo;
    }

    public String getLegajo() {
        return "003" + getDni();
    }

    public String nombreCompleto(){
        return "no docente";
    }
}
