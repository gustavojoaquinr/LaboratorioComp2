package Clases.Repaso.TF;

public class Salas {

    private int capacidad;
    private String pelicula;
    private String nombre;
    private Espectador[] espectadores;

    public Salas(int capacidad, String nombre){
        this.capacidad=capacidad;
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setPelicula(String pelicula){
        this.pelicula = pelicula;
    }

    public String getEspectadores() {
        try {

            String listadoEspectadores ="\nLISTADO DE ESPECTADORES: \n";
            for (Espectador espectador : this.espectadores) {
                listadoEspectadores = listadoEspectadores+espectador.toString();
            }
            return listadoEspectadores;

        } catch (Exception e) {
            return "SIN ESPECTADORES CARGADOS";
        }
    }

    public void setEspectadores(Espectador[] espectadores){
        if(espectadores.length>this.capacidad) {
            System.out.println("CAPACIDAD DE ESPECTADORES SUPERADA");
        }else {
            this.espectadores = espectadores;
        }
    }

    public String toString() {
        return "\nSala (Nombre de la Sala: "+nombre+"- Capacidad:" + capacidad + "- Pelicula=" + pelicula + ")";
    }



}
