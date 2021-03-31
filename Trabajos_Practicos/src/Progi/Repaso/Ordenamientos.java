package Progi.Repaso;

import java.util.Arrays;
import java.util.Scanner;

public class Ordenamientos {
    public static void main(String[] args) {
        burbuja();


        seleccion();
    }

    public static void burbuja() {

        int[] arreglo = new int[] { 5, 6, 1, 0, 3 };
        int aux = -1;

        for (int i = 1; i <= arreglo.length; i++) {
            for (int j=0 ; j< arreglo.length - 1; j++) {
                if (arreglo[j] > arreglo[j+1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
    }

    public static void insercion()
    {
        /* El bucle principal del ordenamiento por insercion va examinando sucesivamente todos
           los elementos del arreglo desde el segundo hasta el n-ésimo, e inserta cada uno en el
           lugar adecuado entre sus precedesores dentro del arreglo. */

        int[] arreglo = new int[] { 5, 6, 1, 0, 3 };
        int aux = -1;
        int j;

        for (int i = 1; i < arreglo.length; i++)
        {
            aux = arreglo[i];

            j = i - 1;

            while ((arreglo[j] > aux) && (j >= 0))
            {
                arreglo[j + 1] = arreglo[j];
                j--;
            }

            arreglo[j + 1] = aux;
        }
    }

    public static void seleccion()
    {
        /* El ordenamiento por selección funciona seleccionando el menor elemento del arreglo y
           llevandolo al principio; a continuacion selecciona el siguiente menor y lo pone en la
           segunda posicion del arreglo y asi sucesivamente. */

        int[] arreglo = new int[] { 5, 6, 1, 0, 3 };

        int i, j, k, p, buffer;

        for(k = 0; k < arreglo.length - 1; k++)
        {
            p = k;

            for(i = k + 1; i <= arreglo.length; i++)
            {
                if(arreglo[i] < arreglo[p])
                {
                    p = i;
                }
            }

            if(p != k)
            {
                buffer = arreglo[p];
                arreglo[p] = arreglo[k];
                arreglo[k] = buffer;
            }
        }
    }

    public static void ordenamientoConArrays() {
        Scanner sc = new Scanner (System.in);
        int n = 0;
        int a = 0;

        n = sc.nextInt();
        int arreglo [] = new int[n];
        int aux [] = new int [n];

        for (int i=0;i<arreglo.length;i++) {
            a = sc.nextInt();
            arreglo [i] = a;
        }

        Arrays.sort(arreglo);

        for (int i=0;i<arreglo.length; i++) {
            if (arreglo [i] < arreglo [i+1]){
                aux [i] = arreglo [i+1];
            }

        }

        for (int i=0;i<aux.length; i++) {
            System.out.println(aux [i]);

        }
    }
}

