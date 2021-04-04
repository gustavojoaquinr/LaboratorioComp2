package RPractica;

import java.util.Scanner;

public class OpMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite un numero: ");
        int n1 = sc.nextInt();
        System.out.print("Digite otro numero: ");
        int n2 = sc.nextInt();

        Operacion op = new Operacion();

        op.sumar(n1,n2);
        op.restar(n1,n2);

        op.MostrarResultados();

        int suma = op.sumar2(5,4);//n1,n2
        int resta = op.restar2(5,9);//n1,n2

        String saludo = op.saludar("Joaquin");
        System.out.println(saludo);

        System.out.println("La suma es: "+op.sumar2(n1,n2));
        op.MostrarResultados2(suma,resta);


    }
}

