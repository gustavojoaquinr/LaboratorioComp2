package Clases.Prog;

public class Director extends Docente {

    private int anioAntiguedad;

    public int getAnioAntiguedad() {
        return anioAntiguedad;
    }

    public void setAnioAntiguedad(int anioAntiguedad) {
        this.anioAntiguedad = anioAntiguedad;
    }

    @Override
    public String getLegajo() {
        return "999" + getDni();
    }

    public String nombreCompleto(){
        return "director";
    }
}
