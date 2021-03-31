package Clases.Repaso.Rep2GetSet_Encapsular;

public class Clase1 {
    private int edad;
    private String nombre;

    public void setEdad(int edad){ //establecer
        this.edad = edad;
    }

    public int getEdad(){ //Mostrar, Obtener
        return edad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
