package Progrii2.Prog2enClases;

public class Director extends Persona
{
    private int añoAntiguedad;

    public int getAñoAntiguedad() {
        return añoAntiguedad;
    }

    public void setAñoAntiguedad(int añoAntiguedad) {
        this.añoAntiguedad = añoAntiguedad;
    }

    @Override
    public String getLegajo()
    {
        return "999-"+ getDni();
    }
}
