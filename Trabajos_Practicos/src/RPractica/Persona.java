package RPractica;

public class Persona {
    String nombre;
    int edad;
    String dni;


    //METODO CONSTRUCTOR
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String dni) {//sobrecarga de constructor
        this.dni = dni;
    }

    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }

    //SOBRECARGA DE METODOS

    public void correr(){
        System.out.println("Soy "+nombre+" y estoy corriendo una maraton");
    }

    public void correr(int km){
        System.out.println("He corrido "+km+" km");
    }

}
