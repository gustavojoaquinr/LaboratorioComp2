package TPN7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num=0;
        boolean a = false;

        do {
            try {
                System.out.println("Ingrese un número: ");
                num = sc.nextInt();
                a = true;
            }catch (InputMismatchException e) {
                sc = new Scanner (System.in);
                System.out.println("El valor introducido no es númerico\n");
            }
        }while (!a);

        if (num % 2 == 0) {
            System.out.println("El número ingresado es par");
        }else {
            System.out.println("El número ingresado es impar");
        }
    }
}
