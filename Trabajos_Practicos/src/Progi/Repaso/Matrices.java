package Progi.Repaso;

import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        int matriz [][] = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0; i<3; i++){//numero filas
            for(int j=0; j<3; j++){//numero columnas
                System.out.println(matriz[i][j]);
            }
            System.out.println("");
        }

        Scanner s = new Scanner(System.in);
        int matriz2 [][], nFilas, nCol;

        System.out.println("Digite numero de filas");
        nFilas = s.nextInt();
        System.out.println("Digite numero de columnas");
        nCol = s.nextInt();

        matriz2 = new int[nFilas][nCol];

        System.out.println("Digite la matriz: ");
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nCol; j++){
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz2[i][j] = s.nextInt();
            }
        }
        System.out.println("\nMATRIZ: ");
        for(int i=0; i<nFilas; i++){//numero filas
            for(int j=0; j<nCol; j++){//numero columnas
                System.out.print(matriz2[i][j]);
            }
            System.out.println("");
        }


        // definicion de matriz
        int[][] matriz1 = new int[4][7];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                matriz1[i][j] = i * j;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz1[i][j] + " |");
            }
            System.out.println(" ");
        }

        // Definicion de matrices con vectores
        int[] v1 = {1, 2, 3, 4};
        int[][] m1 = {{1, 2, 3},{1,3,4,3},{3,1,1,1}};


        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                System.out.print(m1[i][j] + " |");
            }
            System.out.println(" ");
        }

        // Carga los dias
        String[] dias = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        // Carga los medicamentos
        String[] medicamentos = { "Bayaspirina", "Tafirol", "Cofron", "Ibupirac"};

        // Carga una matrix de valores
        int[][] cantidades = new int[medicamentos.length][dias.length];

        for (int i = 0; i < medicamentos.length; i++) {
            for (int j = 0; j < dias.length; j++) {
                cantidades[i][j] = i * j;
            }
        }

        // Imprime el resultado
        System.out.print("              ");

        for (int i = 0; i < dias.length; i++) {
            System.out.print(dias[i] + "| ");
        }

        System.out.println(" ");

        for (int i = 0; i < medicamentos.length; i++) {

            System.out.print(medicamentos[i] + " ");

            for (int j = 0; j < dias.length; j++) {

                System.out.print("| " + cantidades[i][j] + " | ");
            }

            System.out.println(" ");
        }
    }
}
