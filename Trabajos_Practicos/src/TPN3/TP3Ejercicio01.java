package TPN3;

import java.util.Random;

public class TP3Ejercicio01 {
    public static void main(String[] args) {

        int[] arreglo = new int[100];

        //Cargar el array utilizando numeros aleatorios sin repeticiones
        Random randomizer = new Random(System.nanoTime());
        for(int i=0; i < arreglo.length; i++) {
            arreglo[i]= randomizer.nextInt(arreglo.length);
        }

        //Mostrar el array
        for(int elemento:arreglo) {
            System.out.print(elemento+" ");
        }
    }
}
