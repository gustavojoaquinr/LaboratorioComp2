package Progrii2.Parcial2;

public class Elementos {
    private String propiedad;
    private int casas;
    private int edificio;
    private int dinero;

    public Elementos(String propiedad, int casas, int edificio, int dinero){
        this.setPropiedad(propiedad);
        this.setCasas(casas);
        this.setEdificio(edificio);
        this.setDinero(dinero);
    }


    public String getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(String propiedad) {
        this.propiedad = propiedad;
    }

    public int getCasas() {
        return casas;
    }

    public void setCasas(int casas) {
        this.casas = casas;
    }

    public int getEdificio() {
        return edificio;
    }

    public void setEdificio(int edificio) {
        this.edificio = edificio;
    }

    public String mostrarDatos(){
        return "Propiedad: "+propiedad+"\nCasas: "+casas+"\nEdificio"+edificio+"\nDinero: "+dinero+"\n";
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
}
