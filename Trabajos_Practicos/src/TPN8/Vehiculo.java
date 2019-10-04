package TPN8;

public interface Vehiculo {
    final int VELOCIDAD_MAXIMA=120;

    void Acelerar();
    void Frenar();
    int Plazas();
    public String Frenar(int cant_a, int cant_d);
    int getvelocidad();
    void mostrarVelocidad();
}
