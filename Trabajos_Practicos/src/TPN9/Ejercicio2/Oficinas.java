package TPN9.Ejercicio2;

public class Oficinas implements Edificio{
    private int cantidadOficinas;
    private double superficie;

    public Oficinas(){
        cantidadOficinas = 0;
        superficie = 0;
    }

    public Oficinas(int cantidadOficinas, double superficie){
        this.cantidadOficinas = cantidadOficinas;
        this.superficie = superficie;
    }

    public int getCantidadOficinas(){
        return cantidadOficinas;
    }

    public void setCantidadOficinas(int cantidadOficinas){
        this.cantidadOficinas = cantidadOficinas;
    }

    @Override
    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie){
        this.superficie = superficie;
    }

    
    public String toString(){
        Integer valorCantidadOficinas = cantidadOficinas;
        Double valorSuperficie = superficie;
        return "\nNumero de oficinas: " +cantidadOficinas+"\nSuperficie: "+superficie+" m2\n";
    }
}
