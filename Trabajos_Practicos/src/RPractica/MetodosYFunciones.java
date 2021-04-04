package RPractica;

import java.util.Scanner;

public class MetodosYFunciones {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here

        int a;
        int b;
        int suma;

        p("Ingrese un valor entero:");

        //a = s.nextInt();
        a = i();

        p("Ingrese un valor entero:");

        //b = s.nextInt();
        b = i();

        // suma = a + b;
        suma = obtenerSuma(a, b);

        p("El resultado de la suma es: " + suma);

        suma = obtenerSuma(a + 10, b + 20);

        p("El resultado de la suma es: " + suma);
    }

    static int obtenerSuma(int valor1, int valor2)
    {
        int suma = 0;

        suma = valor1 + valor2;

        return suma;
    }

    static int p(String texto)
    {
        System.out.println(texto);

        return 0;
    }

    static int i()
    {
        int valor = s.nextInt();

        return valor;
    }
}
