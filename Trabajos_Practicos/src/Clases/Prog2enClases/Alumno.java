package Clases.Prog2enClases;

public class Alumno extends Persona
{

    private int legajo;
    private int añoingreso;

    @Override
    public String getLegajo() {
        return "002-" + getDni();
    }

    public int getAñoingreso() {
        return añoingreso;
    }

    public void setAñoingreso(int añoingreso) {
        this.añoingreso = añoingreso;
    }

}
