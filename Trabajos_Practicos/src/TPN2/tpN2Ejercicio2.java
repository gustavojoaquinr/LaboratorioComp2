package TPN2;

import java.util.Scanner;

public class tpN2Ejercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int array2[] = new int[10];
        int i;
        int pares = 0;
        int media = 0;


        for (i = 0; i < 10; i++) {
            System.out.print("Ingrese elemento para posicion[" + i + "]= ");
            array2[i] = s.nextInt();
        }

        for (i = 0; i < array2.length; i++) {
            if (i % 2 == 0 && i != 0) {
                media += array2[i];
                pares++;
            }
        }
        System.out.println(" ");
        System.out.println("Media de los numeros introducidos en posiciones pares: "+ media/pares);
    }
}
