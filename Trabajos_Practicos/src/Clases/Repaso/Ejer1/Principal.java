package Clases.Repaso.Ejer1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creamos el objeto pero sin inicializar el constructor
        Cuadrilatero c1;

        float lado1, lado2;
        System.out.println("Ingrese lado1: ");
        lado1 = sc.nextFloat();
        System.out.println("Ingrese lado2: ");
        lado2 = sc.nextFloat();

        if (lado1 == lado2){
            System.out.println("\nEs un cuadraro\n");
            c1 = new Cuadrilatero(lado1);

        } else{
            System.out.println("\nEs un rectangulo\n");
            c1 = new Cuadrilatero(lado1, lado2);
        }

        System.out.println("El perimetro es: "+c1.perimetro());
        System.out.println("El area es: "+c1.area());
    }
}
