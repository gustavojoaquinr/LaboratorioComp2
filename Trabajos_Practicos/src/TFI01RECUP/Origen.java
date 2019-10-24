package TFI01RECUP;

public class Origen extends Lugares implements ParaMostrar{
    private Vehiculos vehiculos;

    public Origen (){

    }

    public Origen(String nombreLugares, String direccion){
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

    @Override
    public String toString(){
        return "Nombre: "+getNombre()+"\nDireccion: "+getDireccion()+"\n";
    }
}
