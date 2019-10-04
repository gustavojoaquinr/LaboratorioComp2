package TPN8;

import java.util.Scanner;

public class Coche implements Vehiculo {
    Scanner sc = new Scanner(System.in);
    int velocidad=0;

    public Coche(int velocidadInicial) {
        this.velocidad = velocidadInicial;
        if(velocidadInicial > VELOCIDAD_MAXIMA){
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
        System.out.println("Ingrese la velocidad de frenado:");
        int frenado = sc.nextInt();
        this.velocidad -= frenado;
        if (this.velocidad < frenado) {
            System.out.println("Ya no es posible frenar mas");
            this.velocidad = 0;
        }
       mostrarVelocidad();
    }

    @Override
    public int Plazas() {
        return 5;
    }

    @Override
    public String Frenar(int cant_a, int cant_d) {
        return null;
    }

    @Override
    public int obtenerVelocidad(){
        return velocidad;
    }

    @Override
    public void mostrarVelocidad() {
        System.out.println("La velocidad actual es de: "+obtenerVelocidad()+" km/h");
    }

}
