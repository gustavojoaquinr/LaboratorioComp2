package TFI01RECUP;

public class Destino extends Lugares implements ParaMostrar{
    private Vehiculos vehiculos;

    public Destino(){

    }

    public Destino(String direccion, String nombreLugares){
        super.setDireccion(direccion);
        super.setNombre(nombreLugares);
    }

    @Override
    public Vehiculos getVehiculos() {
        return vehiculos;
    }

    @Override
    public void setVehiculos(Vehiculos vehiculos) {
        this.vehiculos=vehiculos;
    }

    public String toString(){
        return "Nombre: "+getNombre()+"\nDireccion: "+getDireccion()+"\n";
    }

}
