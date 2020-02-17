package Progi.Repaso;

import java.util.Scanner;

public class Burbuja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aux = 0;
        System.out.println("Digite la cantidad de elementos del arreglo: ");
        int nElem = sc.nextInt();

        int[] arreglo = new int [nElem];

        for (int i=0; i<nElem; i++){
            System.out.print((i+1)+" - Digite un numero: ");
            arreglo[i]= sc.nextInt();
        }

        for (int i = 1; i < (arreglo.length - 1); i++) {
            for (int j=0 ; j< (arreglo.length - 1); j++) {
                if (arreglo[j] > arreglo[j+1]){
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j + 1] = aux;
                }
            }
        }

        System.out.println("\nArreglo ordenado de forma creciente");
        for(int i=0; i< nElem; i++){
            System.out.print(arreglo[i]+" - ");
        }

        System.out.println("\nArreglo ordenado de forma decreciente");
        for(int i=(nElem-1); i>=0; i--){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println(" ");

    }
}
