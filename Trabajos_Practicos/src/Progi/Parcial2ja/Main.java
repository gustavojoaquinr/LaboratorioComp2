package Progi.Parcial2ja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        Persona22 p1 = new Persona22(); //Creacion del objeto
        int[] totales = new int[1000]; //arreglo de totales
        String seguir = "s";
        int i;

        //Cargar los atributos del nuevo objeto
        System.out.println("Ingrese su nombre:");
        p1.nombre = scan.next();
        System.out.println("Ingrese su apellido:");
        p1.apellido = scan.next();
        System.out.println("Ingrese su DNI:");
        p1.dni = scan.nextInt();
        System.out.println("Apellido y nombre: "+p1.obtenerNombre()); //Llamar al metodo del objeto para imprimir el nombre completo
        p1.Visitante(); //Llamar al metodo para saber si el usuario ya esta registrado y registrarlo de no ser asi.


        System.out.println();
        Encuesta(); //Llamar al metodo para hacer la encuesta
        System.out.println();



        System.out.println("Totales generales del dia: ");
        i = 0;

        do {
            //Cargar el arreglo de totales mientras el usuario quiera seguir ingresando datos.
            System.out.println("Ingresar el total general: ");
            totales[i] = scan.nextInt();
            i++;

            System.out.println("Seguir ingresando totales (s/n): ");
            seguir = scan.next();

        } while (seguir.equals("s") && i<1000);

        System.out.println();
        System.out.println("Arreglo final ordenado y sin ceros:");

        Ordenar_Imprimir(totales); //Llamar al metodo para ordenar e imprimir



    }

    static void Encuesta (){

        Scanner scan = new Scanner (System.in);
        String[] areas = {"Diversion","Calidad","Precio","Atencion"}; //Arreglo con los nombres de las distintas areas a evaluar
        String[] atracciones = {"A1","A2","A3"}; //Arreglo con los nombres de las atracciones.

        int nota;

        int[][] calificaciones = new int[areas.length+1][atracciones.length]; //Creacion de la matriz con fila extra para los totales de cada columna (atracciones)

        for (int i = 0; i < areas.length; i++) {
            for (int j = 0; j < atracciones.length; j++) {
                System.out.println("Ingresar nota de "+areas[i]+" para la atraccion "+atracciones[j]+"(del 1 al 10):");
                nota = scan.nextInt();
                calificaciones[i][j] += nota;
                calificaciones[4][j] += nota; //Fila que almacena los totales de cada atraccion
            }
        }
        System.out.println();

        System.out.println("Matriz:");
        //Imprimir la matriz
        for (int i = 0; i < calificaciones.length; i++) {
            for (int j = 0; j < calificaciones[i].length; j++) {
                System.out.print(calificaciones[i][j]+ "  ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Totales:");
        //Imprimir el total de cada atraccion
        for (int i = 0; i < atracciones.length; i++) {
            System.out.println("Total nota de "+atracciones[i]+": "+calificaciones[4][i]);
        }

    }

    static void Ordenar_Imprimir (int array[]){ //Metodo para ordenar e imprimir


        int aux = 0;

        //Metodo burbuja para ordenar
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] < array[j+1]) {
                    aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        }

        //Imprime el arreglo, si la posicion equivale a 0 no se imprime.
        for (int j = 0; j < array.length; j++) {

            if (array[j] == 0) continue; //Continuar si es cero

            System.out.print(array[j]+ "  ");
        }

    }

}