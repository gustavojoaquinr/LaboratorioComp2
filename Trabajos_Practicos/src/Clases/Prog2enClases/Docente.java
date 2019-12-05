package Clases.Prog2enClases;

public class Docente extends Persona
{
    private double sueldo;
    private String titulo;


    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
@Override
    public String getLegajo() {
        return "001-"+ getDni();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
