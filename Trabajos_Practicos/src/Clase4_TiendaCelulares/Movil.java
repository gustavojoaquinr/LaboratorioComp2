package Clase4_TiendaCelulares;

public class Movil {
    private int tamanioPantalla;
    private int capacidad;
    private double precio;
    private String tipo;
    private int camara;
    private int stock;

    public Movil(int tamanioPantalla, int capacidad, double precio, String tipo, int camara, int stock){
        this.setTamanioPantalla(tamanioPantalla);
        this.setCapacidad(capacidad);
        this.setPrecio(precio);
        this.setTipo(tipo);
        this.setCamara(camara);
        this.setStock(stock);
    }

    public String getInfo() {
        return ("Tamanio: "+getTamanioPantalla()+"\nCapacidad: "+getCapacidad()+"\nPrecio: "+getPrecio()+"\nTipo: "+getTipo()+"\nCamara: "+getCamara()+"\nStock: "+getStock());
    }

    public int getTamanioPantalla() {
        return tamanioPantalla;
    }

    public void setTamanioPantalla(int tamanioPantalla) {
        this.tamanioPantalla = tamanioPantalla;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCamara() {
        return camara;
    }

    public void setCamara(int camara) {
        this.camara = camara;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
