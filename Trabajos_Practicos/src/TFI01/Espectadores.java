package TFI01;

public class Espectadores extends Personas{
    public String fila;
    public int silla;

    public Espectadores(String nombre, int edad, String fila, int silla){
        super(nombre,edad);
        this.fila=fila;
        this.silla=silla;
    }

    @Override
    public String getTipo() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

    public String getButaca() {
        return null;
    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public int getSilla() {
        return silla;
    }

    public void setSilla(int silla) {
        this.silla = silla;
    }

    public void setNombre(String nombre) {
        nombre = nombre;
    }

    public String getNombre() {
        return getNombre();
    }

    public int getEdad() {
        return getEdad();
    }

    public void setEdad(int edad) {
        edad = edad;
    }

}
