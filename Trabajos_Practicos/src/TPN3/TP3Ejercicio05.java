package TPN3;

import java.util.Scanner;

public class TP3Ejercicio05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int [][] matriz = new int [3][3];

        //Cargar la matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese elemento para posicion[" + i + "][" + j + "]= ");
                matriz[i][j] = s.nextInt();
            }
        }

        System.out.println("\nMatriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }

            System.out.println("");
        }

        //Ordenar la matriz
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                for(int x=0; x<matriz.length; x++){
                    for(int y=0; y<matriz.length; y++){
                        if(matriz[i][j] > matriz [x][y]){
                            int aux = matriz[i][j];
                            matriz[i][j] = matriz[x][y];
                            matriz[x][y] = aux;
                        }
                    }
                }
            }
        }

        //Imprimir la matriz
        System.out.println("\nMatriz ordenada de mayor a menor:");
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz.length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
