package TFI01;

import java.util.Scanner;

public class Sala{
    private int capacidadSala=10;
    private String pelicula;
    private String nombredeSala;
    private Espectadores[] e1;
    private int cont=0;

    public Sala(String pelicula, String nombredeSala) {
        this.pelicula=pelicula;
        this.nombredeSala=nombredeSala;
        this.e1= new Espectadores[capacidadSala];
    }

    Scanner sc = new Scanner(System.in);
    int capacidad;

    public void ingresarCapacidad(){
        System.out.println("Ingrese capacidad de la Sala: ");
        capacidad = sc.nextInt();
    }

    public void cargarEspectadores(){
        if(this.cont < capacidadSala){
            System.out.println("Ingrese nombre: ");
            String nombre = sc.next();
            System.out.println("Ingrese edad: ");
            int edad = sc.nextInt();
            System.out.println("Ingrese fila: ");
            String fila = sc.next();
            System.out.println("Ingrese silla: ");
            int silla = sc.nextInt();
            Espectadores esp = new Espectadores(nombre,edad,fila,silla);
            e1[cont]=esp;
            this.cont++;
        }else{
            System.out.println("Error en el ingreso de datos");
        }
    }

    public void listarEspectadores(){
        for (int i=0;i<cont;i++){
            System.out.println("Nombre: " +e1[i].nombre);
            System.out.println("Edad: "+ e1[i].edad);
            System.out.println("Fila: "+e1[i].fila);
            System.out.println("Silla: "+e1[i].silla);
        }
    }

    public int getCapacidadSala() {
        return capacidadSala;
    }

    public void setCapacidadSala(int capacidadSala) {
        this.capacidadSala = capacidadSala;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getNombredeSala() {
        return nombredeSala;
    }

    public void setNombredeSala(String nombre) {
        this.nombredeSala = nombre;
    }

    public Espectadores[] getEspectadores() {
        return e1;
    }

    public void setEspectadores(Espectadores[] espectadores) {
        this.e1 = espectadores;
    }


}
