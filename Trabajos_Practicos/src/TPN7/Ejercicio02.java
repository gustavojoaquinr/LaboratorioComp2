package TPN7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        try{
            pedirNumero();
        }catch (InputMismatchException e){
            System.out.println("El valor introducido no es numérico");
        }

    }

    public static void pedirNumero() throws FueradeRango{
        Scanner sc = new Scanner(System.in);
        int num=0;
        System.out.println("Ingrese un numero entre 1 y 100: ");
        num = sc.nextInt();
        if (num < 1 || num > 100){
            throw new FueradeRango("El nº está fuera de rango");
        }
        else{
            System.out.println("El numero ingresado es correcto");
        }
    }
}
