package TPN8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vehiculoElegido,acciones, eleccion,salir;
        System.out.println("Ingrese cantidad de Vehiculos: ");
        int numV = sc.nextInt();
        Vehiculo[] vehiculos = new Vehiculo[numV];
        Menues menu = new Menues();

        for (int i=0; i<numV; i++) {
            System.out.println("\nCrear Vehiculo numero "+(i+1));
            vehiculoElegido = menu.elegirVehiculo();
            vehiculos[i] = menu.crearVehiculo(vehiculoElegido);
        }

        do{
            System.out.println("\nDesea ver la Lista de vehiculos? 1-SI 2-NO");
            int opcion= sc.nextInt();
            if (opcion == 1) {
                menu.listarVehiculos(vehiculos, numV);
            }
            acciones = menu.AccionVehiculo();
            eleccion = menu.numVehiculo(numV);
            menu.MenuDeAcciones(vehiculos[eleccion],acciones);

            System.out.println("\nSi desea salir ingrese -1\nSi desea continuar ingrese 1");
            salir = sc.nextInt();
        }while (salir != -1);
    }
}
