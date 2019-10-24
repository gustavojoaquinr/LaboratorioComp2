package TFI01RECUP;

public class Vehiculos extends Automovil {
    private Lugares origen;
    private Lugares destino;
    private Choferes chofer;
    private Pasajeros [] pasajeros;
    private String matricula;
    private int capacidad;


    public Vehiculos(int capacidad, String matricula){
        this.matricula=matricula;
        this.capacidad=capacidad;
    }

    @Override
    public String toString() {
        return "Vehiculo (Capacidad: "+capacidad+" - Matricula: "+matricula+")";
    }

    @Override
    public void setChofer(Choferes chofer) {
        this.chofer = chofer;
    }

    @Override
    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    @Override
    public void setPasajeros(Pasajeros[] pasajeros) {
        if(pasajeros.length>this.capacidad) {
            System.out.println("CAPACIDAD DE PASAJEROS SUPERADA");
        }else {
            this.pasajeros = pasajeros;
        }
    }

    public String getPasajeros() {
        try {
            String listadoPasajeros = "\nLista de Pasajeros: \n";
            for(Pasajeros pasajero: this.pasajeros){
                listadoPasajeros = listadoPasajeros+pasajero.toString();
            }

        }catch (Exception e) {
            return "SIN PASAJEROS CARGADOS";
        }
        return null;
    }

    public Lugares getOrigen() {
        return origen;
    }

    public void setOrigen(Lugares origen) {
        this.origen = origen;
    }

    public Lugares getDestino() {
        return destino;
    }

    public void setDestino(Lugares destino) {
        this.destino = destino;
    }

    public Choferes getChofer() {
        return chofer;
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }



}
