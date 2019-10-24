package Repaso.Herencia;

public class Estudiante extends Persona {
    private int codigoEst;
    private double notaFinal;

    public Estudiante(String nombre, String apellido, int edad, int codigoEst, double notaFinal){
        super(nombre, apellido, edad);
        this.codigoEst = codigoEst;
        this.notaFinal = notaFinal;
    }

    //get nombre,apellido y edad ya los heredo

    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre()+"\nApellido: "+getApellido()+"\nEdad: "+getEdad()+
                "\nCodigo del Estudiante: "+codigoEst+"\nNota Final: "+notaFinal);
    }

}
