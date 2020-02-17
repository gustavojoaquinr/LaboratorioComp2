package Progi.Repaso;

import java.util.Scanner;

public class OrdenamientoInsercion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aux = 0, pos=0;
        System.out.println("Digite la cantidad de elementos del arreglo: ");
        int nElem = sc.nextInt();

        int[] arreglo = new int [nElem];
        for (int i=0; i<nElem; i++){
            System.out.print((i+1)+" - Digite un numero: ");
            arreglo[i]= sc.nextInt();
        }

        for(int i=0; i<nElem; i++){
            pos = i;
            aux = arreglo[i];

            while((pos>0) && (arreglo[pos-1] > aux)){
                arreglo[pos] = arreglo[pos-1];
                pos--;
            }
            arreglo[pos] = aux;
        }

        System.out.println("\nOrden Ascendente: ");
        for(int i=0; i<nElem; i++){
            System.out.print(arreglo[i]+" - ");
        }

        System.out.println("\nOrden Descendente: ");
        for(int i=(nElem-1); i>=0; i--){
            System.out.print(arreglo[i]+" - ");
        }
    }
}
