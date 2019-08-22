package Clase4_TiendaCelulares;

import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese tamanio de pantalla:");
        int tamanio = teclado.nextInt();
        System.out.println("Ingrese capacidad:");
        int capacidad = teclado.nextInt();
        System.out.println("Ingrese precio:");
        double precio = teclado.nextDouble();
        System.out.println("Ingrese tipo:");
        String tipo = teclado.next();
        System.out.println("Ingrese camara:");
        int camara = teclado.nextInt();
        System.out.println("Ingrese stock:");
        int stock = teclado.nextInt();

        Movil celular = new Movil(tamanio,capacidad,precio,tipo,camara,stock);

        System.out.println(celular.getInfo());
    }
}
