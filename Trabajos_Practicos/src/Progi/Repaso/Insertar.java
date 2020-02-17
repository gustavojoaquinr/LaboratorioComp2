package Progi.Repaso;

import java.util.Scanner;

public class Insertar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arreglo[] = new int [10];
        boolean creciente = true;

        System.out.println("Llenar el arreglo");

        do{
            for (int i=0; i<5; i++ ){
                System.out.println((i+1)+". Digite un numero");
                arreglo[i] = sc.nextInt();
            }

            //Comprobar si esta en orden creciente
            for (int i=0; i<4; i++){
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

        }while(creciente = false);

        int numero, sitioNum=0, j=0;
        System.out.println("\nDigite un elemento a insertar: ");
        numero = sc.nextInt();

        //Esto es para darnos cuenta en que posicion va el numero
        while (arreglo[j] < numero && j<5){
            sitioNum++;
            j++;
        }

        //Trasladamos una posicion en el arreglo a los elementos que van detras de numero
        for (int i = 4; i>=sitioNum; i--){
            arreglo[i+1] = arreglo[i];
        }

        //Insertamos el numero
        arreglo[sitioNum] = numero;

        System.out.println("\nEl arreglo queda: ");
        for (int i= 0; i<6; i++){
            System.out.print(arreglo[i]+ " - ");
        }
        System.out.println();
    }
}
