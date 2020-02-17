package Progi.Parcial2;

public class Personaparcial2 {
    //Puse los atributos de la clase privados para que no puedan ser modificados
    //desde el exterior
    private String nombre;
    private String apellido;
    private int dni;
    private int primeraVez;
    //Metodos
    //Obtener Nombre completo
    String obtenerNombreCompleto(){
        return(getApellido()+","+getNombre());
    }
    //Mostrar si es la primera vez
    static void primeraVez(int indicador){
        if(indicador==0){//Es su primera visita
            System.out.println("Es la primera vez que visita el parque ");
        }else{
            System.out.println("No es la primera vez que visita el parque");
        }
    }
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getPrimeraVez() {
        return primeraVez;
    }

    public void setPrimeraVez(int primeraVez) {
        this.primeraVez = primeraVez;
    }
}
