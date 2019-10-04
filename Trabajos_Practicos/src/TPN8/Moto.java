package TPN8;

import java.util.Scanner;

public class Moto implements Vehiculo{
    Scanner sc = new Scanner(System.in);
    int velocidad=0;

    public Moto(int velocidadInicial) {
        this.velocidad = velocidadInicial;
        if(velocidad > VELOCIDAD_MAXIMA){
            System.out.println("La velocidad máxima ha sido superada");
        }
    }

    @Override
    public void Acelerar() {
        System.out.println("Ingrese la velocidad de aceleracion:");
        int aceleracion = sc.nextInt();
        this.velocidad += aceleracion;
        if (this.velocidad > VELOCIDAD_MAXIMA) {
            System.out.println("La velocidad máxima ha sido superada");
        }
        mostrarVelocidad();
    }

    @Override
    public void Frenar() {
        System.out.println("Ingrese velocidad de frenado para rueda delantera");
        int frenoDelantero = sc.nextInt();
        System.out.println("Ingrese velocidad de frenado para rueda trasera");
        int frenoTrasero = sc.nextInt();

        if(frenoDelantero < 0){
            frenoDelantero =0;
        }
        if(frenoTrasero < 0){
            frenoTrasero=0;
        }

        if ((frenoDelantero > frenoTrasero) && (frenoDelantero > this.velocidad || frenoTrasero < this.velocidad)){
            System.out.println("Frenó demasiado fuerte, chocó");
            this.velocidad=0;
        }else{
            if (frenoDelantero > frenoTrasero){
                this.velocidad -= frenoDelantero;
            }else{
                this.velocidad -= frenoTrasero;
            }
            if(this.velocidad < 0){
                System.out.println("No se puede frenar mas");
                this.velocidad=0;
            }
        }
        mostrarVelocidad();
    }

    @Override
    public int Plazas() {
        return 2;
    }

    @Override
    public String Frenar(int cant_a, int cant_d) {
        return null;
    }

    @Override
    public int obtenerVelocidad() {
        return this.velocidad;
    }

    @Override
    public void mostrarVelocidad() {
        System.out.println("La velocidad actual es de: "+obtenerVelocidad()+" km/h");
    }
}
