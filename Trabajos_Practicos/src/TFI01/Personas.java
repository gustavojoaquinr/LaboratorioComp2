package TFI01;

public abstract class Personas {
    public String nombre;
    public int edad;

    public Personas(String nombre, int edad) {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract String getTipo();
    public abstract String toString();
}
