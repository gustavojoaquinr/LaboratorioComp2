package Progi.Repaso;

public class Matrices {
    public static void main(String[] args) {

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
