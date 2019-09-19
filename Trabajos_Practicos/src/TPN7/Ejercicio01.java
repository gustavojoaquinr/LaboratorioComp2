package TPN7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0;
        System.out.println("Ingrese un numero: ");

        try{
            num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println("El numero ingresado es par");
            } else {
                System.out.println("El numero ingresado es impar");
            }
        }catch(InputMismatchException e){
            System.out.println("El valor introducido no es numérico. El programa se cerrará");
        }
    }
}
