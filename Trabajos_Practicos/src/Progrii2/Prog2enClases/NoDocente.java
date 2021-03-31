package Progrii2.Prog2enClases;

public class NoDocente extends Persona
{

    private String cargo;
    private double sueldo;

@Override
 public String getLegajo()
 {
     return "003-" + getDni();
 }
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
