package TPN3;

public class TP3Ejercicio04 {
    public static void main(String[] args) {

        int[][] matriz = new int [3][3];

        //Cargar la matriz con numeros aleatorios
        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz.length; j++) {
                matriz[i][j]=(int)(Math.random()*100);
            }
        }

        System.out.println("Matriz 3x3 con numeros al azar:");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3;j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }

        //Ordenar la matriz
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                for(int x=0; x<matriz.length; x++){
                  for(int y=0; y<matriz.length; y++){
                      if(matriz[i][j] < matriz [x][y]){
                          int aux = matriz[i][j];
                          matriz[i][j] = matriz[x][y];
                          matriz[x][y] = aux;
                      }
                  }
                }
            }
        }

        //Imprimir la matriz
        System.out.println("\nMatriz ordenada de menor a mayor:");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matriz[i][j]+" ");
          }
            System.out.println(" ");
        }


    }
}
