package Repaso.Polimorfismo;

public class VehiculoTurismo extends Vehiculo {

    private int numPuertas;

    public VehiculoTurismo(String marca, String modelo, String matricula, int numPuertas){
        super(marca,modelo,matricula);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas(){
        return numPuertas;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos()+"Numero de Puertas: "+numPuertas+"\n";

    }
}
