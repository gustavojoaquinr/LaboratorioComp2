package TFI01RECUP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;
        System.out.println("Ingrese la cantidad de pasajeros: ");

        try{
            int nPasajeros = sc.nextInt();
            Pasajeros[] pasajeros = new Pasajeros [nPasajeros];
            Vehiculos vehiculo2 = new Vehiculos(10,"ABB123");

            do{
                System.out.println("\nIngrese 1 para cargar pasajeros a un vehiculo");
                System.out.println("Ingrese 2 para crear chofer");
                System.out.println("Ingrese 3 para crear un vehiculo");
                System.out.println("Ingrese 4 para asignar a cada Vehículo el Origen");
                System.out.println("Ingrese 5 para asignar a cada Vehículo el Destino");
                System.out.println("Ingrese 0 para salir");
                opc=sc.nextInt();

                switch(opc) {
                    case 1:
                        for (int i = 0; i <= pasajeros.length - 1; i++) {
                            System.out.println("\nPasajero " + (i + 1) + ":");
                            sc.nextLine();
                            System.out.println("Ingrese Nombre del pasajero: ");
                            String nombre = sc.nextLine();
                            System.out.println("Ingrese dni del pasajero: ");
                            int dni = sc.nextInt();

                            pasajeros[i] = new Pasajeros(nombre, dni);
                        }

                        Vehiculos vehiculoParaPasajeros = new Vehiculos(3,"ASC123");

                        vehiculoParaPasajeros.setPasajeros(pasajeros);
                        System.out.println(vehiculoParaPasajeros.getPasajeros());
                        break;

                    case 2:
                        sc.nextLine();
                        System.out.println("\nIngrese nombre chofer: ");
                        String nombre = sc.nextLine();
                        System.out.println("Ingrese dni chofer: ");
                        int dni = sc.nextInt();
                        Choferes chofer1 = new Choferes(nombre,dni);
                        System.out.println(chofer1.toString());
                        break;

                    case 3:
                        Vehiculos vehiculo1 = new Vehiculos(3,"AAA123");
                        System.out.println(vehiculo1.toString());
                        break;
                    case 4:

                        sc.nextLine();
                        System.out.println("Ingrese nombre: ");
                        String nombreLugares = sc.nextLine();
                        System.out.println("Ingrese direccion: ");
                        String direccion = sc.nextLine();
                        Origen origen = new Origen(nombreLugares,direccion);

                        origen.setVehiculos(vehiculo2);
                        System.out.println(origen.toString());break;

                    case 5:
                        sc.nextLine();
                        System.out.println("Ingrese nombre: ");
                        nombreLugares = sc.nextLine();
                        System.out.println("Ingrese direccion: ");
                        direccion = sc.nextLine();
                        Destino destino = new Destino(nombreLugares,direccion);

                        destino.setVehiculos(vehiculo2);
                        System.out.println(destino.toString());break;
                    default:
                        break;
                }
            }while(opc!=0);

        }catch (Exception e){
                System.out.println("ERROR EN EL INGRESO DE DATOS");
        }
    }
}
