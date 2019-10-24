package Repaso.Rep1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //con metodo void
        Operacion op1 = new Operacion();

        op1.leerNumeros();
        op1.sumar();
        op1.restar();
        op1.multiplicar();
        op1.mostrar();

        //con metodo return
        Operacion2 op2 = new Operacion2();

        Scanner sc = new Scanner(System.in);
        System.out.println("\nIngrese el primer numero: ");
        int a = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int b = sc.nextInt();

        System.out.println("\nLa suma es: "+op2.sumar(a,b));
        System.out.println("La resta es: "+op2.restar(a,b));
        System.out.println("La multiplicacion es: "+op2.multiplicar(a,b));

        //con return segunda forma

        int suma = op2.sumar(a,b);
        int resta = op2.restar(a,b);
        int multiplicacion = op2.multiplicar(a,b);

        op2.mostrar(suma,resta,multiplicacion);
    }
}
