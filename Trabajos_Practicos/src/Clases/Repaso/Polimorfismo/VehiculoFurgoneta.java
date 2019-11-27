package Clases.Repaso.Polimorfismo;

public class VehiculoFurgoneta extends Vehiculo {

    private int carga;

    public VehiculoFurgoneta(String marca, String modelo, String matricula, int carga){
        super(marca,modelo,matricula);
        this.carga = carga;
    }

    public int getCarga(){
        return carga;
    }

    @Override
    public String mostrarDatos(){
        return super.mostrarDatos()+"Carga: "+carga+"\n";
    }

}
