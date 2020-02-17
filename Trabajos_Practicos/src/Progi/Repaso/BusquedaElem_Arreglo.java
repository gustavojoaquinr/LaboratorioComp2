package Progi.Repaso;

import java.util.Scanner;

public class BusquedaElem_Arreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int [] arreglo = new int[10];
        boolean creciente = true;
        do{
            System.out.println("Relleno el arreglo: ");
            for(int i=0; i<10; i++){
                System.out.print(i+". Digite un numero: ");
                arreglo[i] = sc.nextInt();
            }
            //Comprobar si esta en orden creciente
            for (int i=0; i<9; i++){
                if (arreglo[i] < arreglo[i+1]){
                    creciente = true;
                }

                if (arreglo[i] > arreglo[i+1]){
                    creciente = false;
                    break;
                }
            }

            if (creciente == false){
                System.out.println("\nEl arreglo no esta ordenado de forma creciente, vuelva a digitar:\n");
            }

        }while(creciente == false);

        System.out.println("\nDigite el numero a buscar: ");
        numero = sc.nextInt();

        //Buscar el numero en el arreglo
        int i=0;
        while(i<10 && arreglo[i]<numero){
            i++;
        }

        if(i==10){
            System.out.println("\nNumero no encontrado");

        } else{
            if (arreglo[i] == numero){
                System.out.println("\nNumero encontrado, en la posicion "+i);
            }
            else {
                System.out.println("\nNumero no encontrado ");
            }
        }

    }

}
