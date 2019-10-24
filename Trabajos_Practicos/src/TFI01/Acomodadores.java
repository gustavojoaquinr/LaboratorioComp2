package TFI01;

public class Acomodadores extends Empleado implements ParaAcomodadores{

    public Acomodadores(String nombre, int edad, double sueldo) {
        super(nombre, edad, sueldo);
    }

    public String getTipo() {
        return null;
    }
}
