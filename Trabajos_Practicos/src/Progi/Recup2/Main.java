package Progi.Recup2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner (System.in);
        int i=0;
        Productos p1 = new Productos();

        System.out.println("SPORT\n");

        RegistroVentas();//Llamar al metodo para hacer el registro

        CantidadStock();//Llamar al metodo para cargar atributos y mostrar resultados

    }


    static void RegistroVentas(){
        Scanner s = new Scanner (System.in);
        String [] sucursales = {"S1","S2","S3","S4","S5"};
        String [] dias = {"lunes","martes","miercoles","jueves","viernes","sabado"};
        int ventas;
        int totalgral=0;
        int[][] total = new int[sucursales.length+1][dias.length+1]; //Creacion de la matriz con filas y columnas extra para los totales

        for (int i = 0; i < sucursales.length; i++) {
            for (int j = 0; j < dias.length; j++) {
                System.out.println("Ingresar venta de "+sucursales[i]+" para el dia "+dias[j]+":");
                ventas = s.nextInt();
                total[i][j] += ventas;
                total[5][j] += ventas;
                total[i][6] += ventas;
                totalgral += ventas;
            }
        }

        System.out.println();

        //Imprimir la matriz
        System.out.println("Matriz:");
        for (int i = 0; i < total.length; i++) {
            for (int j = 0; j < total[i].length; j++) {
                System.out.print(total[i][j]+ "  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("TOTALES POR DIA:");
        for (int i = 0; i < dias.length; i++) {
            System.out.println("Total ventas dia "+dias[i]+": "+total[5][i]);
        }
        System.out.println();
        System.out.println("TOTALES POR SUCURSALES:");
        for (int j = 0; j < sucursales.length; j++) {
            System.out.println("Total ventas de "+sucursales[j]+": "+total[j][6]);
        }
        System.out.println(" ");
        System.out.printf("Total general de ventas de todas las sucursales: %d",totalgral);
        System.out.println(" ");

    }

    private static void CantidadStock() {
        Scanner s = new Scanner (System.in);
        Productos p1 = new Productos();
        int totalv= 0;
        //Cargar los atributos de objeto
        System.out.println();
        System.out.println("Ingrese nombre del producto:");
        p1.nombre = s.next();
        System.out.println("Ingrese origen del producto:");
        p1.origen = s.next();
        System.out.println("Ingrese valor unitario del producto:");
        p1.ValorUnitario = s.nextInt();
        System.out.println("Ingrese Cantidad de Stock:");
        p1.stock = s.nextInt();
        System.out.println("Ingrese Cantidad vendida del producto:");
        p1.CantidadVendida = s.nextInt();
        if (p1.stock >= p1.CantidadVendida){
            System.out.println("Cantidad en Stock");
            totalv = p1.ValorUnitario*p1.CantidadVendida;
            System.out.printf("TOTAL VENTA: %d",totalv);
        }
        else {
            System.out.println("Cantidad en Stock es menor a la cantidad vendida");
        }

    }
}

/*  Ejercicio 4:
a)¿Qué se necesita crear en el disco para almacenar información del Sistema?
Se necesita crear una clase Scanner.

b)¿Cómo se almacena y organiza la información dentro del medio descrito en el punto 1?
La informacion se alamacena y organiza en el metodo "RegistroVentas" que es llamado en el metodo principal (MAIN) para su correcta funcion.

c)¿Qué tipo de operaciones se pueden realizar sobre el medio descrito en el punto 1?
Se pueden realizar operaciones algoritmicas de muchos tipos para simplificar la resolucion de los problemas. Los valores pueden ser pasados por "Referencia" o por "Valor".

d)¿Existe forma de optimizar el medio descrito en el Punto 1?
Si existe. Siempre es posible optimizar el programa de la mejor manera posible.
* */