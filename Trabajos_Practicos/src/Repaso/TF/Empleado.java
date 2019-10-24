package Repaso.TF;

public class Empleado extends Persona{
    private double sueldo;

    public Empleado(String nombre, int edad){
        super.setNombre(nombre);
        super.setEdad(edad);
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String getTipo(){
        return "Empleado";
    }

    @Override
    public String toString(){
        return "Nombre: "+super.getNombre()+"\nEdad: "+super.getEdad()+"\nTipo: "+this.getTipo()+"\nSueldo: $"+this.sueldo+
                "\n------------------------\n";
    }
}
