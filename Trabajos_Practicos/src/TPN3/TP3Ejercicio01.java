package TPN3;

public class TP3Ejercicio01 {
    public static void main(String[] args) {

        int[] array = new int[100];

        //Cargar el array utilizando metodo random() de la clase Math
        for(int i=0; i<100; i++) {
            array[i]=(int)(Math.random()*100);
        }

        //Imprimir el array
        System.out.println("Array con numeros aleatorios entre 1 y 100:");
        for(int elemento:array) {
            System.out.print(elemento+" ");
        }
    }
}
