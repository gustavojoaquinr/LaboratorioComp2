package TPN3;

public class TP3Ejercicio03_Personas {

    private String nombre;
    private int dni;
    private int edad;

    public TP3Ejercicio03_Personas(){
        setNombre("");
        setDni(0);
        setEdad(0);
    }

    public TP3Ejercicio03_Personas(String nombre, int dni, int edad){

        this.nombre = nombre;
        this.dni= dni;
        this.edad=edad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
