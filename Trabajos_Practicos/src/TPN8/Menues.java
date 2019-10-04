package TPN8;

import java.util.Scanner;

public class Menues {
    Scanner sc = new Scanner(System.in);

    public void MenuDeAcciones(Vehiculo vehiculoElegido, int comportamientos){
        switch (comportamientos){
            case 1:
                vehiculoElegido.Acelerar();
                break;
            case 2:
                vehiculoElegido.Frenar();
                break;
            case 3:
                System.out.println("La cantidad de plazas del vehiculo es de: "+vehiculoElegido.Plazas());
                break;
            default:
                break;
        }
    }

    public int elegirVehiculo(){
        System.out.println("Ingrese 1 para AUTO ---- Ingrese 2 para MOTO");
        int opc = sc.nextInt();
        if(opc != 1 && opc != 2){
            System.out.println("No es valido");
            return elegirVehiculo();
        }
        return opc;
    }

    public int setVelocidadInicial(){
        System.out.println("Ingrese velocidad inicial:");
        int velocidad = sc.nextInt();
        return velocidad;
    }


    public int AccionVehiculo(){
        System.out.println("\nIngrese 1 para ACELERAR");
        System.out.println("Ingrese 2 para FRENAR");
        System.out.println("Ingrese 3 para ver la cantidad de PLAZAS");
        int opc = sc.nextInt();
        return opc;
    }

    public int numVehiculo(int cantidadVehiculos){
        System.out.println("Ingrese numero de Vehiculo (1 al "+cantidadVehiculos+")");
        int opc = sc.nextInt();
        if(opc < 0 || opc > (cantidadVehiculos)){
            System.out.println("No es valido");
            return numVehiculo(cantidadVehiculos);
        }else{
            return (opc-1);
        }
    }


    public Vehiculo crearVehiculo(int opc){
        if (opc == 1){
            return new Coche(setVelocidadInicial());
        }else{
            return new Moto(setVelocidadInicial());
        }
    }

    public void listarVehiculos(Vehiculo[] array, int cant){
        for (int i = 0; i<cant ; i++){
            System.out.println("\nVehiculo "+(i+1)+" velocidad actual: "+ array[i].obtenerVelocidad()+" km/h");
        }
    }






}
