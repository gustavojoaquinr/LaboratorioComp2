package Repaso.Ejer2;

/*Construir un programa que dada una serie de vehículos caracterizados por su marca, modelo y precio,
imprima las propiedades del vehículo más barato. Para ello, se deberán leer por teclado las características de cada vehículo y
crear una clase que represente a cada uno de ellos.
*/

import java.util.Scanner;

public class Main {

    public static int indiceCocheMasBarato(Vehiculo coches[]){
        double precio;
        int indice = 0;

        precio = coches[0].getPrecio();
        for(int i=1; i<coches.length; i++){
            if (coches[i].getPrecio() < precio){ //mayor cambiar el < por >
                precio = coches[i].getPrecio();
                indice = 1;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String marca, modelo;
        double precio;
        int indiceBarato;

        System.out.println("Digite cantidad de vehiculos: ");
        int numeroVehiculos = sc.nextInt();

        //Creamos los objetos para los coches
        Vehiculo coches [] = new Vehiculo[numeroVehiculos];

        for(int i =0; i<coches.length; i++){
            sc.nextLine();
            System.out.println("\nDigite las caracteristicas del coche "+(i+1));
            System.out.println("Ingrese Marca del coche: ");
            marca = sc.nextLine();
            System.out.println("Ingrese Modelo del coche: ");
            modelo = sc.nextLine();
            System.out.println("Ingrese precio del coche: ");
            precio = sc.nextDouble();

            coches[i] = new Vehiculo(marca,modelo,precio);
        }

        indiceBarato = indiceCocheMasBarato(coches);

        System.out.println("\nEl coche mas barato es: ");
        System.out.println(coches[indiceBarato].mostrarDatos());

    }
}
