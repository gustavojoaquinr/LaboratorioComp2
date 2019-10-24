package Repaso.Rep1;

import java.util.Scanner;

public class Operacion {
    int num1;
    int num2;
    int suma;
    int resta;
    int multi;

    public void leerNumeros(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextInt();
    }

    public void sumar(){
        suma = num1 + num2;
    }

    public void restar(){
        resta = num1 - num2;
    }

    public void multiplicar(){
        multi = num1 * num2;
    }

    public void mostrar(){
        System.out.println("\nLa suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multi);
    }
}
