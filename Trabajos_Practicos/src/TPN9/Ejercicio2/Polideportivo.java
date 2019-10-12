package TPN9.Ejercicio2;

public class Polideportivo implements Instalacion, Edificio{
    private String nombre;
    private int tipoInstalacion;
    private double superficie;
    private int CantidadDeCanchas;

    public Polideportivo(){
        nombre = "";
        tipoInstalacion = 0;
        superficie = 0;
        setCantidadDeCanchas(0);
    }

    public Polideportivo(String nombre, int tipoInstalacion, double superficie, int CantidadDeCanchas) {
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
        this.superficie = superficie;
        this.setCantidadDeCanchas(CantidadDeCanchas);
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }


    public String getNombre(){
        return nombre;
    }

    public void setTipoInstalacion(int tipoInstalacion){
        this.tipoInstalacion = tipoInstalacion;
    }

    @Override
    public int getTipoInstalacion(){
        return tipoInstalacion;
    }

    public void setSuperficie(double superficie){
        this.superficie = superficie;
    }

    @Override
    public double getSuperficie(){
        return superficie;
    }

    public String toString(){
        return "Nombre de la instalación: " +nombre+"\nTipo de instalación: "+tipoInstalacion+"\nSuperficie: "+superficie+" m2"+"\nCantidad de canchas: "+CantidadDeCanchas+"\n";
    }


    public int getCantidadDeCanchas() {
        return CantidadDeCanchas;
    }

    public void setCantidadDeCanchas(int cantidadDeCanchas) {
        CantidadDeCanchas = cantidadDeCanchas;
    }
}
