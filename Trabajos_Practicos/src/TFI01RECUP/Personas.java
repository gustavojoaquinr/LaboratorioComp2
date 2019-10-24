package TFI01RECUP;

public class Personas {
    private String nombre;
    private int dni;

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString(){
        return "Nombre: "+nombre+"\nDni: "+dni+"\n";
    }
}
