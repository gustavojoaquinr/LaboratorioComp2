package TPN9.Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int natural=0, opc=0;
        double a=0, b=0;

        System.out.println("Ingrese la cantidad de numeros que desea crear:");
        int cant = sc.nextInt();
        Numero [] array = new Numero[cant];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Numero " + (i + 1));
            System.out.println("Que numero desea crear? 1-Natural 2-Complejo");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    do {
                        System.out.println("Numero Natural");
                        natural = sc.nextInt();
                        if (natural < 0) {
                            System.out.println("Error, Ingrese nuevamente");
                        }
                    }while (natural < 1);
                    array[i] = new Natural(natural);break;
                case 2:
                    System.out.println("Numero complejo");
                    System.out.println("Ingrese el primer termino");
                    a = sc.nextDouble();
                    System.out.println("Ingrese el segundo termino");
                    b = sc.nextDouble();
                    array[i] = new Complejo(a, b);break;
                default:
                    System.out.println("Error, ingrese nuevamente\n");
                    i--;break;
            }
        }

        Menu.Opciones(array);
        Menu.Operaciones(array);

    }
}
