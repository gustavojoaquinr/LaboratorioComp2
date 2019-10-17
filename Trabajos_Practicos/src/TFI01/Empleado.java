package TFI01;

public class Empleado extends Personas{
    private double sueldo;

    public Empleado(String nombre, int edad, double sueldo){
        super(nombre,edad);
        this.setSueldo(sueldo);
    }

    @Override
    public String getTipo() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
