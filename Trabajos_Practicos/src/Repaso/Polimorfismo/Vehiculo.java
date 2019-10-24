package Repaso.Polimorfismo;

public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected String matricula;

    public Vehiculo(String marca, String modelo, String matricula){
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }
    public String getMatricula(){
        return matricula;
    }

    public String mostrarDatos(){
        return "Marca: "+marca+"\nModelo: "+modelo+"\nMatricula: "+matricula+"\n";
    }
}
