package Repaso.Polimorfismo;

public class VehiculoDeportivo extends Vehiculo{

    private int cilindrada;

    public VehiculoDeportivo(String marca, String modelo, String matricula, int cilindrada){
        super(marca,modelo,matricula);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada(){
        return cilindrada;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos()+"Cilindrada: "+cilindrada+"\n";
    }
}
