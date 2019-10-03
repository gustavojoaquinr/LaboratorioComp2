package Depuracion;

import java.util.Scanner;

public class ParaDepurar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();

        System.out.println("Ingrese segundo numero para dividir: ");
        int num2 = sc.nextInt();

        System.out.println("Ingrese tercer numero para multiplicar");
        int num3 = sc.nextInt();

        System.out.println("\nLa divison de "+num+" y "+num2+" multiplicado por "+num3+" es: " +num/num2*num3);
    }
}