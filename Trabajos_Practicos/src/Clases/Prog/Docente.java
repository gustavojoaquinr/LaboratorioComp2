package Clases.Prog;

public class Docente
        extends Persona
        implements IElemento {

    private double sueldo;
    private String titulo;

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String nombreCompleto(){
        return "docente";
    }

    @Override
    public String getLegajo() {
        return "001" + getDni();
    }
}
