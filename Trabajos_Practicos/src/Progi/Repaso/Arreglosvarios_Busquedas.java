package Progi.Repaso;

public class Arreglosvarios_Busquedas {
    public static void main(String[] args) {
        // define un arreglo
        int[] arregloDesordenado = new int[] { 1, 12, 44, 56, 3, 67, 5, 7, 0, 99};
        int[] arregloOrdenado = new int[] { 0, 1, 3, 5, 7, 12, 44, 56, 67, 99};

        // define el valor a buscar
        int valor = 12;

        // Busqueda Lineal
        int resultado;

        resultado = busquedaLineal(arregloDesordenado, valor);

        System.out.println("Resultado búsqueda lineal: " + resultado);

        resultado = busquedaLinealCentinela(arregloDesordenado, valor);

        System.out.println("Resultado búsqueda lineal con centinela: " + resultado);

        resultado = busquedaBinaria(arregloOrdenado, valor);

        System.out.println("Resultado búsqueda binaria: " + resultado);
    }

    private static int busquedaLineal(int[] arreglo, int valor) {

        int i = 0;
        int pos = -1;

        while(i < arreglo.length) {
            if (arreglo[i] == valor) {
                pos = i;
            }
            i++;
        }

        return pos;
    }

    private static int busquedaLinealCentinela(int[] arreglo, int valor) {

        int i = 0;

        while(i < arreglo.length && arreglo[i] != valor) {
            i++;
        }

        if (i < arreglo.length)
            return i;

        return -1;
    }



    private static int busquedaBinaria(int[] arreglo, int valor) {
        int min = 0;
        int max = arreglo.length - 1;
        int medio = 0;

        boolean encontrado = false;

        while (min <= max && !encontrado)
        {
            medio = (min + max) / 2;
            if (arreglo[medio] == valor)
                encontrado = true;
            else
            {
                if (arreglo[medio] > valor)
                    max = medio - 1;
                else
                    min = medio + 1;
            }
        }
        if (!encontrado)
            return -1;

        return medio;
    }
}
