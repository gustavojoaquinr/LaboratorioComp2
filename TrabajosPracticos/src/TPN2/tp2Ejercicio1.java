package TPN2;

import java.util.Scanner;

public class tp2Ejercicio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int array []= new int[10];
        int i; int pos=0; int neg=0; int cero=0;

        System.out.println("Array");
        for(i=0; i<10; i++) {
            System.out.println("Ingrese elemento para la posición:"+i);
            array[i]=s.nextInt();
        }

        for(i = 0; i < array.length; i++) {
            if(array[i]>0) {
                pos++;
            }else {
                if(array[i]<0) {
                    neg++;
                }else {
                    cero++;
                }
            }
        }

        System.out.println("Numeros Positivos: " + pos);
        System.out.println("Numeros Negativos: " + neg);
        System.out.println("Valores Ceros: " + cero);
    }
}
