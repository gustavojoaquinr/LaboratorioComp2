package Progi.Recup1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        IngreseNumeros();   //ejercicio 1

        Scanner s = new Scanner(System.in);
        int DNI=12345;
        String CONTRASENA="123";
        boolean ingreso = Usuario(DNI, CONTRASENA);   //ejercicio 2

        int[] A = new int [10];
        int[] B = new int [10];
        int[] C = new int [10];
        IngreseArreglos();

    }


    private static void IngreseNumeros() {
        Scanner s = new Scanner(System.in);
        int num= 0;
        int cont=0;
        int opc=0;
        int suma=0;

        do{
            System.out.println("Ingrese un numero entero:");
            num = s.nextInt();
            cont++;
            suma = suma + num;
            System.out.println("Para salir ingrese -1, de lo contrario ingrese otro numero");
            opc = s.nextInt();
        }while(opc != -1);

        System.out.printf("Cantidad de numeros ingresados: %d\n",cont);
        System.out.printf("Suma total de numeros ingresados: %d\n",suma);
        System.out.printf("Promedio se la suma de numeros ingresados: %d\n",suma/cont);
    }

    static public boolean Usuario(int DNI, String CONTRASENA) {
        Scanner s= new Scanner(System.in);

        boolean ingreso=false;

        for(int i=0; i<5; i++) {
            System.out.println("\nIngrese Usuario (numero de DNI): ");
            int dni = s.nextInt();
            System.out.println("Ingrese contraseña: ");
            String contra = s.next();

            if(dni==DNI && contra.equals(CONTRASENA)) {
                ingreso=true;
                System.out.println("USUARIO VALIDO");
                break;
            }else {
                System.out.println("El numero de usario o contraseña NO es valido");
                System.out.println("Vuelva a ingresar sus datos");
            }

        }

        return ingreso;
    }

    private static void IngreseArreglos() {
        Scanner s= new Scanner(System.in);

        System.out.println("\nIngrese elementos del Arreglo A");
        int[] ArregloA = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número en la posición " + (i + 1) + " :");
            ArregloA[i] = s.nextInt();
        }

        System.out.println("\nIngrese elementos del Arreglo B");
        int[] ArregloB = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número en la posición " + (i + 1) + " :");
            ArregloB[i] = s.nextInt();
        }

        System.out.println("\nArreglo A");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Poscion %d:%d\n",i,ArregloA[i]);
        }
        System.out.println("\nArreglo B");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Posicion %d:%d\n",i,ArregloB[i]);
        }

    }

}
